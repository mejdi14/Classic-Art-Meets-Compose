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

public val HomeIcon.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.414f, 7.0f)
                lineTo(15.0f, 2.586f)
                arcTo(1.986f, 1.986f, 0.0f, false, false, 13.586f, 2.0f)
                horizontalLineTo(9.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(8.414f)
                arcTo(2.011f, 2.011f, 0.0f, false, false, 19.414f, 7.0f)
                close()
                moveTo(15.0f, 5.414f)
                lineTo(16.586f, 7.0f)
                horizontalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 5.5f)
                close()
                moveTo(15.0f, 20.0f)
                horizontalLineTo(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.5f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 20.0f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
