package com.briak.cocktailsmenu.data.repository.cocktails

import com.briak.cocktailsmenu.data.network.dto.CocktailDto
import com.briak.cocktailsmenu.domain.cocktails.CocktailModel

object CocktailsMapper {
    fun map(dto: CocktailDto): CocktailModel =
        CocktailModel(
            id = dto.id,
            name = dto.name,
            category = dto.category,
            glass = dto.glass,
            instructions = dto.instructions,
            iconUrl = dto.iconUrl,
            ingredients = null, // TODO
        )
}