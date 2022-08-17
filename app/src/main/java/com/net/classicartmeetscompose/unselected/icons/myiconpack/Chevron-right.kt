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

public val MyIconPack.`Chevron-right`: ImageVector
    get() {
        if (`_chevron-right` != null) {
            return `_chevron-right`!!
        }
        `_chevron-right` = Builder(name = "Chevron-right", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.707f, 12.707f)
                lineToRelative(-9.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, -1.414f)
                lineTo(15.586f, 12.0f)
                lineTo(7.293f, 3.707f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 8.707f, 2.293f)
                lineToRelative(9.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.707f, 12.707f)
                close()
            }
        }
        .build()
        return `_chevron-right`!!
    }

private var `_chevron-right`: ImageVector? = null
