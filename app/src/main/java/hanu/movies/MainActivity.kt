package hanu.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import hanu.movies.api.AppApi
import hanu.movies.repository.RemoteRepository
import hanu.movies.viewmodel.MainViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.stateViewModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by stateViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        viewModel.weather.observe(this) {
//            Toast.makeText(this, "${it.elevation}, ${it.timezone}", Toast.LENGTH_LONG).show()
//        }

        viewModel.fetchWeather(20.1, 22.5 ) {
            Toast.makeText(this, "${it.elevation}, ${it.timezone}", Toast.LENGTH_LONG).show()
        }

//        val viewModel = MainViewModel(remoteRepository = RemoteRepository(apiService = Ap))


    }
}