package com.net.classicartmeetscompose.ui.screen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val HomeIcon: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(
            name = "Home",
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
                moveTo(20.135f, 7.118f)
                lineToRelative(-5.0f, -4.019f)
                arcToRelative(5.035f, 5.035f, 0.0f, false, false, -6.27f, 0.0f)
                lineToRelative(-5.0f, 4.019f)
                arcTo(4.973f, 4.973f, 0.0f, false, false, 2.0f, 11.01f)
                verticalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(3.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 22.0f, 17.0f)
                verticalLineTo(11.01f)
                arcTo(4.973f, 4.973f, 0.0f, false, false, 20.135f, 7.118f)
                close()
                moveTo(20.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 17.0f)
                verticalLineTo(11.01f)
                arcTo(2.982f, 2.982f, 0.0f, false, true, 5.118f, 8.677f)
                lineToRelative(5.0f, -4.019f)
                arcToRelative(3.024f, 3.024f, 0.0f, false, true, 3.764f, 0.0f)
                lineToRelative(5.0f, 4.019f)
                arcTo(2.979f, 2.979f, 0.0f, false, true, 20.0f, 11.01f)
                close()
            }
        }
            .build()
        return _home!!
    }

private var _home: ImageVector? = null
