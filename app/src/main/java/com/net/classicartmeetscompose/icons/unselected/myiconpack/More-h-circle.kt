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

public val UnselectedIcons.`More-h-circle`: ImageVector
    get() {
        if (`_more-h-circle` != null) {
            return `_more-h-circle`!!
        }
        `_more-h-circle` = Builder(name = "More-h-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.5f, 12.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 11.0f)
                close()
                moveTo(7.5f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.5f, 11.0f)
                close()
                moveTo(21.5f, 12.0f)
                arcTo(9.5f, 9.5f, 0.0f, true, true, 12.0f, 2.5f)
                arcTo(9.511f, 9.511f, 0.0f, false, true, 21.5f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcTo(8.5f, 8.5f, 0.0f, true, false, 12.0f, 20.5f)
                arcTo(8.51f, 8.51f, 0.0f, false, false, 20.5f, 12.0f)
                close()
            }
        }
        .build()
        return `_more-h-circle`!!
    }

private var `_more-h-circle`: ImageVector? = null
