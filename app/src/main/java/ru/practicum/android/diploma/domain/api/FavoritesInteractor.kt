package ru.practicum.android.diploma.domain.api

import kotlinx.coroutines.flow.Flow
import ru.practicum.android.diploma.domain.models.Vacancy
import ru.practicum.android.diploma.util.Resource

interface FavoritesInteractor {

    fun updateFavorites(): Flow<Resource<List<Vacancy>>>

}