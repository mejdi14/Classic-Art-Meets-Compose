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

public val HomeIcon.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.443f, 7.971f)
                lineToRelative(1.264f, -1.264f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineTo(16.968f, 6.618f)
                arcTo(8.444f, 8.444f, 0.0f, false, false, 13.0f, 5.064f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(10.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 5.064f)
                arcToRelative(8.514f, 8.514f, 0.0f, true, false, 7.443f, 2.907f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 6.5f, -6.5f)
                arcTo(6.508f, 6.508f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(14.781f, 15.375f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.562f, 1.25f)
                lineToRelative(-2.0f, -2.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 13.5f)
                lineTo(11.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(3.149f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
