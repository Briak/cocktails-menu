package com.briak.cocktailsmenu.domain.cocktails

interface CocktailsRepository {

    suspend fun getByCategory(category: String): List<CocktailModel>
    suspend fun getByName(name: String): List<CocktailModel>
    suspend fun getById(cocktailId: String): CocktailModel?
}