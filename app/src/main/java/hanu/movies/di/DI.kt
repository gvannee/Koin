package hanu.movies.di

import hanu.movies.api.AppApi
import hanu.movies.repository.RemoteRepository
import hanu.movies.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {
    single {
        provideRetrofit()
    }
    single {
        getApiService(get())
    }
}

val repoModule = module {
    single {
        RemoteRepository(get())
    }
}

val viewModelModule = module {
    viewModel {
        MainViewModel(get())
    }
}

fun getApiService (retrofit: Retrofit) = retrofit.create(AppApi::class.java)

fun provideRetrofit () =  Retrofit.Builder()
    .baseUrl("https://api.open-meteo.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

