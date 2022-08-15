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

public val HomeIcon.`Arrow-up`: ImageVector
    get() {
        if (`_arrow-up` != null) {
            return `_arrow-up`!!
        }
        `_arrow-up` = Builder(name = "Arrow-up", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.707f, 10.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(13.0f, 5.414f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(5.414f)
                lineTo(5.707f, 10.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.293f, 9.293f)
                lineToRelative(7.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(7.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.707f, 10.707f)
                close()
            }
        }
        .build()
        return `_arrow-up`!!
    }

private var `_arrow-up`: ImageVector? = null
