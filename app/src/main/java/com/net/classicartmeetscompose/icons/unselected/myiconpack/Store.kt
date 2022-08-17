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

public val UnselectedIcons.Store: ImageVector
    get() {
        if (_store != null) {
            return _store!!
        }
        _store = Builder(
            name = "Store",
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
                moveTo(21.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.026f, -0.158f)
                lineTo(20.386f, 5.576f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 16.117f, 2.5f)
                horizontalLineTo(7.883f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 3.614f, 5.576f)
                lineTo(2.526f, 8.842f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 2.5f, 9.0f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, false, 1.0f, 2.446f)
                lineToRelative(0.0f, 0.012f)
                verticalLineTo(18.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.0f, 21.5f)
                horizontalLineToRelative(3.527f)
                verticalLineTo(18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 18.0f)
                verticalLineTo(11.458f)
                lineToRelative(0.0f, -0.012f)
                arcTo(3.494f, 3.494f, 0.0f, false, false, 21.5f, 9.0f)
                close()
                moveTo(4.562f, 5.893f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.883f, 3.5f)
                horizontalLineToRelative(8.234f)
                arcToRelative(3.494f, 3.494f, 0.0f, false, true, 3.32f, 2.393f)
                lineTo(20.5f, 9.077f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.01f, 11.5f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, -2.538f, -1.666f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 15.0f, 9.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.471f, 0.338f)
                arcToRelative(2.752f, 2.752f, 0.0f, false, true, -5.054f, 0.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.0f, 9.5f)
                arcToRelative(0.589f, 0.589f, 0.0f, false, false, -0.474f, 0.334f)
                arcTo(2.74f, 2.74f, 0.0f, false, true, 5.99f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.5f, 9.077f)
                close()
                moveTo(17.0f, 20.5f)
                horizontalLineTo(14.527f)
                verticalLineTo(18.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 18.0f)
                verticalLineTo(12.151f)
                arcToRelative(3.44f, 3.44f, 0.0f, false, false, 1.49f, 0.349f)
                arcTo(3.853f, 3.853f, 0.0f, false, false, 9.0f, 11.034f)
                arcToRelative(3.809f, 3.809f, 0.0f, false, false, 6.006f, 0.0f)
                arcTo(3.854f, 3.854f, 0.0f, false, false, 18.01f, 12.5f)
                arcToRelative(3.44f, 3.44f, 0.0f, false, false, 1.49f, -0.349f)
                verticalLineTo(18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 20.5f)
                close()
            }
        }
            .build()
        return _store!!
    }

private var _store: ImageVector? = null
