package ru.practicum.android.diploma.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.practicum.android.diploma.domain.models.Vacancy
import ru.practicum.android.diploma.presentation.favorites.FavoritesViewModel
import ru.practicum.android.diploma.presentation.vacancy.VacancyDetailsViewModel
import ru.practicum.android.diploma.ui.search.SearchViewModel

val uiModule = module {

    viewModel<SearchViewModel> {
        SearchViewModel(get(), get())
    }
    viewModel { (vacancy: Vacancy, isFavorite: Boolean, vacancyNeedToUpdate: Boolean) ->
        VacancyDetailsViewModel(
            vacancy = vacancy,
            isFavorite = isFavorite,
            vacancyNeedToUpdate = vacancyNeedToUpdate,
            get(),
            get(),
            get()
        )
    }
    viewModel<FavoritesViewModel> {
        FavoritesViewModel(get())
    }
}
