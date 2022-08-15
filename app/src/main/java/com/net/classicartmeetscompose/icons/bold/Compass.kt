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

public val HomeIcon.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(15.141f, 6.435f)
                lineTo(11.085f, 7.448f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, false, -3.637f, 3.638f)
                lineTo(6.434f, 15.141f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, false, 2.425f, 2.424f)
                lineToRelative(4.056f, -1.013f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, false, 3.637f, -3.638f)
                lineToRelative(1.014f, -4.055f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.425f, -2.424f)
                close()
                moveTo(15.625f, 8.375f)
                lineTo(14.612f, 12.429f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.183f, 2.183f)
                lineTo(8.375f, 15.625f)
                lineToRelative(1.013f, -4.054f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.183f, -2.183f)
                lineToRelative(4.055f, -1.014f)
                close()
                moveTo(12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 10.5f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
