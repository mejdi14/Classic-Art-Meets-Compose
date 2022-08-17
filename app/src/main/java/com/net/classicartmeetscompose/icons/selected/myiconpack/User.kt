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

public val SelectedIcons.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(
            name = "User",
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
                moveTo(7.0f, 7.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 5.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 7.0f, 7.5f)
                close()
                moveTo(16.117f, 13.571f)
                arcToRelative(2.311f, 2.311f, 0.0f, false, false, -1.67f, 0.218f)
                arcToRelative(5.046f, 5.046f, 0.0f, false, true, -4.894f, 0.0f)
                arcToRelative(2.315f, 2.315f, 0.0f, false, false, -1.67f, -0.218f)
                arcToRelative(4.509f, 4.509f, 0.0f, false, false, -3.383f, 4.4f)
                verticalLineToRelative(1.011f)
                arcToRelative(3.535f, 3.535f, 0.0f, false, false, 0.493f, 1.8f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, false, 1.285f, 0.717f)
                lineTo(17.722f, 21.499f)
                arcToRelative(1.493f, 1.493f, 0.0f, false, false, 1.285f, -0.718f)
                arcToRelative(3.529f, 3.529f, 0.0f, false, false, 0.493f, -1.8f)
                lineTo(19.5f, 17.967f)
                arcTo(4.509f, 4.509f, 0.0f, false, false, 16.117f, 13.571f)
                close()
            }
        }
            .build()
        return _user!!
    }

private var _user: ImageVector? = null
