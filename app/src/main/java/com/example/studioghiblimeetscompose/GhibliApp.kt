package com.example.studioghiblimeetscompose

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class GhibliApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}