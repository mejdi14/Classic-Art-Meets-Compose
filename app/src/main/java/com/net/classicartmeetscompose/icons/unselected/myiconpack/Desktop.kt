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

public val UnselectedIcons.Desktop: ImageVector
    get() {
        if (_desktop != null) {
            return _desktop!!
        }
        _desktop = Builder(
            name = "Desktop",
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
                moveTo(17.0f, 2.5f)
                horizontalLineTo(7.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 2.5f, 7.0f)
                verticalLineToRelative(6.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 7.0f, 17.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineTo(12.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 21.5f, 13.0f)
                verticalLineTo(7.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 17.0f, 2.5f)
                close()
                moveTo(20.5f, 13.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 16.5f)
                horizontalLineTo(7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 13.0f)
                verticalLineTo(7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 3.5f)
                horizontalLineTo(17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 7.0f)
                close()
            }
        }
            .build()
        return _desktop!!
    }

private var _desktop: ImageVector? = null
