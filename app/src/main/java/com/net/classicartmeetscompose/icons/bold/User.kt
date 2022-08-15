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

public val HomeIcon.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                arcTo(5.5f, 5.5f, 0.0f, true, false, 6.5f, 7.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 8.5f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 4.0f)
                close()
                moveTo(20.0f, 17.967f)
                verticalLineToRelative(1.011f)
                arcToRelative(4.023f, 4.023f, 0.0f, false, true, -1.025f, 2.689f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.49f, -1.334f)
                arcTo(2.03f, 2.03f, 0.0f, false, false, 18.0f, 18.978f)
                lineTo(18.0f, 17.967f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, false, -2.253f, -2.943f)
                arcToRelative(0.765f, 0.765f, 0.0f, false, false, -0.561f, 0.071f)
                arcToRelative(6.571f, 6.571f, 0.0f, false, true, -6.362f, 0.006f)
                arcToRelative(0.774f, 0.774f, 0.0f, false, false, -0.569f, -0.077f)
                arcTo(3.01f, 3.01f, 0.0f, false, false, 6.0f, 17.967f)
                verticalLineToRelative(1.011f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, false, 0.515f, 1.355f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.49f, 1.334f)
                arcTo(4.023f, 4.023f, 0.0f, false, true, 4.0f, 18.978f)
                lineTo(4.0f, 17.967f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, true, 3.767f, -4.882f)
                arcToRelative(2.772f, 2.772f, 0.0f, false, true, 2.039f, 0.273f)
                arcToRelative(4.561f, 4.561f, 0.0f, false, false, 4.4f, -0.005f)
                arcToRelative(2.757f, 2.757f, 0.0f, false, true, 2.031f, -0.268f)
                arcTo(5.007f, 5.007f, 0.0f, false, true, 20.0f, 17.967f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
