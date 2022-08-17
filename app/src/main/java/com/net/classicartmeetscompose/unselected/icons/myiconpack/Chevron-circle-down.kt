package com.net.classicartmeetscompose.unselected.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.unselected.icons.MyIconPack

public val MyIconPack.`Chevron-circle-down`: ImageVector
    get() {
        if (`_chevron-circle-down` != null) {
            return `_chevron-circle-down`!!
        }
        `_chevron-circle-down` = Builder(name = "Chevron-circle-down", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, true, false, 21.5f, 12.0f)
                arcTo(9.509f, 9.509f, 0.0f, false, false, 12.0f, 2.5f)
                close()
                moveTo(15.71f, 11.71f)
                lineTo(12.71f, 14.71f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, true, -1.42f, 0.0f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, -1.42f)
                lineTo(12.0f, 12.59f)
                lineToRelative(2.29f, -2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 1.42f)
                close()
            }
        }
        .build()
        return `_chevron-circle-down`!!
    }

private var `_chevron-circle-down`: ImageVector? = null
