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

public val HomeIcon.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.671f, 15.518f)
                lineToRelative(-1.107f, -1.845f)
                arcTo(4.005f, 4.005f, 0.0f, false, true, 19.0f, 11.617f)
                lineTo(19.0f, 8.99f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -13.99f, 0.0f)
                verticalLineToRelative(2.627f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.569f, 2.055f)
                lineTo(3.33f, 15.518f)
                arcTo(2.3f, 2.3f, 0.0f, false, false, 5.3f, 19.0f)
                lineTo(9.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                horizontalLineToRelative(3.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 1.974f, -3.482f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(18.959f, 16.848f)
                arcTo(0.292f, 0.292f, 0.0f, false, true, 18.7f, 17.0f)
                lineTo(5.3f, 17.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.258f, -0.453f)
                lineTo(6.151f, 14.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.854f, -3.083f)
                lineTo(7.005f, 8.99f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 9.99f, 0.0f)
                verticalLineToRelative(2.627f)
                arcToRelative(6.008f, 6.008f, 0.0f, false, false, 0.854f, 3.084f)
                lineToRelative(1.107f, 1.846f)
                arcTo(0.291f, 0.291f, 0.0f, false, true, 18.959f, 16.848f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
