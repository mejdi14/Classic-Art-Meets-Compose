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

public val UnselectedIcons.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(16.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-7.0f)
                lineTo(8.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(0.5f)
                lineTo(7.0f, 3.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 2.5f, 8.0f)
                verticalLineToRelative(9.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 7.0f, 21.5f)
                lineTo(17.0f, 21.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 21.5f, 17.0f)
                lineTo(21.5f, 8.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 17.0f, 3.5f)
                close()
                moveTo(7.0f, 4.5f)
                horizontalLineToRelative(0.5f)
                lineTo(7.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(8.5f, 4.5f)
                horizontalLineToRelative(7.0f)
                lineTo(15.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(16.5f, 4.5f)
                lineTo(17.0f, 4.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 8.0f)
                verticalLineToRelative(0.5f)
                lineTo(3.5f, 8.5f)
                lineTo(3.5f, 8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 4.5f)
                close()
                moveTo(17.0f, 20.5f)
                lineTo(7.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 17.0f)
                lineTo(3.5f, 9.5f)
                horizontalLineToRelative(17.0f)
                lineTo(20.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 20.5f)
                close()
                moveTo(17.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 13.0f)
                close()
                moveTo(13.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 13.0f)
                close()
                moveTo(9.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 13.0f)
                close()
                moveTo(17.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(13.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 17.0f)
                close()
                moveTo(9.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 17.0f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
