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

public val SelectedIcons.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(
            name = "Thumbtack",
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
                moveTo(19.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                arcTo(7.69f, 7.69f, 0.0f, false, true, 6.767f, 9.526f)
                lineTo(7.5f, 8.793f)
                verticalLineToRelative(-2.6f)
                arcTo(5.487f, 5.487f, 0.0f, false, true, 6.5f, 3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 2.5f)
                horizontalLineTo(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, true, -1.0f, 3.191f)
                verticalLineToRelative(2.6f)
                lineToRelative(0.733f, 0.733f)
                arcTo(7.69f, 7.69f, 0.0f, false, true, 19.5f, 15.0f)
                close()
            }
        }
            .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
