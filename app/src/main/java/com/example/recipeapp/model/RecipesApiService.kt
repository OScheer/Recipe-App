package com.example.recipeapp.model

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RecipesApiService {

    private val BASE_URL = "https://www.themealdb.com/"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(RecipesApi::class.java)

    fun getRecipes(): Single<List<Recipe>> {
        return api.getRecipes()
    }
}