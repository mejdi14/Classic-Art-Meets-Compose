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

public val UnselectedIcons.`Chevron-circle-up`: ImageVector
    get() {
        if (`_chevron-circle-up` != null) {
            return `_chevron-circle-up`!!
        }
        `_chevron-circle-up` = Builder(name = "Chevron-circle-up", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, true, false, 21.5f, 12.0f)
                arcTo(9.511f, 9.511f, 0.0f, false, false, 12.0f, 2.5f)
                close()
                moveTo(12.0f, 20.5f)
                arcTo(8.5f, 8.5f, 0.0f, true, true, 20.5f, 12.0f)
                arcTo(8.51f, 8.51f, 0.0f, false, true, 12.0f, 20.5f)
                close()
                moveTo(15.354f, 12.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, 0.707f)
                lineTo(12.0f, 10.707f)
                lineTo(9.354f, 13.353f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, -0.707f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                close()
            }
        }
        .build()
        return `_chevron-circle-up`!!
    }

private var `_chevron-circle-up`: ImageVector? = null
