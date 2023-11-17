package hanu.movies.api

import hanu.movies.model.WeatherForecast
import retrofit2.http.GET
import retrofit2.http.Query

interface AppApi {
    @GET("/v1/forecast")
    suspend fun getForecast(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double
    ) : WeatherForecast
}