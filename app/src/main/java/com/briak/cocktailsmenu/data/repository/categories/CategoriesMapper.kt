package com.briak.cocktailsmenu.data.repository.categories

import com.briak.cocktailsmenu.data.network.dto.CategoryDto
import com.briak.cocktailsmenu.domain.categories.CategoryModel

object CategoriesMapper {
    fun map(dto: CategoryDto): CategoryModel = CategoryModel(dto.name)
}