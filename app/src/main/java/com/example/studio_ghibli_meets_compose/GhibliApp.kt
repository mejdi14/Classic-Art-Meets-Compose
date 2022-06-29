package com.example.studio_ghibli_meets_compose

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class GhibliApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}