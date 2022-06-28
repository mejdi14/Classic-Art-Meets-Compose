package com.example.studio_ghibli_meets_compose

import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.studio_ghibli_meets_compose.ui.theme.StudioGhibliMeetsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val text = remember { mutableStateOf("text") }
            StudioGhibliMeetsComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.background(color = Color.Green),
                    ) {

                        TextField(
                            value = text.value,
                            onValueChange = {
                                text.value = it
                            },
                            label = { Text("Label") }
                        )
                        TextField(value = "", onValueChange = {
                            text.value = it
                        }, placeholder = { Text("Enter phone number") })
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun SplashScreenTransaction(){


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StudioGhibliMeetsComposeTheme {
        Greeting("very nice")
    }
}