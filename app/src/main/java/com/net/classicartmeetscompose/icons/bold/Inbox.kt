package com.net.classicartmeetscompose.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.HomeIcon

public val HomeIcon.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(8.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 10.0f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(9.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 8.0f)
                close()
                moveTo(22.0f, 13.487f)
                lineTo(22.0f, 16.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(7.0f, 21.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(2.0f, 13.487f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, true, 0.205f, -1.265f)
                lineToRelative(1.935f, -5.8f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 8.883f, 3.0f)
                horizontalLineToRelative(6.234f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 19.86f, 6.419f)
                lineToRelative(1.935f, 5.8f)
                arcTo(3.99f, 3.99f, 0.0f, false, true, 22.0f, 13.487f)
                close()
                moveTo(4.387f, 12.0f)
                lineTo(9.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.613f)
                lineToRelative(-1.65f, -4.948f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.117f, 5.0f)
                lineTo(8.883f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.037f, 7.052f)
                close()
                moveTo(20.0f, 16.0f)
                lineTo(20.0f, 14.0f)
                lineTo(15.874f, 14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.748f, 0.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(17.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.0f, 16.0f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null