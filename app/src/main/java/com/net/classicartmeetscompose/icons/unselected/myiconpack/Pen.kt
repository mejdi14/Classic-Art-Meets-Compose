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

public val UnselectedIcons.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(
            name = "Pen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth =
            24.0f,
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
                moveTo(20.305f, 3.7f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, -5.77f, 0.0f)
                lineTo(4.0f, 14.228f)
                arcToRelative(2.481f, 2.481f, 0.0f, false, false, -0.7f, 1.357f)
                lineToRelative(-0.79f, 4.738f)
                arcToRelative(1.013f, 1.013f, 0.0f, false, false, 1.162f, 1.163f)
                lineToRelative(4.739f, -0.79f)
                arcTo(2.481f, 2.481f, 0.0f, false, false, 9.771f, 20.0f)
                lineTo(20.305f, 9.465f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, 0.0f, -5.77f)
                close()
                moveTo(9.064f, 19.291f)
                arcToRelative(1.493f, 1.493f, 0.0f, false, true, -0.813f, 0.419f)
                lineTo(3.5f, 20.488f)
                lineToRelative(0.79f, -4.739f)
                arcToRelative(1.489f, 1.489f, 0.0f, false, true, 0.419f, -0.814f)
                lineToRelative(8.26f, -8.26f)
                lineToRelative(4.355f, 4.356f)
                close()
                moveTo(19.6f, 8.758f)
                lineToRelative(-1.567f, 1.566f)
                lineTo(13.676f, 5.968f)
                lineTo(15.242f, 4.4f)
                arcTo(3.08f, 3.08f, 0.0f, false, true, 19.6f, 8.758f)
                close()
            }
        }
            .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
