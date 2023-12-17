package com.briak.cocktailsmenu.domain.cocktails

class CocktailsInteractor(
    private val cocktailsRepository: CocktailsRepository,
) {
    suspend fun getCocktailByCategory(category: String): List<CocktailModel> = cocktailsRepository.getByCategory(category)

    suspend fun getCocktailByName(name: String): List<CocktailModel> = cocktailsRepository.getByName(name)

    suspend fun getCocktailById(cocktailId: String): CocktailModel? = cocktailsRepository.getById(cocktailId)
}