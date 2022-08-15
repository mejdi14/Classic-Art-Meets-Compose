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

public val HomeIcon.`Times-square`: ImageVector
    get() {
        if (`_times-square` != null) {
            return `_times-square`!!
        }
        `_times-square` = Builder(name = "Times-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.707f, 9.707f)
                lineTo(13.414f, 12.0f)
                lineToRelative(2.293f, 2.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineTo(12.0f, 13.414f)
                lineTo(9.707f, 15.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineTo(10.586f, 12.0f)
                lineTo(8.293f, 9.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.707f, 8.293f)
                lineTo(12.0f, 10.586f)
                lineToRelative(2.293f, -2.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                close()
                moveTo(22.0f, 9.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, -7.0f, 7.0f)
                horizontalLineTo(9.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, -7.0f, -7.0f)
                verticalLineTo(9.0f)
                arcTo(7.008f, 7.008f, 0.0f, false, true, 9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcTo(7.008f, 7.008f, 0.0f, false, true, 22.0f, 9.0f)
                close()
                moveTo(20.0f, 9.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(9.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 4.0f, 9.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return `_times-square`!!
    }

private var `_times-square`: ImageVector? = null
