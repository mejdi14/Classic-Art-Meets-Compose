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

public val HomeIcon.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.414f, 6.0f)
                lineTo(18.0f, 2.586f)
                arcTo(1.986f, 1.986f, 0.0f, false, false, 16.586f, 2.0f)
                lineTo(11.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 7.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(22.0f, 7.414f)
                arcTo(2.011f, 2.011f, 0.0f, false, false, 21.414f, 6.0f)
                close()
                moveTo(17.0f, 4.414f)
                lineTo(19.586f, 7.0f)
                lineTo(18.265f, 7.0f)
                arcTo(1.266f, 1.266f, 0.0f, false, true, 17.0f, 5.735f)
                close()
                moveTo(13.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(4.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 20.0f)
                close()
                moveTo(18.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(9.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(15.0f, 5.735f)
                arcTo(3.269f, 3.269f, 0.0f, false, false, 18.265f, 9.0f)
                lineTo(20.0f, 9.0f)
                verticalLineToRelative(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 16.0f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
