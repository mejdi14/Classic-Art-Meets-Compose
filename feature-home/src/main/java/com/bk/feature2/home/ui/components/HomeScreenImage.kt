package com.bk.feature2.home.ui.components

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.bk.feature2.R
import com.net.core.network.model.Data

@Composable
fun SimpleCoilImage(item: Data) {
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(LocalContext.current)
                .data(data = "hello")
                .apply(block = {
                    size(size = Size.ORIGINAL)
                }).build()
        ),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth().height(200.dp).padding(50.dp)
    )
}