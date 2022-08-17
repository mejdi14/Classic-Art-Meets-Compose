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

public val UnselectedIcons.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(
            name = "Download",
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
                moveTo(8.646f, 8.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, -0.708f)
                lineTo(11.5f, 9.793f)
                verticalLineTo(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineTo(9.793f)
                lineToRelative(2.146f, -2.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.708f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                close()
                moveTo(17.0f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 15.0f)
                verticalLineToRelative(1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 19.5f)
                horizontalLineTo(7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 16.0f)
                verticalLineTo(15.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 2.5f, 15.0f)
                verticalLineToRelative(1.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 7.0f, 20.5f)
                horizontalLineTo(17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 21.5f, 16.0f)
                verticalLineTo(15.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 17.0f, 10.5f)
                close()
                moveTo(17.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 16.0f)
                close()
            }
        }
            .build()
        return _download!!
    }

private var _download: ImageVector? = null
