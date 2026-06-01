package com.gigaprojects.gigaweather.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.gigaprojects.gigaweather.data.LocationDao
import com.gigaprojects.gigaweather.data.LocationDatabase
import com.gigaprojects.gigaweather.data.LocationEntity

class LocationsViewModel(application: Application) : AndroidViewModel(application) {

    private val locationDao: LocationDao = LocationDatabase.getDatabase(application).locationDao()
    val locations: LiveData<List<LocationEntity>> = locationDao.getAllLocations()

    fun addLocation(name: String, latitude: Double, longitude: Double) {
        LocationDatabase.databaseWriteExecutor.execute {
            val newLocation = LocationEntity(name = name, latitude = latitude, longitude = longitude)
            locationDao.insertLocation(newLocation)
        }
    }

    fun deleteLocation(location: LocationEntity) {
        LocationDatabase.databaseWriteExecutor.execute {
            locationDao.deleteLocation(location)
        }
    }
}