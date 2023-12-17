package com.briak.cocktailsmenu.data.network.dto

import com.google.gson.annotations.SerializedName

data class CategoryDto(
    @SerializedName("strCategory") val name: String,
)
