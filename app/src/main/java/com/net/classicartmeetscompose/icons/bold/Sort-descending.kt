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

public val HomeIcon.`Sort-descending`: ImageVector
    get() {
        if (`_sort-descending` != null) {
            return `_sort-descending`!!
        }
        `_sort-descending` = Builder(name = "Sort-descending", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(17.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(8.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 8.0f)
                close()
                moveTo(15.5f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.5f, 12.0f)
                close()
                moveTo(14.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(11.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_sort-descending`!!
    }

private var `_sort-descending`: ImageVector? = null
