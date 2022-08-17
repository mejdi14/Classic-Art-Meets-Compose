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

public val UnselectedIcons.Send: ImageVector
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
                moveTo(20.75f, 3.249f)
                arcToRelative(2.535f, 2.535f, 0.0f, false, false, -2.425f, -0.671f)
                lineTo(5.212f, 5.856f)
                arcToRelative(3.581f, 3.581f, 0.0f, false, false, 0.048f, 6.959f)
                lineToRelative(4.8f, 1.129f)
                lineToRelative(1.129f, 4.8f)
                arcToRelative(3.533f, 3.533f, 0.0f, false, false, 3.46f, 2.76f)
                horizontalLineToRelative(0.024f)
                arcToRelative(3.532f, 3.532f, 0.0f, false, false, 3.475f, -2.713f)
                lineTo(21.422f, 5.675f)
                arcTo(2.532f, 2.532f, 0.0f, false, false, 20.75f, 3.249f)
                close()
                moveTo(20.45f, 5.432f)
                lineTo(17.174f, 18.545f)
                arcToRelative(2.518f, 2.518f, 0.0f, false, true, -2.5f, 1.955f)
                horizontalLineToRelative(-0.018f)
                arcToRelative(2.518f, 2.518f, 0.0f, false, true, -2.493f, -1.99f)
                lineToRelative(-1.136f, -4.826f)
                lineToRelative(4.331f, -4.331f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.707f)
                lineToRelative(-4.33f, 4.331f)
                lineTo(5.49f, 11.841f)
                arcTo(2.518f, 2.518f, 0.0f, false, true, 3.5f, 9.347f)
                arcTo(2.518f, 2.518f, 0.0f, false, true, 5.455f, 6.826f)
                lineTo(18.567f, 3.548f)
                arcTo(1.576f, 1.576f, 0.0f, false, true, 18.95f, 3.5f)
                arcToRelative(1.556f, 1.556f, 0.0f, false, true, 1.5f, 1.932f)
                close()
            }
        }
            .build()
        return _send!!
    }

private var _send: ImageVector? = null
