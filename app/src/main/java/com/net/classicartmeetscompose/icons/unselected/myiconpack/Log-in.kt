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

public val UnselectedIcons.`Log-in`: ImageVector
    get() {
        if (`_log-in` != null) {
            return `_log-in`!!
        }
        `_log-in` = Builder(name = "Log-in", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 7.0f)
                lineTo(20.5f, 17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 16.0f, 21.5f)
                lineTo(12.0f, 21.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.5f, 17.0f)
                lineTo(19.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.0f, 3.5f)
                lineTo(12.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 20.5f, 7.0f)
                close()
                moveTo(14.354f, 11.646f)
                lineTo(10.354f, 7.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.708f)
                lineTo(12.793f, 11.5f)
                lineTo(4.0f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(8.793f)
                lineTo(9.646f, 15.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                lineToRelative(4.0f, -4.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.354f, 11.646f)
                close()
            }
        }
        .build()
        return `_log-in`!!
    }

private var `_log-in`: ImageVector? = null
