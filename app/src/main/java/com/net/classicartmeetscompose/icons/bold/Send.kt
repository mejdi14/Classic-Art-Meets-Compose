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

public val HomeIcon.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.1f, 2.9f)
                arcToRelative(3.027f, 3.027f, 0.0f, false, false, -2.9f, -0.8f)
                lineTo(5.091f, 5.372f)
                arcTo(4.019f, 4.019f, 0.0f, false, false, 2.0f, 9.358f)
                arcTo(4.022f, 4.022f, 0.0f, false, false, 5.146f, 13.3f)
                lineToRelative(4.5f, 1.057f)
                lineTo(10.7f, 18.854f)
                arcTo(4.021f, 4.021f, 0.0f, false, false, 14.642f, 22.0f)
                horizontalLineToRelative(0.03f)
                arcToRelative(4.019f, 4.019f, 0.0f, false, false, 3.957f, -3.09f)
                horizontalLineToRelative(0.0f)
                lineTo(21.907f, 5.8f)
                arcTo(3.028f, 3.028f, 0.0f, false, false, 21.1f, 2.9f)
                close()
                moveTo(19.967f, 5.312f)
                lineTo(16.688f, 18.425f)
                arcTo(1.976f, 1.976f, 0.0f, false, true, 14.655f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.009f, -1.6f)
                lineTo(11.573f, 13.84f)
                lineToRelative(4.134f, -4.133f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineToRelative(-4.134f, 4.133f)
                lineTo(5.6f, 11.354f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 9.345f)
                arcTo(2.006f, 2.006f, 0.0f, false, true, 5.576f, 7.312f)
                lineTo(18.689f, 4.033f)
                arcTo(1.132f, 1.132f, 0.0f, false, true, 18.956f, 4.0f)
                arcToRelative(1.049f, 1.049f, 0.0f, false, true, 0.734f, 0.311f)
                arcTo(1.039f, 1.039f, 0.0f, false, true, 19.967f, 5.312f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null
