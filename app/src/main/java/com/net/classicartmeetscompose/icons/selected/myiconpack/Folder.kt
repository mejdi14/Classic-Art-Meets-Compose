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

public val SelectedIcons.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(
            name = "Folder",
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
                moveTo(21.5f, 12.0f)
                verticalLineToRelative(4.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 17.0f, 20.5f)
                horizontalLineTo(7.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 2.5f, 16.0f)
                verticalLineTo(9.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 7.0f, 4.5f)
                horizontalLineTo(9.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.664f, 0.891f)
                lineToRelative(1.11f, 1.664f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.8f, 7.5f)
                horizontalLineTo(17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 21.5f, 12.0f)
                close()
            }
        }
            .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
