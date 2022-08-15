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

public val HomeIcon.`Bell-slash`: ImageVector
    get() {
        if (`_bell-slash` != null) {
            return `_bell-slash`!!
        }
        `_bell-slash` = Builder(name = "Bell-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.567f, 13.675f)
                arcTo(3.98f, 3.98f, 0.0f, false, true, 19.0f, 11.62f)
                lineTo(19.0f, 8.99f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, -0.362f, -2.214f)
                lineToRelative(2.069f, -2.069f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-14.0f, 14.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineTo(6.414f, 19.0f)
                lineTo(9.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                horizontalLineToRelative(3.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 1.968f, -3.483f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(18.957f, 16.852f)
                arcTo(0.283f, 0.283f, 0.0f, false, true, 18.7f, 17.0f)
                lineTo(8.414f, 17.0f)
                lineToRelative(8.531f, -8.531f)
                arcTo(5.026f, 5.026f, 0.0f, false, true, 17.0f, 8.99f)
                verticalLineToRelative(2.63f)
                arcToRelative(5.979f, 5.979f, 0.0f, false, false, 0.852f, 3.084f)
                lineToRelative(1.1f, 1.839f)
                arcTo(0.3f, 0.3f, 0.0f, false, true, 18.957f, 16.852f)
                close()
                moveTo(3.657f, 14.968f)
                lineTo(4.427f, 13.678f)
                arcTo(3.979f, 3.979f, 0.0f, false, false, 5.0f, 11.62f)
                lineTo(5.0f, 8.99f)
                arcToRelative(7.012f, 7.012f, 0.0f, false, true, 11.337f, -5.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.1f, 5.067f)
                arcTo(5.012f, 5.012f, 0.0f, false, false, 7.0f, 8.99f)
                verticalLineToRelative(2.63f)
                arcToRelative(5.975f, 5.975f, 0.0f, false, true, -0.854f, 3.087f)
                lineToRelative(-0.767f, 1.286f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.718f, -1.025f)
                close()
            }
        }
        .build()
        return `_bell-slash`!!
    }

private var `_bell-slash`: ImageVector? = null
