package com.briak.cocktailsmenu.domain.categories

class CategoriesInteractor(
    private val categoriesRepository: CategoriesRepository,
) {
    suspend fun getCategories(): List<CategoryModel> = categoriesRepository.get()
}