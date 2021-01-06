package com.example.recipeapp.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.recipeapp.model.Recipe
import com.example.recipeapp.model.RecipeDatabase
import kotlinx.coroutines.launch

class DetailViewModel(application: Application): BaseViewModel(application) {

    val recipeLiveData = MutableLiveData<Recipe>()

    fun fetch(uuid: Int) {
        launch {
            val recipe = RecipeDatabase(getApplication()).recipeDao().getRecipe(uuid)
            recipeLiveData.value = recipe
        }
    }
}