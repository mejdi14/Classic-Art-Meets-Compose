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

public val UnselectedIcons.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, true, false, 21.5f, 12.0f)
                arcTo(9.511f, 9.511f, 0.0f, false, false, 12.0f, 2.5f)
                close()
                moveTo(12.0f, 20.5f)
                arcTo(8.5f, 8.5f, 0.0f, true, true, 20.5f, 12.0f)
                arcTo(8.51f, 8.51f, 0.0f, false, true, 12.0f, 20.5f)
                close()
                moveTo(15.262f, 6.919f)
                lineTo(11.207f, 7.933f)
                arcToRelative(4.491f, 4.491f, 0.0f, false, false, -3.274f, 3.274f)
                lineTo(6.919f, 15.261f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.45f, 1.865f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, 0.369f, -0.046f)
                lineToRelative(4.055f, -1.013f)
                arcToRelative(4.492f, 4.492f, 0.0f, false, false, 3.274f, -3.274f)
                lineToRelative(1.014f, -4.055f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.819f, -1.819f)
                close()
                moveTo(16.111f, 8.495f)
                lineTo(15.1f, 12.551f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.551f, 15.1f)
                lineTo(8.495f, 16.111f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.606f, -0.607f)
                lineTo(8.9f, 11.449f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 11.449f, 8.9f)
                lineTo(15.5f, 7.889f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.607f, 0.606f)
                close()
                moveTo(13.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 12.0f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
