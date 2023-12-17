package com.briak.cocktailsmenu.data.network.response

import com.briak.cocktailsmenu.data.network.dto.CategoryDto
import com.google.gson.annotations.SerializedName

data class CategoriesResponse(
    @SerializedName("drinks") val categories: List<CategoryDto>?,
)
