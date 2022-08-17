package com.net.classicartmeetscompose.icons.selected.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.selected.SelectedIcons

public val SelectedIcons.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.716f, 14.736f)
                lineToRelative(-5.028f, 5.042f)
                arcTo(7.638f, 7.638f, 0.0f, false, true, 10.313f, 22.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.264f, 7.264f, 0.0f, false, true, -5.185f, -2.127f)
                arcToRelative(7.507f, 7.507f, 0.0f, false, true, 0.1f, -10.582f)
                lineTo(10.95f, 3.547f)
                arcToRelative(5.257f, 5.257f, 0.0f, false, true, 7.449f, 0.0f)
                arcToRelative(5.293f, 5.293f, 0.0f, false, true, 0.0f, 7.463f)
                lineToRelative(-5.755f, 5.77f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -4.433f, 0.0f)
                arcToRelative(3.146f, 3.146f, 0.0f, false, true, 0.0f, -4.436f)
                lineToRelative(5.055f, -5.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.416f, 1.413f)
                lineTo(9.627f, 13.756f)
                arcToRelative(1.136f, 1.136f, 0.0f, true, false, 1.6f, 1.612f)
                lineTo(16.983f, 9.6f)
                arcToRelative(3.291f, 3.291f, 0.0f, false, false, 0.0f, -4.639f)
                arcToRelative(3.338f, 3.338f, 0.0f, false, false, -4.617f, 0.0f)
                lineTo(6.638f, 10.7f)
                arcToRelative(5.572f, 5.572f, 0.0f, false, false, -0.095f, 7.758f)
                arcTo(5.278f, 5.278f, 0.0f, false, false, 10.312f, 20.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.628f, 5.628f, 0.0f, false, false, 3.959f, -1.634f)
                lineTo(19.3f, 13.324f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.416f, 1.412f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
