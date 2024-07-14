package ru.practicum.android.diploma.domain.impl

import kotlinx.coroutines.flow.Flow
import ru.practicum.android.diploma.domain.api.FavoritesInteractor
import ru.practicum.android.diploma.domain.api.FavoritesRepository
import ru.practicum.android.diploma.domain.models.Vacancy
import ru.practicum.android.diploma.util.Resource

class FavoritesInteractorImlp(
    private val favoritesRepository: FavoritesRepository
) : FavoritesInteractor {
    override fun updateFavorites(): Flow<Resource<List<Vacancy>>> {
        return favoritesRepository.updateFavorites()
    }
}