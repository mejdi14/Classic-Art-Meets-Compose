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

public val UnselectedIcons.`Map-pin`: ImageVector
    get() {
        if (`_map-pin` != null) {
            return `_map-pin`!!
        }
        `_map-pin` = Builder(name = "Map-pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 12.449f)
                verticalLineTo(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineTo(12.449f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -1.0f, 0.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 3.5f)
                close()
                moveTo(19.5f, 18.0f)
                curveToRelative(0.0f, 2.0f, -3.224f, 3.5f, -7.5f, 3.5f)
                reflectiveCurveTo(4.5f, 20.0f, 4.5f, 18.0f)
                curveToRelative(0.0f, -1.446f, 1.645f, -2.642f, 4.4f, -3.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.2f, 0.98f)
                curveToRelative(-2.153f, 0.436f, -3.6f, 1.328f, -3.6f, 2.22f)
                curveToRelative(0.0f, 1.182f, 2.669f, 2.5f, 6.5f, 2.5f)
                reflectiveCurveToRelative(6.5f, -1.318f, 6.5f, -2.5f)
                curveToRelative(0.0f, -0.892f, -1.446f, -1.784f, -3.6f, -2.22f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.2f, -0.98f)
                curveTo(17.855f, 15.358f, 19.5f, 16.554f, 19.5f, 18.0f)
                close()
            }
        }
        .build()
        return `_map-pin`!!
    }

private var `_map-pin`: ImageVector? = null
