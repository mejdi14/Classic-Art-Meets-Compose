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

public val UnselectedIcons.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(
            name = "Trash",
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
                moveTo(21.0f, 5.5f)
                lineTo(17.441f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.422f, -1.026f)
                lineTo(15.7f, 3.525f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.279f, 2.5f)
                lineTo(9.721f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.3f, 3.525f)
                lineToRelative(-0.315f, 0.949f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.559f, 5.5f)
                lineTo(3.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(4.532f, 6.5f)
                lineToRelative(0.782f, 11.733f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 8.807f, 21.5f)
                horizontalLineToRelative(6.386f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 3.493f, -3.267f)
                lineTo(19.468f, 6.5f)
                lineTo(21.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(9.246f, 3.842f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 9.721f, 3.5f)
                horizontalLineToRelative(4.558f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.474f, 0.342f)
                lineToRelative(0.317f, 0.949f)
                arcToRelative(2.511f, 2.511f, 0.0f, false, false, 0.372f, 0.709f)
                lineTo(8.558f, 5.5f)
                arcToRelative(2.514f, 2.514f, 0.0f, false, false, 0.373f, -0.709f)
                close()
                moveTo(17.687f, 18.167f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.193f, 20.5f)
                lineTo(8.807f, 20.5f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, true, -2.495f, -2.333f)
                lineTo(5.535f, 6.5f)
                lineTo(6.559f, 6.5f)
                arcToRelative(2.541f, 2.541f, 0.0f, false, false, 0.316f, -0.025f)
                arcTo(0.478f, 0.478f, 0.0f, false, false, 7.0f, 6.5f)
                lineTo(17.0f, 6.5f)
                arcToRelative(0.478f, 0.478f, 0.0f, false, false, 0.125f, -0.025f)
                arcToRelative(2.541f, 2.541f, 0.0f, false, false, 0.316f, 0.025f)
                horizontalLineToRelative(1.024f)
                close()
                moveTo(14.5f, 11.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(13.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(10.5f, 11.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(9.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
            }
        }
            .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
