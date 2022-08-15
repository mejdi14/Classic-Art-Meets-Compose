package com.net.classicartmeetscompose.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.HomeIcon

public val HomeIcon.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.587f, 9.173f)
                lineTo(17.0f, 8.586f)
                verticalLineTo(6.364f)
                arcTo(6.128f, 6.128f, 0.0f, false, false, 18.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 3.0f)
                arcTo(6.121f, 6.121f, 0.0f, false, false, 7.0f, 6.364f)
                verticalLineTo(8.586f)
                lineToRelative(-0.587f, 0.587f)
                arcTo(8.186f, 8.186f, 0.0f, false, false, 4.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcTo(8.185f, 8.185f, 0.0f, false, false, 17.587f, 9.173f)
                close()
                moveTo(6.079f, 14.0f)
                arcToRelative(6.192f, 6.192f, 0.0f, false, true, 1.748f, -3.412f)
                lineToRelative(0.88f, -0.88f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 9.0f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.293f, -0.707f)
                arcTo(2.91f, 2.91f, 0.0f, false, true, 8.122f, 4.0f)
                horizontalLineToRelative(7.756f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, true, -0.585f, 1.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 6.0f)
                verticalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, 0.707f)
                lineToRelative(0.88f, 0.88f)
                arcTo(6.2f, 6.2f, 0.0f, false, true, 17.921f, 14.0f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
