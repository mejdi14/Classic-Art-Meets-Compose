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

public val HomeIcon.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                lineTo(17.441f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.948f, -0.683f)
                lineToRelative(-0.316f, -0.95f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.279f, 2.0f)
                lineTo(9.721f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.9f, 1.368f)
                lineToRelative(-0.316f, 0.948f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.559f, 5.0f)
                lineTo(3.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 7.0f)
                lineTo(4.065f, 7.0f)
                lineToRelative(0.751f, 11.266f)
                arcTo(4.01f, 4.01f, 0.0f, false, false, 8.807f, 22.0f)
                horizontalLineToRelative(6.386f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, false, 3.991f, -3.734f)
                lineTo(19.935f, 7.0f)
                lineTo(21.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(9.721f, 4.0f)
                horizontalLineToRelative(4.558f)
                lineToRelative(0.316f, 0.95f)
                curveToRelative(0.006f, 0.018f, 0.016f, 0.033f, 0.022f, 0.051f)
                lineTo(9.383f, 5.001f)
                curveToRelative(0.006f, -0.018f, 0.016f, -0.034f, 0.022f, -0.052f)
                close()
                moveTo(17.189f, 18.133f)
                arcToRelative(2.005f, 2.005f, 0.0f, false, true, -2.0f, 1.867f)
                lineTo(8.807f, 20.0f)
                arcToRelative(2.005f, 2.005f, 0.0f, false, true, -2.0f, -1.867f)
                lineTo(6.069f, 7.0f)
                horizontalLineToRelative(0.49f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, false, 0.316f, -0.025f)
                arcTo(1.063f, 1.063f, 0.0f, false, false, 7.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                arcToRelative(1.063f, 1.063f, 0.0f, false, false, 0.125f, -0.025f)
                arcTo(3.013f, 3.013f, 0.0f, false, false, 17.441f, 7.0f)
                horizontalLineToRelative(0.49f)
                close()
                moveTo(15.0f, 11.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(13.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
