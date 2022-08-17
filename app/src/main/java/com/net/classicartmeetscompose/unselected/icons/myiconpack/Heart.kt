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

public val MyIconPack.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.37f, 11.562f)
                curveToRelative(-0.955f, 4.9f, -5.974f, 8.334f, -8.088f, 9.586f)
                arcToRelative(2.517f, 2.517f, 0.0f, false, true, -2.564f, 0.0f)
                curveTo(8.6f, 19.9f, 3.585f, 16.458f, 2.63f, 11.562f)
                arcTo(7.088f, 7.088f, 0.0f, false, true, 4.083f, 5.755f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.772f, 3.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 12.0f, 4.344f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 15.228f, 3.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.689f, 2.255f)
                arcTo(7.088f, 7.088f, 0.0f, false, true, 21.37f, 11.562f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
