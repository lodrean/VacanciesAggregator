package ru.practicum.android.diploma.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.practicum.android.diploma.ui.search.SearchViewModel
import ru.practicum.android.diploma.domain.models.Vacancy
import ru.practicum.android.diploma.presentation.VacancyDetailsViewModel

val uiModule = module {

    viewModel<SearchViewModel> {
        SearchViewModel(get(), get())
    }
    viewModel { (vacancy: Vacancy) ->
        VacancyDetailsViewModel(vacancy = vacancy, get())
    }
}
