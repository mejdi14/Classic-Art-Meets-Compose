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

public val UnselectedIcons.User: ImageVector
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
                moveTo(12.0f, 12.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -5.0f, -5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 12.0f, 12.5f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 3.5f)
                close()
                moveTo(19.5f, 17.967f)
                verticalLineToRelative(1.011f)
                arcToRelative(3.526f, 3.526f, 0.0f, false, true, -0.9f, 2.355f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.746f, -0.667f)
                arcToRelative(2.521f, 2.521f, 0.0f, false, false, 0.643f, -1.688f)
                lineTo(18.497f, 17.967f)
                arcToRelative(3.509f, 3.509f, 0.0f, false, false, -2.632f, -3.428f)
                arcToRelative(1.273f, 1.273f, 0.0f, false, false, -0.931f, 0.121f)
                arcToRelative(6.057f, 6.057f, 0.0f, false, true, -5.87f, 0.0f)
                arcToRelative(1.265f, 1.265f, 0.0f, false, false, -0.934f, -0.124f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 5.5f, 17.967f)
                verticalLineToRelative(1.011f)
                arcToRelative(2.521f, 2.521f, 0.0f, false, false, 0.643f, 1.688f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.746f, 0.667f)
                arcToRelative(3.526f, 3.526f, 0.0f, false, true, -0.9f, -2.355f)
                lineTo(4.497f, 17.967f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, true, 3.388f, -4.4f)
                arcToRelative(2.281f, 2.281f, 0.0f, false, true, 1.67f, 0.222f)
                arcToRelative(5.05f, 5.05f, 0.0f, false, false, 4.889f, 0.0f)
                arcToRelative(2.271f, 2.271f, 0.0f, false, true, 1.666f, -0.22f)
                arcTo(4.509f, 4.509f, 0.0f, false, true, 19.5f, 17.967f)
                close()
            }
        }
            .build()
        return _user!!
    }

private var _user: ImageVector? = null
