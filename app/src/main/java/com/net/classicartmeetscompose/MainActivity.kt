package com.net.classicartmeetscompose

import android.content.Context
import android.os.Build.VERSION.SDK_INT
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Size
import com.net.classicartmeetscompose.ui.screen.MainScreen
import com.net.classicartmeetscompose.ui.theme.ClassicArtComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
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
fun SimpleCoilImage(context: Context) {
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(context)
                .data(data = R.drawable.third_dev_logo)
                .apply(block = {
                    size(size = Size.ORIGINAL)
                }).build()
        ),
        contentDescription = null,
        modifier = Modifier.fillMaxSize().padding(50.dp)
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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ClassicArtComposeTheme {
    }
}
