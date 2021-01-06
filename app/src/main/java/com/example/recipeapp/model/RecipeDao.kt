package com.example.recipeapp.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface RecipeDao {

    @Insert
    suspend fun inserAll(vararg recipes: Recipe): List<Long>

    @Query("SELECT * FROM recipe")
    suspend fun getAllRecipes(): List<Recipe>

    @Query("SELECT * FROM recipe WHERE uuid = :recipeId")
    suspend fun getRecipe(recipeId: Int): Recipe

    @Query("DELETE FROM recipe")
    suspend fun deleteAllRecipes()

}