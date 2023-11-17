package hanu.movies

import android.app.Application
import hanu.movies.di.apiModule
import hanu.movies.di.repoModule
import hanu.movies.di.viewModelModule
import org.koin.core.context.startKoin

class WeatherApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    apiModule,
                    repoModule,
                    viewModelModule
                )
            )
        }
    }
}