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

public val UnselectedIcons.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(
            name = "Inbox",
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
                moveTo(7.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 9.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(8.0f, 10.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 10.0f)
                close()
                moveTo(9.0f, 7.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(9.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                close()
                moveTo(21.5f, 13.487f)
                lineTo(21.5f, 16.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 17.0f, 20.5f)
                lineTo(7.0f, 20.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 2.5f, 16.0f)
                lineTo(2.5f, 13.487f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.18f, -1.107f)
                lineToRelative(1.934f, -5.8f)
                arcTo(4.494f, 4.494f, 0.0f, false, true, 8.883f, 3.5f)
                horizontalLineToRelative(6.234f)
                arcToRelative(4.494f, 4.494f, 0.0f, false, true, 4.269f, 3.076f)
                lineToRelative(1.934f, 5.8f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 21.5f, 13.487f)
                close()
                moveTo(3.693f, 12.5f)
                lineTo(9.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5.307f)
                lineToRelative(-1.87f, -5.607f)
                arcTo(3.494f, 3.494f, 0.0f, false, false, 15.117f, 4.5f)
                lineTo(8.883f, 4.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.562f, 6.893f)
                close()
                moveTo(20.5f, 16.0f)
                lineTo(20.5f, 13.5f)
                lineTo(15.464f, 13.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.928f, 0.0f)
                lineTo(3.5f, 13.5f)
                lineTo(3.5f, 16.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.0f, 19.5f)
                lineTo(17.0f, 19.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 16.0f)
                close()
            }
        }
            .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
