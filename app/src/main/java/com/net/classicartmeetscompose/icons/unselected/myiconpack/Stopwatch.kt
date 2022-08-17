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

public val UnselectedIcons.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.734f, 7.933f)
                arcToRelative(0.493f, 0.493f, 0.0f, false, false, 0.12f, -0.08f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, -0.707f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.528f, 0.528f, 0.0f, false, false, -0.1f, 0.153f)
                arcTo(7.955f, 7.955f, 0.0f, false, false, 12.5f, 5.525f)
                lineTo(12.5f, 3.5f)
                lineTo(14.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(10.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(1.5f)
                lineTo(11.5f, 5.525f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 6.234f, 2.408f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 7.0f, -7.0f)
                arcTo(7.008f, 7.008f, 0.0f, false, true, 12.0f, 20.5f)
                close()
                moveTo(14.391f, 15.687f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.782f, 0.625f)
                lineToRelative(-2.0f, -2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 13.5f)
                lineTo(11.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(3.324f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
