package com.briak.cocktailsmenu.data.repository.categories

import com.briak.cocktailsmenu.data.network.CocktailsAPI
import com.briak.cocktailsmenu.domain.categories.CategoriesRepository
import com.briak.cocktailsmenu.domain.categories.CategoryModel

class CategoriesRepositoryImpl(
    private val api: CocktailsAPI,
): CategoriesRepository {

    override suspend fun get(): List<CategoryModel> {
        val response = api.getCategories()
        return response.categories.orEmpty().map { dto -> CategoriesMapper.map(dto) }
    }
}