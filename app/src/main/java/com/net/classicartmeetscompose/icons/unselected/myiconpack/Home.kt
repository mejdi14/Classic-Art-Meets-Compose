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

public val UnselectedIcons.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(
            name = "Home",
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
                moveTo(19.822f, 7.509f)
                lineToRelative(-5.0f, -4.02f)
                arcToRelative(4.533f, 4.533f, 0.0f, false, false, -5.643f, 0.0f)
                lineToRelative(-5.0f, 4.02f)
                arcTo(4.472f, 4.472f, 0.0f, false, false, 2.5f, 11.01f)
                verticalLineTo(17.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 7.0f, 21.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineTo(21.5f)
                horizontalLineTo(17.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 21.5f, 17.0f)
                verticalLineTo(11.01f)
                arcTo(4.472f, 4.472f, 0.0f, false, false, 19.822f, 7.509f)
                close()
                moveTo(20.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 20.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -7.0f, 0.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 17.0f)
                verticalLineTo(11.01f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, true, 1.3f, -2.722f)
                lineToRelative(5.0f, -4.02f)
                arcToRelative(3.527f, 3.527f, 0.0f, false, true, 4.39f, 0.0f)
                lineToRelative(5.0f, 4.02f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, true, 1.3f, 2.722f)
                close()
            }
        }
            .build()
        return _home!!
    }

private var _home: ImageVector? = null
