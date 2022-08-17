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

public val SelectedIcons.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(
            name = "Image",
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
                moveTo(17.0f, 3.0f)
                horizontalLineTo(7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(8.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 17.0f, 3.0f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineTo(17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(4.586f)
                lineTo(16.417f, 9.0f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, false, -2.834f, 0.0f)
                lineTo(9.0f, 13.586f)
                lineTo(8.417f, 13.0f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, false, -2.834f, 0.0f)
                lineTo(4.0f, 14.586f)
                verticalLineTo(8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 5.0f)
                close()
                moveTo(6.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 9.0f)
                close()
            }
        }
            .build()
        return _image!!
    }

private var _image: ImageVector? = null
