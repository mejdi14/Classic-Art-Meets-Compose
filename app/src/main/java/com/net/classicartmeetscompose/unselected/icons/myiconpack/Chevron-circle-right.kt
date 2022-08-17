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

public val MyIconPack.`Chevron-circle-right`: ImageVector
    get() {
        if (`_chevron-circle-right` != null) {
            return `_chevron-circle-right`!!
        }
        `_chevron-circle-right` = Builder(name = "Chevron-circle-right", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, true, false, 21.5f, 12.0f)
                arcTo(9.509f, 9.509f, 0.0f, false, false, 12.0f, 2.5f)
                close()
                moveTo(14.71f, 12.71f)
                lineTo(11.71f, 15.71f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, true, -1.42f, 0.0f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 0.0f, -1.42f)
                lineTo(12.59f, 12.0f)
                lineToRelative(-2.3f, -2.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, -1.42f)
                lineToRelative(3.0f, 3.0f)
                arcTo(1.008f, 1.008f, 0.0f, false, true, 14.71f, 12.71f)
                close()
            }
        }
        .build()
        return `_chevron-circle-right`!!
    }

private var `_chevron-circle-right`: ImageVector? = null
