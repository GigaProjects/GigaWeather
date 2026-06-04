# GigaWeather

GigaWeather is a Kotlin Android weather app built with Jetpack Compose.

This project is a fork of [GeoWeather](https://f-droid.org/packages/com.freetime.geoweather/), customized for better user experience.

## Main Improvements

- English-only app packaging
- Opens directly to the preferred saved city
- Keeps other saved cities available without making the city list the default screen
- Daily and hourly precipitation amounts in millimeters
- Removed donation/auth/backend surfaces from the original app

## Features

- Multiple saved locations
- Current-location lookup
- 7-day forecast
- Hourly weather details
- Compact PM2.5 air indicator
- Celsius/Fahrenheit and km/h/mph settings
- Material You dynamic colors
- Home screen weather widget
- Weather notifications

## Weather Data

The app runs directly on the phone. It does not need a custom domain or private backend.

By default it uses public Open-Meteo endpoints for forecast, geocoding, reverse geocoding, historical archive, and air quality data.

## Build

```bash
./gradlew assembleDebug
```

The APK is generated under `app/build/outputs/apk/debug/`.

## License

This project keeps the upstream Apache-2.0 license. See [LICENSE](LICENSE).
