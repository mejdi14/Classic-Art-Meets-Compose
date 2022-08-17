package com.net.classicartmeetscompose.icons.selected.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.selected.SelectedIcons

public val SelectedIcons.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.006f, 2.006f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(21.5f, 11.0f)
                verticalLineToRelative(5.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, true, 17.0f, 20.5f)
                lineTo(7.0f, 20.5f)
                arcTo(4.507f, 4.507f, 0.0f, false, true, 2.5f, 16.0f)
                lineTo(2.5f, 11.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 6.73f, 6.51f)
                lineToRelative(1.26f, -1.9f)
                arcTo(2.513f, 2.513f, 0.0f, false, true, 10.07f, 3.5f)
                horizontalLineToRelative(3.86f)
                arcToRelative(2.513f, 2.513f, 0.0f, false, true, 2.08f, 1.11f)
                lineToRelative(1.26f, 1.9f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 21.5f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 13.0f)
                close()
                moveTo(19.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 10.0f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
