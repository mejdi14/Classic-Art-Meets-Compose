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

public val HomeIcon.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                horizontalLineTo(7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.953f, 4.953f, 0.0f, false, false, 0.152f, 1.169f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, 0.045f, 0.143f)
                arcTo(4.994f, 4.994f, 0.0f, false, false, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(8.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 17.0f, 3.0f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(4.586f)
                lineTo(16.417f, 9.0f)
                arcToRelative(2.009f, 2.009f, 0.0f, false, false, -2.834f, 0.0f)
                lineTo(9.0f, 13.586f)
                lineTo(8.417f, 13.0f)
                arcToRelative(2.009f, 2.009f, 0.0f, false, false, -2.834f, 0.0f)
                lineTo(4.0f, 14.586f)
                verticalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 5.0f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineTo(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.759f, -1.825f)
                lineTo(7.0f, 14.417f)
                lineToRelative(0.942f, 0.941f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.113f, 0.0f)
                lineTo(15.0f, 10.417f)
                lineToRelative(5.0f, 5.0f)
                verticalLineTo(16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 19.0f)
                close()
                moveTo(6.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 9.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
