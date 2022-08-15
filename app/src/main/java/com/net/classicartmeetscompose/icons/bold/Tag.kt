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

public val HomeIcon.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.537f, 10.0f)
                lineTo(14.0f, 3.465f)
                arcTo(4.972f, 4.972f, 0.0f, false, false, 10.468f, 2.0f)
                lineTo(6.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineToRelative(4.466f)
                arcTo(4.968f, 4.968f, 0.0f, false, false, 3.466f, 14.0f)
                lineTo(10.0f, 20.535f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 7.071f, 0.0f)
                lineToRelative(3.466f, -3.466f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 20.537f, 10.0f)
                close()
                moveTo(19.123f, 15.657f)
                lineTo(15.656f, 19.123f)
                arcToRelative(3.072f, 3.072f, 0.0f, false, true, -4.242f, 0.0f)
                lineTo(4.88f, 12.588f)
                arcTo(2.982f, 2.982f, 0.0f, false, true, 4.0f, 10.466f)
                lineTo(4.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 4.0f)
                horizontalLineToRelative(4.467f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, true, 2.121f, 0.879f)
                lineToRelative(6.534f, 6.533f)
                arcTo(3.005f, 3.005f, 0.0f, false, true, 19.123f, 15.655f)
                close()
                moveTo(9.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 7.5f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
