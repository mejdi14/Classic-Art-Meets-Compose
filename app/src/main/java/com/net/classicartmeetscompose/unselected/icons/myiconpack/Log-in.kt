package com.net.classicartmeetscompose.unselected.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.unselected.icons.MyIconPack

public val MyIconPack.`Log-in`: ImageVector
    get() {
        if (`_log-in` != null) {
            return `_log-in`!!
        }
        `_log-in` = Builder(name = "Log-in", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                lineTo(21.0f, 17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(12.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(19.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(12.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 21.0f, 7.0f)
                close()
                moveTo(14.707f, 11.293f)
                lineTo(10.707f, 7.293f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 9.293f, 8.707f)
                lineTo(11.586f, 11.0f)
                lineTo(4.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(7.586f)
                lineTo(9.293f, 15.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(4.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.707f, 11.293f)
                close()
            }
        }
        .build()
        return `_log-in`!!
    }

private var `_log-in`: ImageVector? = null
