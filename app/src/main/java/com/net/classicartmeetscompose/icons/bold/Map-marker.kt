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

public val HomeIcon.`Map-marker`: ImageVector
    get() {
        if (`_map-marker` != null) {
            return `_map-marker`!!
        }
        `_map-marker` = Builder(name = "Map-marker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(7.823f, 7.823f, 0.0f, false, false, -8.0f, 8.0f)
                curveToRelative(0.0f, 6.326f, 4.812f, 10.26f, 6.881f, 11.657f)
                arcToRelative(1.981f, 1.981f, 0.0f, false, false, 2.228f, 0.0f)
                curveTo(15.181f, 20.26f, 20.0f, 16.324f, 20.0f, 10.0f)
                arcTo(7.826f, 7.826f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-1.8f, -1.219f, -6.0f, -4.633f, -6.0f, -10.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 6.0f, -6.0f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, true, 6.0f, 6.0f)
                curveTo(18.0f, 15.364f, 13.8f, 18.781f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return `_map-marker`!!
    }

private var `_map-marker`: ImageVector? = null
