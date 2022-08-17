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

public val MyIconPack.`Map-pin`: ImageVector
    get() {
        if (`_map-pin` != null) {
            return `_map-pin`!!
        }
        `_map-pin` = Builder(name = "Map-pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 7.5f)
                arcTo(5.5f, 5.5f, 0.0f, true, true, 13.0f, 12.9f)
                lineTo(13.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 12.9f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 6.5f, 7.5f)
                close()
                moveTo(15.2f, 14.31f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.4f, 1.961f)
                curveTo(16.983f, 16.712f, 18.0f, 17.563f, 18.0f, 18.0f)
                curveToRelative(0.0f, 0.7f, -2.278f, 2.0f, -6.0f, 2.0f)
                reflectiveCurveToRelative(-6.0f, -1.3f, -6.0f, -2.0f)
                curveToRelative(0.0f, -0.437f, 1.017f, -1.288f, 3.2f, -1.729f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.4f, -1.961f)
                curveTo(5.8f, 14.918f, 4.0f, 16.3f, 4.0f, 18.0f)
                curveToRelative(0.0f, 2.626f, 4.024f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, -1.374f, 8.0f, -4.0f)
                curveTo(20.0f, 16.3f, 18.2f, 14.918f, 15.2f, 14.31f)
                close()
            }
        }
        .build()
        return `_map-pin`!!
    }

private var `_map-pin`: ImageVector? = null
