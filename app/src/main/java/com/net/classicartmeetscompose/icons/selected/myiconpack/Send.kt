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

public val SelectedIcons.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(
            name = "Send",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF41416e)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.421f, 5.669f)
                lineToRelative(-3.28f, 13.12f)
                arcToRelative(3.529f, 3.529f, 0.0f, false, true, -3.47f, 2.71f)
                horizontalLineToRelative(-0.02f)
                arcToRelative(3.524f, 3.524f, 0.0f, false, true, -3.46f, -2.76f)
                lineToRelative(-0.86f, -3.65f)
                lineToRelative(5.38f, -5.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.42f, -1.42f)
                lineToRelative(-5.38f, 5.38f)
                lineToRelative(-3.65f, -0.86f)
                arcToRelative(3.575f, 3.575f, 0.0f, false, true, -0.05f, -6.95f)
                lineToRelative(13.12f, -3.28f)
                arcToRelative(2.548f, 2.548f, 0.0f, false, true, 3.09f, 3.09f)
                close()
            }
        }
            .build()
        return _send!!
    }

private var _send: ImageVector? = null
