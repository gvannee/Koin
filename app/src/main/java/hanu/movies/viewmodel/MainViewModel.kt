package hanu.movies.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import hanu.movies.model.WeatherForecast
import hanu.movies.repository.RemoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel (private val remoteRepository: RemoteRepository) : ViewModel (){

    fun fetchWeather (longitude: Double, latitude: Double, onFinish:(WeatherForecast) -> Unit

     ) {
        viewModelScope.launch (Dispatchers.IO) {
            val weatherData = remoteRepository.getWeather(longitude, latitude)
            withContext(Dispatchers.Main) {
                onFinish.invoke(weatherData)
            }
        }
    }
}