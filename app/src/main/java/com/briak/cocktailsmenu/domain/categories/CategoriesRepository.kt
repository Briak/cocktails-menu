package com.briak.cocktailsmenu.domain.categories

interface CategoriesRepository {
    suspend fun get(): List<CategoryModel>
}