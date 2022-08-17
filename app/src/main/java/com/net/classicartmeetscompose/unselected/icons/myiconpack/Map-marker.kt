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

public val MyIconPack.`Map-marker`: ImageVector
    get() {
        if (`_map-marker` != null) {
            return `_map-marker`!!
        }
        `_map-marker` = Builder(name = "Map-marker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.006f, 2.006f, 0.0f, false, true, 14.0f, 10.0f)
                close()
                moveTo(19.5f, 10.0f)
                curveToRelative(0.0f, 6.08f, -4.67f, 9.89f, -6.67f, 11.24f)
                arcToRelative(1.407f, 1.407f, 0.0f, false, true, -0.83f, 0.26f)
                arcToRelative(1.459f, 1.459f, 0.0f, false, true, -0.84f, -0.26f)
                curveTo(9.16f, 19.89f, 4.5f, 16.09f, 4.5f, 10.0f)
                arcTo(7.33f, 7.33f, 0.0f, false, true, 12.0f, 2.5f)
                arcTo(7.336f, 7.336f, 0.0f, false, true, 19.5f, 10.0f)
                close()
                moveTo(16.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return `_map-marker`!!
    }

private var `_map-marker`: ImageVector? = null
