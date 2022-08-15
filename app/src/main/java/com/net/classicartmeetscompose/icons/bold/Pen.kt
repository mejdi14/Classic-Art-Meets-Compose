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

public val HomeIcon.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.658f, 3.342f)
                arcToRelative(4.577f, 4.577f, 0.0f, false, false, -6.476f, 0.0f)
                lineTo(3.648f, 13.875f)
                arcTo(2.98f, 2.98f, 0.0f, false, false, 2.811f, 15.5f)
                lineToRelative(-0.79f, 4.738f)
                arcTo(1.509f, 1.509f, 0.0f, false, false, 3.511f, 22.0f)
                arcToRelative(1.483f, 1.483f, 0.0f, false, false, 0.248f, -0.021f)
                lineToRelative(4.738f, -0.79f)
                arcToRelative(2.973f, 2.973f, 0.0f, false, false, 1.628f, -0.837f)
                lineTo(20.658f, 9.818f)
                arcToRelative(4.577f, 4.577f, 0.0f, false, false, 0.0f, -6.476f)
                close()
                moveTo(8.711f, 18.938f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.542f, 0.279f)
                lineToRelative(-4.063f, 0.677f)
                lineToRelative(0.677f, -4.063f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.279f, -0.542f)
                lineToRelative(7.907f, -7.906f)
                lineToRelative(3.648f, 3.648f)
                close()
                moveTo(19.244f, 8.4f)
                lineTo(18.031f, 9.617f)
                lineTo(14.383f, 5.969f)
                lineTo(15.6f, 4.756f)
                arcTo(2.58f, 2.58f, 0.0f, true, true, 19.244f, 8.4f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
