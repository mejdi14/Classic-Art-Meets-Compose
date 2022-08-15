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

public val HomeIcon.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.887f, 10.1f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, -1.913f, -1.605f)
                lineToRelative(-4.05f, -0.58f)
                lineTo(14.115f, 4.3f)
                arcToRelative(2.37f, 2.37f, 0.0f, false, false, -4.23f, 0.0f)
                lineTo(8.076f, 7.911f)
                lineToRelative(-4.05f, 0.58f)
                arcTo(2.34f, 2.34f, 0.0f, false, false, 2.113f, 10.1f)
                arcTo(2.314f, 2.314f, 0.0f, false, false, 2.72f, 12.49f)
                lineTo(5.642f, 15.3f)
                lineToRelative(-0.689f, 3.959f)
                arcToRelative(2.318f, 2.318f, 0.0f, false, false, 0.922f, 2.281f)
                arcToRelative(2.361f, 2.361f, 0.0f, false, false, 2.5f, 0.192f)
                lineTo(12.0f, 19.853f)
                lineToRelative(3.626f, 1.877f)
                arcToRelative(2.363f, 2.363f, 0.0f, false, false, 2.5f, -0.192f)
                arcToRelative(2.318f, 2.318f, 0.0f, false, false, 0.922f, -2.281f)
                lineTo(18.358f, 15.3f)
                lineTo(21.28f, 12.49f)
                arcTo(2.314f, 2.314f, 0.0f, false, false, 21.887f, 10.1f)
                close()
                moveTo(19.895f, 11.053f)
                lineTo(16.589f, 14.229f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.293f, 0.892f)
                lineToRelative(0.781f, 4.484f)
                arcToRelative(0.317f, 0.317f, 0.0f, false, true, -0.135f, 0.324f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.4f, 0.03f)
                lineTo(12.46f, 17.839f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, false, -0.92f, 0.0f)
                lineTo(7.454f, 19.955f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.4f, -0.03f)
                arcToRelative(0.317f, 0.317f, 0.0f, false, true, -0.135f, -0.324f)
                lineTo(7.7f, 15.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.293f, -0.892f)
                lineTo(4.105f, 11.049f)
                arcToRelative(0.311f, 0.311f, 0.0f, false, true, -0.088f, -0.339f)
                arcToRelative(0.339f, 0.339f, 0.0f, false, true, 0.292f, -0.238f)
                lineToRelative(4.568f, -0.655f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.753f, -0.542f)
                lineTo(11.673f, 5.2f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, 0.654f, 0.0f)
                lineTo(14.37f, 9.275f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.753f, 0.542f)
                lineToRelative(4.568f, 0.655f)
                arcToRelative(0.339f, 0.339f, 0.0f, false, true, 0.292f, 0.238f)
                arcTo(0.311f, 0.311f, 0.0f, false, true, 19.9f, 11.049f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
