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

public val MyIconPack.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.36f, 11.71f)
                lineTo(3.19f, 6.62f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 7.0f, 4.5f)
                horizontalLineTo(17.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.81f, 2.11f)
                lineToRelative(-7.15f, 5.08f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.36f, 11.71f)
                close()
                moveTo(21.48f, 8.6f)
                lineTo(14.8f, 13.34f)
                arcToRelative(5.082f, 5.082f, 0.0f, false, true, -2.81f, 0.85f)
                arcToRelative(4.968f, 4.968f, 0.0f, false, true, -2.76f, -0.84f)
                lineTo(2.52f, 8.6f)
                curveToRelative(-0.01f, 0.13f, -0.02f, 0.27f, -0.02f, 0.4f)
                verticalLineToRelative(6.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 7.0f, 19.5f)
                horizontalLineTo(17.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 21.5f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.5f, 8.87f, 21.49f, 8.73f, 21.48f, 8.6f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
