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

public val HomeIcon.`Check-circle`: ImageVector
    get() {
        if (`_check-circle` != null) {
            return `_check-circle`!!
        }
        `_check-circle` = Builder(name = "Check-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.707f, 9.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, -1.414f)
                lineTo(11.0f, 13.586f)
                lineToRelative(4.293f, -4.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.707f, 9.293f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 12.0f, 2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, false, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_check-circle`!!
    }

private var `_check-circle`: ImageVector? = null
