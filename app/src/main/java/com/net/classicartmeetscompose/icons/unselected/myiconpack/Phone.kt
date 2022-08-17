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

public val UnselectedIcons.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.44f, 16.643f)
                arcToRelative(3.288f, 3.288f, 0.0f, false, false, -0.075f, -0.333f)
                arcToRelative(1.471f, 1.471f, 0.0f, false, false, -1.186f, -1.033f)
                lineToRelative(-4.332f, -0.721f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.431f, 0.549f)
                curveToRelative(-0.051f, 0.065f, -0.1f, 0.131f, -0.145f, 0.2f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, true, -0.671f, 0.222f)
                arcTo(9.861f, 9.861f, 0.0f, false, true, 8.473f, 10.4f)
                arcToRelative(0.537f, 0.537f, 0.0f, false, true, 0.218f, -0.666f)
                curveToRelative(0.089f, -0.061f, 0.175f, -0.125f, 0.26f, -0.193f)
                arcToRelative(1.514f, 1.514f, 0.0f, false, false, 0.541f, -1.411f)
                lineTo(8.821f, 3.872f)
                arcToRelative(1.486f, 1.486f, 0.0f, false, false, -1.0f, -1.19f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -0.474f, -0.119f)
                arcTo(4.029f, 4.029f, 0.0f, false, false, 4.0f, 3.493f)
                arcTo(4.281f, 4.281f, 0.0f, false, false, 2.5f, 6.867f)
                arcTo(15.044f, 15.044f, 0.0f, false, false, 17.132f, 21.5f)
                horizontalLineToRelative(0.116f)
                arcToRelative(4.276f, 4.276f, 0.0f, false, false, 3.241f, -1.489f)
                arcTo(4.073f, 4.073f, 0.0f, false, false, 21.44f, 16.643f)
                close()
                moveTo(19.732f, 19.356f)
                arcTo(3.233f, 3.233f, 0.0f, false, true, 17.159f, 20.5f)
                arcTo(14.042f, 14.042f, 0.0f, false, true, 3.5f, 6.84f)
                arcTo(3.287f, 3.287f, 0.0f, false, true, 4.65f, 4.251f)
                arcTo(3.062f, 3.062f, 0.0f, false, true, 6.645f, 3.5f)
                arcToRelative(3.025f, 3.025f, 0.0f, false, true, 0.526f, 0.047f)
                arcToRelative(2.332f, 2.332f, 0.0f, false, true, 0.335f, 0.084f)
                arcToRelative(0.492f, 0.492f, 0.0f, false, true, 0.327f, 0.4f)
                lineTo(8.5f, 8.283f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.182f, 0.477f)
                curveToRelative(-0.062f, 0.051f, -0.127f, 0.1f, -0.194f, 0.144f)
                arcTo(1.531f, 1.531f, 0.0f, false, false, 7.556f, 10.8f)
                arcTo(10.861f, 10.861f, 0.0f, false, false, 13.2f, 16.442f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, false, 1.9f, -0.576f)
                curveToRelative(0.033f, -0.048f, 0.068f, -0.1f, 0.105f, -0.143f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.481f, -0.181f)
                lineToRelative(4.332f, 0.722f)
                arcToRelative(0.466f, 0.466f, 0.0f, false, true, 0.387f, 0.316f)
                curveToRelative(0.02f, 0.069f, 0.037f, 0.147f, 0.053f, 0.234f)
                arcTo(3.072f, 3.072f, 0.0f, false, true, 19.732f, 19.356f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
