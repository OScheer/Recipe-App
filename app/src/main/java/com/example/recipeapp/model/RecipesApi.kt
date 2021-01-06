package com.example.recipeapp.model

import io.reactivex.Single
import retrofit2.http.GET

interface RecipesApi {
    @GET("api/json/v1/1/random.php")
    fun getRecipes(): Single<List<Recipe>>
}