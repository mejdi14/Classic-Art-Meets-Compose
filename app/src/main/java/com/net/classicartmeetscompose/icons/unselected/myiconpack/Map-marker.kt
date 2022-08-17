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

public val UnselectedIcons.`Map-marker`: ImageVector
    get() {
        if (`_map-marker` != null) {
            return `_map-marker`!!
        }
        `_map-marker` = Builder(name = "Map-marker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 15.5f, 10.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 6.5f)
                close()
                moveTo(12.0f, 12.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 14.5f, 10.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 12.5f)
                close()
                moveTo(12.0f, 2.5f)
                arcTo(7.334f, 7.334f, 0.0f, false, false, 4.5f, 10.0f)
                curveToRelative(0.0f, 6.088f, 4.659f, 9.891f, 6.661f, 11.243f)
                arcToRelative(1.484f, 1.484f, 0.0f, false, false, 1.668f, 0.0f)
                curveTo(14.835f, 19.889f, 19.5f, 16.082f, 19.5f, 10.0f)
                arcTo(7.337f, 7.337f, 0.0f, false, false, 12.0f, 2.5f)
                close()
                moveTo(12.274f, 20.415f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, true, -0.549f, 0.0f)
                curveTo(10.262f, 19.429f, 5.5f, 15.766f, 5.5f, 10.0f)
                arcTo(6.355f, 6.355f, 0.0f, false, true, 12.0f, 3.5f)
                arcTo(6.359f, 6.359f, 0.0f, false, true, 18.5f, 10.0f)
                curveTo(18.5f, 15.6f, 14.143f, 19.15f, 12.27f, 20.415f)
                close()
            }
        }
        .build()
        return `_map-marker`!!
    }

private var `_map-marker`: ImageVector? = null
