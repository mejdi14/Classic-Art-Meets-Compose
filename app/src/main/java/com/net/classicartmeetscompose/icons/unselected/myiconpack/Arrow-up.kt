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

public val UnselectedIcons.`Arrow-up`: ImageVector
    get() {
        if (`_arrow-up` != null) {
            return `_arrow-up`!!
        }
        `_arrow-up` = Builder(name = "Arrow-up", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.354f, 10.353f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineTo(12.5f, 4.207f)
                verticalLineTo(21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(4.207f)
                lineTo(5.354f, 10.353f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.707f)
                lineToRelative(7.0f, -7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(7.0f, 7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 19.354f, 10.353f)
                close()
            }
        }
        .build()
        return `_arrow-up`!!
    }

private var `_arrow-up`: ImageVector? = null
