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

public val SelectedIcons.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(
            name = "Flag",
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
                moveTo(19.448f, 14.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.448f, 0.723f)
                horizontalLineTo(6.5f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(6.993f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 9.0f, 2.493f)
                horizontalLineTo(19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.448f, 0.724f)
                lineTo(16.9f, 8.322f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, false, 0.0f, 1.342f)
                close()
            }
        }
            .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
