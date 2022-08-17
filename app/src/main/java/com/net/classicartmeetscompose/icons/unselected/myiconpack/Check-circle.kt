package com.net.classicartmeetscompose.icons.unselected.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.unselected.UnselectedIcons

public val UnselectedIcons.`Check-circle`: ImageVector
    get() {
        if (`_check-circle` != null) {
            return `_check-circle`!!
        }
        `_check-circle` = Builder(name = "Check-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.354f, 9.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.707f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, -0.707f)
                lineTo(11.0f, 14.293f)
                lineToRelative(4.646f, -4.647f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 16.354f, 9.646f)
                close()
                moveTo(21.5f, 12.0f)
                arcTo(9.5f, 9.5f, 0.0f, true, true, 12.0f, 2.5f)
                arcTo(9.511f, 9.511f, 0.0f, false, true, 21.5f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcTo(8.5f, 8.5f, 0.0f, true, false, 12.0f, 20.5f)
                arcTo(8.51f, 8.51f, 0.0f, false, false, 20.5f, 12.0f)
                close()
            }
        }
        .build()
        return `_check-circle`!!
    }

private var `_check-circle`: ImageVector? = null
