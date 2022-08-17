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

public val UnselectedIcons.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.273f, 6.508f)
                lineTo(16.01f, 4.613f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.93f, 3.5f)
                lineTo(10.07f, 3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.99f, 4.613f)
                lineTo(6.727f, 6.508f)
                arcTo(4.506f, 4.506f, 0.0f, false, false, 2.5f, 11.0f)
                verticalLineToRelative(5.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 7.0f, 20.5f)
                lineTo(17.0f, 20.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 21.5f, 16.0f)
                lineTo(21.5f, 11.0f)
                arcTo(4.506f, 4.506f, 0.0f, false, false, 17.273f, 6.508f)
                close()
                moveTo(20.5f, 16.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 19.5f)
                lineTo(7.0f, 19.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 16.0f)
                lineTo(3.5f, 11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.416f, -0.223f)
                lineTo(8.822f, 5.168f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.07f, 4.5f)
                horizontalLineToRelative(3.86f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.248f, 0.668f)
                lineToRelative(1.406f, 2.109f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 17.0f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 11.0f)
                close()
                moveTo(12.0f, 9.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 15.5f, 13.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 9.5f)
                close()
                moveTo(12.0f, 15.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 14.5f, 13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 15.5f)
                close()
                moveTo(18.85f, 10.0f)
                arcTo(0.85f, 0.85f, 0.0f, true, true, 18.0f, 9.15f)
                arcTo(0.851f, 0.851f, 0.0f, false, true, 18.85f, 10.0f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
