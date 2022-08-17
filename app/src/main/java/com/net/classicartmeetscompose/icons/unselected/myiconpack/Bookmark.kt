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

public val UnselectedIcons.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(
            name = "Bookmark",
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
                moveTo(15.0f, 2.5f)
                horizontalLineTo(9.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 4.5f, 7.0f)
                verticalLineTo(20.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.354f, 1.232f)
                lineToRelative(4.859f, -3.366f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.57f, 0.0f)
                lineToRelative(4.863f, 3.367f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 20.0f)
                verticalLineTo(7.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 15.0f, 2.5f)
                close()
                moveTo(18.5f, 20.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.785f, 0.411f)
                lineToRelative(-4.863f, -3.368f)
                arcToRelative(1.506f, 1.506f, 0.0f, false, false, -1.708f, 0.0f)
                lineTo(6.285f, 20.409f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 20.0f)
                verticalLineTo(7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.0f, 3.5f)
                horizontalLineToRelative(6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 7.0f)
                close()
            }
        }
            .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
