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

public val UnselectedIcons.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(
            name = "Envelope",
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
                moveTo(17.0f, 4.5f)
                horizontalLineTo(7.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 2.5f, 9.0f)
                verticalLineToRelative(6.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 7.0f, 19.5f)
                horizontalLineTo(17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 21.5f, 15.0f)
                verticalLineTo(9.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 17.0f, 4.5f)
                close()
                moveTo(7.0f, 5.5f)
                horizontalLineTo(17.0f)
                arcToRelative(3.493f, 3.493f, 0.0f, false, true, 3.3f, 2.368f)
                lineToRelative(-6.355f, 4.237f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, -3.882f, 0.0f)
                lineTo(3.7f, 7.868f)
                arcTo(3.493f, 3.493f, 0.0f, false, true, 7.0f, 5.5f)
                close()
                moveTo(20.5f, 15.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 18.5f)
                horizontalLineTo(7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 15.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -0.021f, 0.006f, -0.041f, 0.006f, -0.062f)
                lineToRelative(6.0f, 4.0f)
                arcToRelative(4.489f, 4.489f, 0.0f, false, false, 4.992f, 0.0f)
                lineToRelative(6.0f, -4.0f)
                curveToRelative(0.0f, 0.021f, 0.006f, 0.041f, 0.006f, 0.062f)
                close()
            }
        }
            .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
