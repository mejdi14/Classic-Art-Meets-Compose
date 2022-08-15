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

public val HomeIcon.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.342f, 9.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -0.894f)
                lineTo(19.9f, 3.447f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 2.0f)
                horizontalLineTo(9.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 4.0f, 7.0f)
                verticalLineTo(20.958f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.895f, -1.447f)
                close()
                moveTo(6.0f, 14.0f)
                verticalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 4.0f)
                horizontalLineToRelative(8.382f)
                lineTo(15.553f, 7.658f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, false, 0.0f, 2.684f)
                lineTo(17.382f, 14.0f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
