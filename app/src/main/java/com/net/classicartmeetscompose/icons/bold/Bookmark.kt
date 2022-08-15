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

public val HomeIcon.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 4.0f, 7.0f)
                lineTo(4.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.139f, 1.645f)
                lineTo(12.0f, 18.275f)
                lineToRelative(4.864f, 3.368f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(20.0f, 7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 15.0f, 2.0f)
                close()
                moveTo(18.0f, 20.0f)
                lineTo(13.137f, 16.633f)
                arcToRelative(2.009f, 2.009f, 0.0f, false, false, -2.278f, 0.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
