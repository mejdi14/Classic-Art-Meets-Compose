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

public val HomeIcon.`Chevron-down`: ImageVector
    get() {
        if (`_chevron-down` != null) {
            return `_chevron-down`!!
        }
        `_chevron-down` = Builder(name = "Chevron-down", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.707f, 8.707f)
                lineToRelative(-9.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-9.0f, -9.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 3.707f, 7.293f)
                lineTo(12.0f, 15.586f)
                lineToRelative(8.293f, -8.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                close()
            }
        }
        .build()
        return `_chevron-down`!!
    }

private var `_chevron-down`: ImageVector? = null
