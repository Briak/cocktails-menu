package com.briak.cocktailsmenu.domain.cocktails

data class CocktailModel(
    val id: String,
    val name: String?,
    val category: String?,
    val glass: String?,
    val instructions: String?,
    val iconUrl: String?,
    val ingredients: List<IngredientModel>?,
)
