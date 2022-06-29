package com.example.studio_ghibli_meets_compose

import android.app.Application

@HiltAndroidApp
class GhibliApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}