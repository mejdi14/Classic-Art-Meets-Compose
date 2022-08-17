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

public val UnselectedIcons.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 9.776f)
                lineTo(16.5f, 7.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -9.0f, 0.0f)
                lineTo(7.5f, 9.776f)
                arcTo(4.493f, 4.493f, 0.0f, false, false, 4.5f, 14.0f)
                verticalLineToRelative(3.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 9.0f, 21.5f)
                horizontalLineToRelative(6.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 17.0f)
                lineTo(19.5f, 14.0f)
                arcTo(4.493f, 4.493f, 0.0f, false, false, 16.5f, 9.776f)
                close()
                moveTo(8.5f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                lineTo(15.5f, 9.55f)
                arcTo(4.576f, 4.576f, 0.0f, false, false, 15.0f, 9.5f)
                lineTo(9.0f, 9.5f)
                arcToRelative(4.576f, 4.576f, 0.0f, false, false, -0.5f, 0.05f)
                close()
                moveTo(18.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.0f, 20.5f)
                lineTo(9.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 17.0f)
                lineTo(5.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.0f, 10.5f)
                horizontalLineToRelative(6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 14.0f)
                close()
                moveTo(12.5f, 15.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(11.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
