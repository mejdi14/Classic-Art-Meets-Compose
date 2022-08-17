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

public val UnselectedIcons.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.5f)
                lineTo(7.0f, 3.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 2.5f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.476f, 4.476f, 0.0f, false, false, 0.117f, 0.989f)
                arcToRelative(0.518f, 0.518f, 0.0f, false, false, 0.041f, 0.132f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 7.0f, 20.5f)
                lineTo(17.0f, 20.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 21.5f, 16.0f)
                lineTo(21.5f, 8.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 17.0f, 3.5f)
                close()
                moveTo(7.0f, 4.5f)
                lineTo(17.0f, 4.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 8.0f)
                verticalLineToRelative(5.793f)
                lineTo(16.063f, 9.356f)
                arcToRelative(1.505f, 1.505f, 0.0f, false, false, -2.126f, 0.0f)
                lineTo(9.0f, 14.3f)
                lineToRelative(-0.94f, -0.94f)
                arcToRelative(1.543f, 1.543f, 0.0f, false, false, -2.126f, 0.0f)
                lineTo(3.5f, 15.793f)
                lineTo(3.5f, 8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 4.5f)
                close()
                moveTo(17.0f, 19.5f)
                lineTo(7.0f, 19.5f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, true, -3.326f, -2.467f)
                lineToRelative(2.97f, -2.97f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.712f, 0.0f)
                lineTo(8.3f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.7f, 15.0f)
                lineToRelative(4.94f, -4.94f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.712f, 0.0f)
                lineTo(20.5f, 15.207f)
                lineTo(20.5f, 16.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 19.5f)
                close()
                moveTo(7.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 9.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
