package com.example.studio_ghibli_meets_compose

import android.content.Context
import android.os.Build.VERSION.SDK_INT
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Size
import com.example.studio_ghibli_meets_compose.ui.theme.StudioGhibliMeetsComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudioGhibliMeetsComposeTheme {
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun GifImage(context: Context){
    // A surface container using the 'background' color from the theme
    val imgLoader = ImageLoader.Builder(context)
        .components {
            if (SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            } else {
                add(GifDecoder.Factory())
            }
        }
        .build()
// Use in Image
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(context)
                .data(data = R.drawable.running_goat)
                .apply(block = {
                    size(Size.ORIGINAL)
                }).build(), imageLoader = imgLoader
        ),
        contentDescription = null,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun SplashScreenTransaction() {


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StudioGhibliMeetsComposeTheme {
        Greeting("very nice")
    }
}
