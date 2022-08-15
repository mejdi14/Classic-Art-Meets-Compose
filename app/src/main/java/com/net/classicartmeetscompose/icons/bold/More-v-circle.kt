package com.net.classicartmeetscompose.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.HomeIcon

public val HomeIcon.`More-v-circle`: ImageVector
    get() {
        if (`_more-v-circle` != null) {
            return `_more-v-circle`!!
        }
        `_more-v-circle` = Builder(name = "More-v-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 16.5f)
                arcTo(1.25f, 1.25f, 0.0f, true, true, 12.0f, 15.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 13.25f, 16.5f)
                close()
                moveTo(12.0f, 10.75f)
                arcTo(1.25f, 1.25f, 0.0f, true, false, 13.25f, 12.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 12.0f, 10.75f)
                close()
                moveTo(12.0f, 6.25f)
                arcTo(1.25f, 1.25f, 0.0f, true, false, 13.25f, 7.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 12.0f, 6.25f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 12.0f, 2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, false, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_more-v-circle`!!
    }

private var `_more-v-circle`: ImageVector? = null
