package com.example.recipeapp.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.recipeapp.model.Recipe
import com.example.recipeapp.model.RecipeDatabase
import com.example.recipeapp.model.RecipesApiService
import com.example.recipeapp.util.SharedPreferencesHelper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.launch
import java.lang.NumberFormatException

class ListViewModel(application: Application): BaseViewModel(application) {

    private var prefHelper = SharedPreferencesHelper(getApplication())
    private var refreshTime = 5 * 60 * 1000 * 1000 * 1000L

    private val recipesService = RecipesApiService()
    private val disposable = CompositeDisposable()

    val recipes = MutableLiveData<List<Recipe>>()
    val recipesLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh(){
        checkCacheDuration()
        val updateTime = prefHelper.getUpdateTime()
        if(updateTime != null && updateTime != 0L && System.nanoTime() - updateTime < refreshTime) {
            fetchFromDatabase()
        } else {
            fetchFromRemote()
        }
    }

    private fun checkCacheDuration() {
        val cachePreference = prefHelper.getCacheDuration()

        try {
            val cachePreferenceInt = cachePreference?.toInt() ?: 5 * 60
            refreshTime = cachePreferenceInt.times(1000 * 1000 * 1000L)
        } catch (e: NumberFormatException) {
            e.printStackTrace()
        }
    }

    fun refreshBypassCache() {
        fetchFromRemote()
    }

    private fun fetchFromDatabase(){
        loading.value = true
        launch {
            val recipes = RecipeDatabase(getApplication()).recipeDao().getAllRecipes()
            recipesRetrieved(recipes)
        }
    }

    private fun fetchFromRemote() {
        loading.value = true
        disposable.add(
            recipesService.getRecipes()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object: DisposableSingleObserver<List<Recipe>>() {

                    override fun onSuccess(recipeList: List<Recipe>) {
                        storeRecipesLocally(recipeList)
                    }

                    override fun onError(e: Throwable) {
                        recipesLoadError.value = true
                        loading.value = false
                        e.printStackTrace()
                    }
                })
        )
    }

    private fun recipesRetrieved(recipeList: List<Recipe>) {
        recipes.value = recipeList
        recipesLoadError.value = false
        loading.value = false
    }

    private fun storeRecipesLocally(recipeList: List<Recipe>) {
        launch {
            val dao = RecipeDatabase(getApplication()).recipeDao()
            dao.deleteAllRecipes()
            val result = dao.inserAll(*recipeList.toTypedArray())
            var i = 0
            while (i < recipeList.size) {
                recipeList[i].uuid = result[i].toInt()
                ++i
            }
            recipesRetrieved(recipeList)
        }
        prefHelper.saveUpdateTime(System.nanoTime())
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}