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

public val HomeIcon.`Arrow-right`: ImageVector
    get() {
        if (`_arrow-right` != null) {
            return `_arrow-right`!!
        }
        `_arrow-right` = Builder(name = "Arrow-right", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.707f, 12.707f)
                lineToRelative(-7.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineTo(18.586f, 13.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(18.586f)
                lineTo(13.293f, 5.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineToRelative(7.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.707f, 12.707f)
                close()
            }
        }
        .build()
        return `_arrow-right`!!
    }

private var `_arrow-right`: ImageVector? = null
