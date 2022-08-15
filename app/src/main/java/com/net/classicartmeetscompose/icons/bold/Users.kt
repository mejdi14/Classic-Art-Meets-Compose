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

public val HomeIcon.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.639f)
                verticalLineToRelative(0.507f)
                arcToRelative(3.754f, 3.754f, 0.0f, false, true, -0.974f, 2.526f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.482f, -1.344f)
                arcTo(1.754f, 1.754f, 0.0f, false, false, 15.0f, 18.146f)
                verticalLineToRelative(-0.507f)
                arcToRelative(2.685f, 2.685f, 0.0f, false, false, -2.036f, -2.618f)
                arcToRelative(0.649f, 0.649f, 0.0f, false, false, -0.476f, 0.058f)
                arcToRelative(6.227f, 6.227f, 0.0f, false, true, -5.967f, 0.0f)
                arcToRelative(0.647f, 0.647f, 0.0f, false, false, -0.485f, -0.063f)
                arcTo(2.685f, 2.685f, 0.0f, false, false, 4.0f, 17.639f)
                verticalLineToRelative(0.507f)
                arcToRelative(1.756f, 1.756f, 0.0f, false, false, 0.456f, 1.182f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.482f, 1.344f)
                arcTo(3.754f, 3.754f, 0.0f, false, true, 2.0f, 18.146f)
                verticalLineToRelative(-0.507f)
                arcToRelative(4.684f, 4.684f, 0.0f, false, true, 3.554f, -4.56f)
                arcToRelative(2.693f, 2.693f, 0.0f, false, true, 1.938f, 0.256f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 4.025f, -0.005f)
                arcToRelative(2.688f, 2.688f, 0.0f, false, true, 1.929f, -0.251f)
                arcTo(4.684f, 4.684f, 0.0f, false, true, 17.0f, 17.639f)
                close()
                moveTo(18.446f, 13.079f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.482f, 1.942f)
                arcTo(2.685f, 2.685f, 0.0f, false, true, 20.0f, 17.639f)
                verticalLineToRelative(0.507f)
                arcToRelative(1.754f, 1.754f, 0.0f, false, true, -0.456f, 1.182f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.482f, 1.344f)
                arcTo(3.754f, 3.754f, 0.0f, false, false, 22.0f, 18.146f)
                verticalLineToRelative(-0.507f)
                arcTo(4.684f, 4.684f, 0.0f, false, false, 18.446f, 13.079f)
                close()
                moveTo(4.5f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 4.5f, 8.0f)
                close()
                moveTo(6.5f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.5f, 8.0f)
                close()
                moveTo(19.5f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.376f, -4.961f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.248f, 1.984f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.5f, 5.319f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.251f, 1.56f)
                arcTo(4.976f, 4.976f, 0.0f, false, false, 19.5f, 8.0f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
