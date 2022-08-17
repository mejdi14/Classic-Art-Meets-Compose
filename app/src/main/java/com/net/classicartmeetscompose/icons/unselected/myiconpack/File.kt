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

public val UnselectedIcons.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.061f, 7.354f)
                lineTo(14.646f, 2.939f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, -1.06f, -0.439f)
                horizontalLineTo(9.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 4.5f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 9.0f, 21.5f)
                horizontalLineToRelative(6.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 17.0f)
                verticalLineTo(8.414f)
                arcTo(1.49f, 1.49f, 0.0f, false, false, 19.061f, 7.354f)
                close()
                moveTo(14.5f, 4.207f)
                lineTo(17.793f, 7.5f)
                horizontalLineTo(16.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 20.5f)
                horizontalLineTo(9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 17.0f)
                verticalLineTo(7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.0f, 3.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.0f, 20.5f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
