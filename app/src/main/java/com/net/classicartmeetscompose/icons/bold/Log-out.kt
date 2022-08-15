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

public val HomeIcon.`Log-out`: ImageVector
    get() {
        if (`_log-out` != null) {
            return `_log-out`!!
        }
        `_log-out` = Builder(name = "Log-out", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(8.0f, 22.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(3.0f, 7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 8.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(8.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 7.0f)
                lineTo(5.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 21.0f)
                close()
                moveTo(20.923f, 12.382f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.764f)
                arcToRelative(1.017f, 1.017f, 0.0f, false, false, -0.217f, -0.326f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, 1.414f)
                lineTo(17.587f, 11.0f)
                lineTo(10.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(7.586f)
                lineToRelative(-2.293f, 2.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(4.0f, -4.0f)
                arcTo(1.017f, 1.017f, 0.0f, false, false, 20.924f, 12.382f)
                close()
            }
        }
        .build()
        return `_log-out`!!
    }

private var `_log-out`: ImageVector? = null
