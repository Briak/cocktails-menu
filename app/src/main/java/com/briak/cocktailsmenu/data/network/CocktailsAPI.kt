package com.briak.cocktailsmenu.data.network

import com.briak.cocktailsmenu.data.network.response.CategoriesResponse
import com.briak.cocktailsmenu.data.network.response.CocktailsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CocktailsAPI {

    @GET("list.php")
    suspend fun getCategories(
        @Query("c") filter: String = "list",
    ): CategoriesResponse

    @GET("filter.php")
    suspend fun getCocktailsByCategory(
        @Query("c") categoryName: String,
    ): CocktailsResponse

    @GET("search.php")
    suspend fun getCocktailsByName(
        @Query("s") search: String,
    ): CocktailsResponse

    @GET("lookup.php")
    suspend fun getCocktailById(
        @Query("i") cocktailId: String,
    ): CocktailsResponse
}