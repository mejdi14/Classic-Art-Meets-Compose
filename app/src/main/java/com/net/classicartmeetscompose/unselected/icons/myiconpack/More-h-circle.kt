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

public val MyIconPack.`More-h-circle`: ImageVector
    get() {
        if (`_more-h-circle` != null) {
            return `_more-h-circle`!!
        }
        `_more-h-circle` = Builder(name = "More-h-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, true, false, 21.5f, 12.0f)
                arcTo(9.509f, 9.509f, 0.0f, false, false, 12.0f, 2.5f)
                close()
                moveTo(7.5f, 13.25f)
                arcTo(1.25f, 1.25f, 0.0f, true, true, 8.75f, 12.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 7.5f, 13.25f)
                close()
                moveTo(12.0f, 13.25f)
                arcTo(1.25f, 1.25f, 0.0f, true, true, 13.25f, 12.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 12.0f, 13.25f)
                close()
                moveTo(16.5f, 13.25f)
                arcTo(1.25f, 1.25f, 0.0f, true, true, 17.75f, 12.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 16.5f, 13.25f)
                close()
            }
        }
        .build()
        return `_more-h-circle`!!
    }

private var `_more-h-circle`: ImageVector? = null
