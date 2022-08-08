package com.example.classicartmeetscompose

import android.content.Context
import android.os.Build.VERSION.SDK_INT
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Size
import com.bk.coredata.viewmodel.FilmViewModel
import com.example.classicartmeetscompose.ui.theme.StudioGhibliMeetsComposeTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    val viewmodel: FilmViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runBlocking {
            launch {
                val list = viewmodel.getAllArtworks()
                Log.d("TAG", "onCreate: $list")
            }
        }
        setContent {
            StudioGhibliMeetsComposeTheme {
                GifImage(this)
            }
        }
    }
}

@Composable
fun EnterScreen(context: Context) {
    Column(modifier = Modifier.background(Color.White)) {
        Box(modifier = Modifier.weight(1f)) {
        }
        Box(modifier = Modifier.weight(1f)) {
            GifImage(context = context)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun SimpleCoilImage(context: Context) {
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(context)
                .data(data = "https://cdn.dribbble.com/users/5462404/screenshots/14049276/media/ceb899e0922f7ca5edaf0d01802f9379.jpeg")
                .apply(block = {
                    size(size = Size.ORIGINAL)
                }).build()
        ),
        contentDescription = null,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun GifImage(context: Context) {
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
                }).build(),
            imageLoader = imgLoader
        ),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                Log.d("TAG", "GifImage: ")
            }
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
