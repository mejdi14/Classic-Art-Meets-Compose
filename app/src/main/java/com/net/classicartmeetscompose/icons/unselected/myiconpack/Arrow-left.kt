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

public val UnselectedIcons.`Arrow-left`: ImageVector
    get() {
        if (`_arrow-left` != null) {
            return `_arrow-left`!!
        }
        `_arrow-left` = Builder(name = "Arrow-left", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(4.207f)
                lineToRelative(6.147f, 6.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, 0.707f)
                lineToRelative(-7.0f, -7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                lineToRelative(7.0f, -7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, 0.707f)
                lineTo(4.207f, 11.5f)
                horizontalLineTo(21.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 21.5f, 12.0f)
                close()
            }
        }
        .build()
        return `_arrow-left`!!
    }

private var `_arrow-left`: ImageVector? = null
