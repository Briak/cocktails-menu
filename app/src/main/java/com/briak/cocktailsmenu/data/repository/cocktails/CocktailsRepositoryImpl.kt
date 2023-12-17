package com.briak.cocktailsmenu.data.repository.cocktails

import com.briak.cocktailsmenu.data.network.CocktailsAPI
import com.briak.cocktailsmenu.domain.cocktails.CocktailModel
import com.briak.cocktailsmenu.domain.cocktails.CocktailsRepository

class CocktailsRepositoryImpl(
    private val api: CocktailsAPI,
): CocktailsRepository {

    override suspend fun getByCategory(category: String): List<CocktailModel> {
        val response = api.getCocktailsByCategory(category)
        return response.cocktails.orEmpty().map { dto -> CocktailsMapper.map(dto) }
    }

    override suspend fun getByName(name: String): List<CocktailModel> {
        val response = api.getCocktailsByName(name)
        return response.cocktails.orEmpty().map { dto -> CocktailsMapper.map(dto) }
    }

    override suspend fun getById(cocktailId: String): CocktailModel? {
        val response = api.getCocktailById(cocktailId)
        val dto = response.cocktails?.firstOrNull() ?: return null
        return CocktailsMapper.map(dto)
    }
}