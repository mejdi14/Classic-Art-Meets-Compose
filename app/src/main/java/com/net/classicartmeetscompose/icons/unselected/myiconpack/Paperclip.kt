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

public val UnselectedIcons.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.362f, 14.383f)
                lineToRelative(-5.028f, 5.042f)
                arcTo(7.137f, 7.137f, 0.0f, false, true, 10.313f, 21.5f)
                arcToRelative(6.765f, 6.765f, 0.0f, false, true, -4.832f, -1.98f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, 0.095f, -9.877f)
                lineTo(11.3f, 3.9f)
                arcToRelative(4.757f, 4.757f, 0.0f, false, true, 6.741f, 0.0f)
                arcToRelative(4.791f, 4.791f, 0.0f, false, true, 0.0f, 6.756f)
                lineTo(12.29f, 16.427f)
                arcToRelative(2.69f, 2.69f, 0.0f, false, true, -3.725f, 0.0f)
                arcToRelative(2.648f, 2.648f, 0.0f, false, true, 0.0f, -3.731f)
                lineToRelative(5.056f, -5.069f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, 0.706f)
                lineTo(9.273f, 13.4f)
                arcToRelative(1.646f, 1.646f, 0.0f, false, false, 0.0f, 2.319f)
                arcToRelative(1.668f, 1.668f, 0.0f, false, false, 2.309f, 0.0f)
                lineTo(17.337f, 9.95f)
                arcToRelative(3.789f, 3.789f, 0.0f, false, false, 0.0f, -5.344f)
                arcToRelative(3.849f, 3.849f, 0.0f, false, false, -5.325f, 0.0f)
                lineTo(6.284f, 10.349f)
                arcToRelative(6.081f, 6.081f, 0.0f, false, false, -0.095f, 8.465f)
                arcTo(5.774f, 5.774f, 0.0f, false, false, 10.313f, 20.5f)
                arcToRelative(6.127f, 6.127f, 0.0f, false, false, 4.313f, -1.781f)
                lineToRelative(5.028f, -5.042f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.706f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
