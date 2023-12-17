package com.briak.cocktailsmenu.data.network.response

import com.briak.cocktailsmenu.data.network.dto.CocktailDto
import com.google.gson.annotations.SerializedName

data class CocktailsResponse(
    @SerializedName("drinks") val cocktails: List<CocktailDto>?,
)
