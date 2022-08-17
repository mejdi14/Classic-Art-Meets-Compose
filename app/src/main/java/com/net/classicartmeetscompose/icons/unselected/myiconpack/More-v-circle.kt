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

public val UnselectedIcons.`More-v-circle`: ImageVector
    get() {
        if (`_more-v-circle` != null) {
            return `_more-v-circle`!!
        }
        `_more-v-circle` = Builder(name = "More-v-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 16.5f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 11.0f)
                close()
                moveTo(12.0f, 6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 6.5f)
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
        return `_more-v-circle`!!
    }

private var `_more-v-circle`: ImageVector? = null
