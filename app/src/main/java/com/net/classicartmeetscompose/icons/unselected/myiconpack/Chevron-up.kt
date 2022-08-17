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

public val UnselectedIcons.`Chevron-up`: ImageVector
    get() {
        if (`_chevron-up` != null) {
            return `_chevron-up`!!
        }
        `_chevron-up` = Builder(name = "Chevron-up", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.354f, 16.353f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineTo(12.0f, 7.707f)
                lineTo(3.354f, 16.353f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.707f)
                lineToRelative(9.0f, -9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(9.0f, 9.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 21.354f, 16.353f)
                close()
            }
        }
        .build()
        return `_chevron-up`!!
    }

private var `_chevron-up`: ImageVector? = null
