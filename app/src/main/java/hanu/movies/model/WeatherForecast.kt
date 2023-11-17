package hanu.movies.model

data class WeatherForecast(
    var latitude: Double = 0.0,
    var longitude: Double = 0.0,
    var generationtime_ms: Double = 0.0,
    var utc_offset_seconds: Int = 0,
    var timezone: String? = null,
    var timezone_abbreviation: String? = null,
    var elevation: Int = 0
)