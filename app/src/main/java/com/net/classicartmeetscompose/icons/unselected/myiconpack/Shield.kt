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

public val UnselectedIcons.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(
            name = "Shield",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF41416e)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.158f, 6.526f)
                curveTo(17.232f, 5.55f, 13.3f, 3.594f, 12.372f, 2.649f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 12.02f, 2.5f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, false, -0.355f, 0.144f)
                arcToRelative(20.247f, 20.247f, 0.0f, false, true, -7.8f, 4.005f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.5f, 7.13f)
                curveToRelative(0.0f, 8.271f, 1.208f, 12.306f, 8.364f, 14.351f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.274f, 0.0f)
                curveTo(19.293f, 19.436f, 20.5f, 15.361f, 20.5f, 7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 20.158f, 6.526f)
                close()
                moveTo(12.0f, 20.479f)
                curveTo(5.65f, 18.619f, 4.535f, 15.094f, 4.5f, 7.505f)
                arcToRelative(22.234f, 22.234f, 0.0f, false, false, 7.523f, -3.837f)
                arcTo(32.632f, 32.632f, 0.0f, false, false, 19.5f, 7.357f)
                curveTo(19.467f, 15.049f, 18.356f, 18.617f, 12.0f, 20.479f)
                close()
            }
        }
            .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
