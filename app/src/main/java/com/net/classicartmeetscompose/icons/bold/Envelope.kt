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

public val HomeIcon.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                horizontalLineTo(7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 9.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(9.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 17.0f, 4.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineTo(17.0f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, true, 2.68f, 1.678f)
                lineToRelative(-6.016f, 4.01f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, true, -3.328f, 0.0f)
                lineTo(4.32f, 7.678f)
                arcTo(2.994f, 2.994f, 0.0f, false, true, 7.0f, 6.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineTo(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(9.868f)
                lineToRelative(5.226f, 3.485f)
                arcToRelative(4.989f, 4.989f, 0.0f, false, false, 5.547f, 0.0f)
                lineTo(20.0f, 9.868f)
                verticalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 18.0f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
