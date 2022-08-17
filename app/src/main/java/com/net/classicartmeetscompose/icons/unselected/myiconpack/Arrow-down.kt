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

public val UnselectedIcons.`Arrow-down`: ImageVector
    get() {
        if (`_arrow-down` != null) {
            return `_arrow-down`!!
        }
        `_arrow-down` = Builder(name = "Arrow-down", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.354f, 14.353f)
                lineToRelative(-7.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineToRelative(-7.0f, -7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, -0.707f)
                lineTo(11.5f, 19.793f)
                verticalLineTo(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineTo(19.793f)
                lineToRelative(6.146f, -6.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.707f)
                close()
            }
        }
        .build()
        return `_arrow-down`!!
    }

private var `_arrow-down`: ImageVector? = null
