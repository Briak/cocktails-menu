package com.briak.cocktailsmenu.data.network.dto

import com.google.gson.annotations.SerializedName

data class CocktailDto(
    @SerializedName("idDrink") val id: String,
    @SerializedName("strDrink") val name: String?,
    @SerializedName("strCategory") val category: String?,
    @SerializedName("strGlass") val glass: String?,
    @SerializedName("strInstructions") val instructions: String?,
    @SerializedName("strDrinkThumb") val iconUrl: String?,
)
