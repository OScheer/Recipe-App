package com.example.recipeapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Recipe(
    @ColumnInfo(name = "recipe_id")
    @SerializedName("idMeal")
    val recipeId: String?,

    @ColumnInfo(name = "recipe_name")
    @SerializedName("strMeal")
    val recipeName: String?,

    @ColumnInfo(name = "recipe_category")
    @SerializedName("strCategory")
    val recipeCategory: String?,

    @ColumnInfo(name = "recipe_area")
    @SerializedName("strArea")
    val recipeFromArea: String?,

    @ColumnInfo(name = "recipe_instructions")
    @SerializedName("strInstructions")
    val recipeInstrucitons: String?,

    @ColumnInfo(name = "recipe_image_url")
    @SerializedName("strMealThumb")
    val recipePictureUrl: String?,

    @ColumnInfo(name = "recipe_video_url")
    @SerializedName("strYoutube")
    val recipeVideoUrl:String?,

    @ColumnInfo(name = "recipe_source_url")
    @SerializedName("strSource")
    val recipeSourceUrl: String?,

    @ColumnInfo(name = "recipe_ingredient1")
    @SerializedName("strIngredient1")
    val recipeIngredient1: String?,

    @ColumnInfo(name = "recipe_ingredient2")
    @SerializedName("strIngredient2")
    val recipeIngredient2: String?,

    @ColumnInfo(name = "recipe_ingredient3")
    @SerializedName("strIngredient3")
    val recipeIngredient3: String?,

    @ColumnInfo(name = "recipe_ingredient4")
    @SerializedName("strIngredient4")
    val recipeIngredient4: String?,

    @ColumnInfo(name = "recipe_ingredient5")
    @SerializedName("strIngredient5")
    val recipeIngredient5: String?,

    @ColumnInfo(name = "recipe_ingredient6")
    @SerializedName("strIngredient6")
    val recipeIngredient6: String?,

    @ColumnInfo(name = "recipe_ingredient7")
    @SerializedName("strIngredient7")
    val recipeIngredient7: String?,

    @ColumnInfo(name = "recipe_ingredient8")
    @SerializedName("strIngredient8")
    val recipeIngredient8: String?,

    @ColumnInfo(name = "recipe_ingredient9")
    @SerializedName("strIngredient9")
    val recipeIngredient9: String?,

    @ColumnInfo(name = "recipe_ingredient10")
    @SerializedName("strIngredient10")
    val recipeIngredient10: String?,

    @ColumnInfo(name = "recipe_ingredient11")
    @SerializedName("strIngredient11")
    val recipeIngredient11: String?,

    @ColumnInfo(name = "recipe_ingredient12")
    @SerializedName("strIngredient12")
    val recipeIngredient12: String?,

    @ColumnInfo(name = "recipe_ingredient13")
    @SerializedName("strIngredient13")
    val recipeIngredient13: String?,

    @ColumnInfo(name = "recipe_ingredient14")
    @SerializedName("strIngredient14")
    val recipeIngredient14: String?,

    @ColumnInfo(name = "recipe_ingredient15")
    @SerializedName("strIngredient15")
    val recipeIngredient15: String?,

    @ColumnInfo(name = "recipe_ingredient16")
    @SerializedName("strIngredient16")
    val recipeIngredient16: String?,

    @ColumnInfo(name = "recipe_ingredient17")
    @SerializedName("strIngredient17")
    val recipeIngredient17: String?,

    @ColumnInfo(name = "recipe_ingredient18")
    @SerializedName("strIngredient18")
    val recipeIngredient18: String?,

    @ColumnInfo(name = "recipe_ingredient19")
    @SerializedName("strIngredient19")
    val recipeIngredient19: String?,

    @ColumnInfo(name = "recipe_ingredient20")
    @SerializedName("strIngredient20")
    val recipeIngredient20: String?,

    @ColumnInfo(name = "recipe_measure1")
    @SerializedName("strMeasure1")
    val recipeMeasure1: String?,

    @ColumnInfo(name = "recipe_measure2")
    @SerializedName("strMeasure2")
    val recipeMeasure2: String?,

    @ColumnInfo(name = "recipe_measure3")
    @SerializedName("strMeasure3")
    val recipeMeasure3: String?,

    @ColumnInfo(name = "recipe_measure4")
    @SerializedName("strMeasure4")
    val recipeMeasure4: String?,

    @ColumnInfo(name = "recipe_measure5")
    @SerializedName("strMeasure5")
    val recipeMeasure5: String?,

    @ColumnInfo(name = "recipe_measure6")
    @SerializedName("strMeasure6")
    val recipeMeasure6: String?,

    @ColumnInfo(name = "recipe_measure7")
    @SerializedName("strMeasure7")
    val recipeMeasure7: String?,

    @ColumnInfo(name = "recipe_measure8")
    @SerializedName("strMeasure8")
    val recipeMeasure8: String?,

    @ColumnInfo(name = "recipe_measure9")
    @SerializedName("strMeasure9")
    val recipeMeasure9: String?,

    @ColumnInfo(name = "recipe_measure10")
    @SerializedName("strMeasure10")
    val recipeMeasure10: String?,

    @ColumnInfo(name = "recipe_measure11")
    @SerializedName("strMeasure11")
    val recipeMeasure11: String?,

    @ColumnInfo(name = "recipe_measure12")
    @SerializedName("strMeasure12")
    val recipeMeasure12: String?,

    @ColumnInfo(name = "recipe_measure13")
    @SerializedName("strMeasure13")
    val recipeMeasure13: String?,

    @ColumnInfo(name = "recipe_measure14")
    @SerializedName("strMeasure14")
    val recipeMeasure14: String?,

    @ColumnInfo(name = "recipe_measure15")
    @SerializedName("strMeasure15")
    val recipeMeasure15: String?,

    @ColumnInfo(name = "recipe_measure16")
    @SerializedName("strMeasure16")
    val recipeMeasure16: String?,

    @ColumnInfo(name = "recipe_measure17")
    @SerializedName("strMeasure17")
    val recipeMeasure17: String?,

    @ColumnInfo(name = "recipe_measure18")
    @SerializedName("strMeasure18")
    val recipeMeasure18: String?,

    @ColumnInfo(name = "recipe_measure19")
    @SerializedName("strMeasure19")
    val recipeMeasure19: String?,

    @ColumnInfo(name = "recipe_measure20")
    @SerializedName("strMeasure20")
    val recipeMeasure20: String?
) {
    @PrimaryKey(autoGenerate = true)
    var uuid: Int = 0
}