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

public val HomeIcon.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.556f, 6.03f)
                lineToRelative(-1.13f, -1.694f)
                arcTo(2.993f, 2.993f, 0.0f, false, false, 13.93f, 3.0f)
                lineTo(10.07f, 3.0f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, -2.5f, 1.336f)
                lineTo(6.444f, 6.03f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 2.0f, 11.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(17.0f, 21.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(22.0f, 11.0f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 17.556f, 6.03f)
                close()
                moveTo(20.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(7.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(4.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.832f, -0.445f)
                lineToRelative(1.406f, -2.11f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.07f, 5.0f)
                horizontalLineToRelative(3.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.832f, 0.445f)
                lineToRelative(1.406f, 2.11f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
                moveTo(19.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 10.0f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
