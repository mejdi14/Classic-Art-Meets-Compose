package com.net.classicartmeetscompose.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.HomeIcon

public val HomeIcon.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.933f, 16.557f)
                curveToRelative(-0.026f, -0.144f, -0.055f, -0.271f, -0.086f, -0.381f)
                arcToRelative(1.976f, 1.976f, 0.0f, false, false, -1.586f, -1.392f)
                lineToRelative(-4.331f, -0.72f)
                arcToRelative(2.012f, 2.012f, 0.0f, false, false, -1.9f, 0.729f)
                curveToRelative(-0.059f, 0.073f, -0.114f, 0.15f, -0.227f, 0.274f)
                arcToRelative(9.093f, 9.093f, 0.0f, false, true, -4.83f, -4.92f)
                curveToRelative(0.1f, -0.07f, 0.2f, -0.143f, 0.3f, -0.22f)
                arcTo(2.015f, 2.015f, 0.0f, false, false, 9.986f, 8.05f)
                lineTo(9.315f, 3.8f)
                arcTo(1.987f, 1.987f, 0.0f, false, false, 7.979f, 2.207f)
                arcToRelative(4.122f, 4.122f, 0.0f, false, false, -0.543f, -0.136f)
                arcTo(4.531f, 4.531f, 0.0f, false, false, 3.673f, 3.114f)
                arcTo(4.778f, 4.778f, 0.0f, false, false, 2.0f, 6.881f)
                arcTo(15.543f, 15.543f, 0.0f, false, false, 17.118f, 22.0f)
                horizontalLineToRelative(0.131f)
                arcToRelative(4.769f, 4.769f, 0.0f, false, false, 3.618f, -1.661f)
                arcTo(4.573f, 4.573f, 0.0f, false, false, 21.933f, 16.557f)
                close()
                moveTo(19.354f, 19.03f)
                arcTo(2.769f, 2.769f, 0.0f, false, true, 17.172f, 20.0f)
                arcTo(13.543f, 13.543f, 0.0f, false, true, 4.0f, 6.826f)
                arcToRelative(2.792f, 2.792f, 0.0f, false, true, 0.975f, -2.2f)
                arcTo(2.53f, 2.53f, 0.0f, false, true, 6.633f, 4.0f)
                arcToRelative(2.615f, 2.615f, 0.0f, false, true, 0.447f, 0.04f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 0.26f, 0.068f)
                lineToRelative(0.666f, 4.268f)
                curveToRelative(-0.051f, 0.04f, -0.1f, 0.078f, -0.159f, 0.116f)
                arcTo(2.027f, 2.027f, 0.0f, false, false, 7.1f, 11.0f)
                arcTo(11.354f, 11.354f, 0.0f, false, false, 13.0f, 16.9f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, false, 2.507f, -0.749f)
                lineToRelative(0.093f, -0.116f)
                lineToRelative(4.321f, 0.681f)
                arcToRelative(1.862f, 1.862f, 0.0f, false, true, 0.04f, 0.184f)
                arcTo(2.576f, 2.576f, 0.0f, false, true, 19.354f, 19.03f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
