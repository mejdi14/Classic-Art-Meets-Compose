package com.net.classicartmeetscompose.unselected.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.unselected.icons.MyIconPack

public val MyIconPack.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                close()
                moveTo(20.242f, 15.775f)
                lineTo(19.135f, 13.93f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.64f, -2.313f)
                lineTo(18.495f, 8.99f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -12.99f, 0.0f)
                verticalLineToRelative(2.627f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.64f, 2.313f)
                lineTo(3.758f, 15.775f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 5.3f, 18.5f)
                lineTo(18.7f, 18.5f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.545f, -2.725f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
