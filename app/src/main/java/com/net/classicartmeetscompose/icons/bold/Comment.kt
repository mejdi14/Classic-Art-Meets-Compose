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

public val HomeIcon.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 8.0f)
                lineTo(2.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.617f, 0.924f)
                arcTo(0.987f, 0.987f, 0.0f, false, false, 3.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -0.293f)
                lineToRelative(2.414f, -2.414f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.829f, 19.0f)
                lineTo(17.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(22.0f, 8.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 17.0f, 3.0f)
                close()
                moveTo(20.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(6.829f, 17.0f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, -2.122f, 0.879f)
                lineTo(4.0f, 18.586f)
                lineTo(4.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
