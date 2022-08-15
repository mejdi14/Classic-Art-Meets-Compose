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

public val HomeIcon.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                lineTo(5.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 4.5f)
                lineTo(3.0f, 6.586f)
                arcTo(2.011f, 2.011f, 0.0f, false, false, 3.586f, 8.0f)
                lineToRelative(5.121f, 5.121f)
                arcTo(1.009f, 1.009f, 0.0f, false, true, 9.0f, 13.828f)
                lineTo(9.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.6f, 0.8f)
                lineToRelative(4.0f, -3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 18.0f)
                lineTo(15.0f, 13.828f)
                arcToRelative(1.009f, 1.009f, 0.0f, false, true, 0.293f, -0.707f)
                lineTo(20.414f, 8.0f)
                arcTo(2.011f, 2.011f, 0.0f, false, false, 21.0f, 6.586f)
                lineTo(21.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 2.0f)
                close()
                moveTo(5.5f, 4.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(19.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                lineTo(5.0f, 4.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 4.0f)
                close()
                moveTo(13.879f, 11.707f)
                arcTo(2.978f, 2.978f, 0.0f, false, false, 13.0f, 13.828f)
                lineTo(13.0f, 17.5f)
                lineTo(11.0f, 19.0f)
                lineTo(11.0f, 13.828f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, -0.879f, -2.121f)
                lineTo(6.414f, 8.0f)
                lineTo(17.586f, 8.0f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
