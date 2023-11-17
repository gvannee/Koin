package hanu.movies.repository

import hanu.movies.api.AppApi
import hanu.movies.di.getApiService

class RemoteRepository(private val apiService: AppApi) {
    suspend fun getWeather(longitude: Double, latitude: Double) =
        apiService.getForecast(longitude = longitude, latitude = latitude)
}