package com.net.classicartmeetscompose.icons.unselected.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.unselected.UnselectedIcons

public val UnselectedIcons.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(
            name = "Star",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF41416e)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.411f, 10.25f)
                arcTo(1.844f, 1.844f, 0.0f, false, false, 19.9f, 8.986f)
                lineToRelative(-4.309f, -0.617f)
                lineTo(13.668f, 4.524f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.871f, 1.871f, 0.0f, false, false, -3.336f, 0.0f)
                lineTo(8.406f, 8.369f)
                lineTo(4.1f, 8.986f)
                arcTo(1.844f, 1.844f, 0.0f, false, false, 2.589f, 10.25f)
                arcToRelative(1.821f, 1.821f, 0.0f, false, false, 0.477f, 1.881f)
                lineToRelative(3.114f, 2.99f)
                lineToRelative(-0.735f, 4.221f)
                arcToRelative(1.827f, 1.827f, 0.0f, false, false, 0.726f, 1.793f)
                arcToRelative(1.868f, 1.868f, 0.0f, false, false, 1.973f, 0.151f)
                lineToRelative(3.856f, -2.0f)
                lineToRelative(3.856f, 2.0f)
                arcToRelative(1.866f, 1.866f, 0.0f, false, false, 1.973f, -0.151f)
                arcToRelative(1.827f, 1.827f, 0.0f, false, false, 0.726f, -1.793f)
                lineToRelative(-0.735f, -4.221f)
                lineToRelative(3.114f, -2.991f)
                arcTo(1.819f, 1.819f, 0.0f, false, false, 21.411f, 10.25f)
                close()
                moveTo(20.241f, 11.409f)
                lineTo(16.941f, 14.584f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.147f, 0.447f)
                lineToRelative(0.78f, 4.483f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, true, -0.332f, 0.814f)
                arcToRelative(0.861f, 0.861f, 0.0f, false, true, -0.921f, 0.071f)
                lineTo(12.23f, 18.282f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.46f, 0.0f)
                lineTo(7.684f, 20.4f)
                arcToRelative(0.859f, 0.859f, 0.0f, false, true, -0.921f, -0.071f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, true, -0.332f, -0.814f)
                lineToRelative(0.78f, -4.483f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.147f, -0.447f)
                lineToRelative(-3.3f, -3.175f)
                arcToRelative(0.814f, 0.814f, 0.0f, false, true, -0.218f, -0.853f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, 0.7f, -0.58f)
                lineToRelative(4.569f, -0.654f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.376f, -0.271f)
                lineToRelative(2.043f, -4.08f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 1.548f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.043f, 4.079f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.376f, 0.271f)
                lineToRelative(4.569f, 0.654f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, 0.7f, 0.58f)
                arcTo(0.814f, 0.814f, 0.0f, false, true, 20.241f, 11.409f)
                close()
            }
        }
            .build()
        return _star!!
    }

private var _star: ImageVector? = null
