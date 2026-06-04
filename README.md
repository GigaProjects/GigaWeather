# GigaWeather

GigaWeather is a Kotlin Android weather app built with Jetpack Compose.

It is based on the open source GeoWeather project, with the app identity changed for GigaProjects and the original donation/auth backend surfaces removed.

## Features

- Multiple saved locations
- Current-location lookup
- 7-day forecast
- Hourly weather details
- Celsius/Fahrenheit and km/h/mph settings
- Material You dynamic colors
- Home screen weather widget
- Weather notifications

## Weather Data

The app can run directly on the phone without a custom domain or backend.

By default it uses public Open-Meteo endpoints for forecast, geocoding, reverse geocoding, historical archive, and air quality data. Optional provider settings are still available in the app settings.

## Android Identity

- App name: `GigaWeather`
- Application ID: `com.gigaprojects.gigaweather`
- Minimum SDK: 26

## Build

```bash
./gradlew assembleDebug
```

The debug APK will be generated under `app/build/outputs/apk/debug/`.

## License

This project keeps the upstream Apache-2.0 license. See [LICENSE](LICENSE).
