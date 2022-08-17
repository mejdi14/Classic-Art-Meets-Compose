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

public val UnselectedIcons.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.5f)
                lineTo(5.5f, 2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(3.5f, 6.586f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, 0.439f, 1.06f)
                lineToRelative(5.122f, 5.121f)
                arcTo(1.493f, 1.493f, 0.0f, false, true, 9.5f, 13.828f)
                lineTo(9.5f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.276f, 0.447f)
                arcTo(0.508f, 0.508f, 0.0f, false, false, 10.0f, 21.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.3f, -0.1f)
                lineToRelative(4.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.2f, -0.4f)
                lineTo(14.5f, 13.828f)
                arcToRelative(1.493f, 1.493f, 0.0f, false, true, 0.439f, -1.061f)
                lineToRelative(5.122f, -5.121f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, 0.439f, -1.06f)
                lineTo(20.5f, 4.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.5f, 2.5f)
                close()
                moveTo(5.5f, 3.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.5f, 6.5f)
                verticalLineToRelative(-2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.5f, 3.5f)
                close()
                moveTo(14.232f, 12.06f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, false, -0.732f, 1.768f)
                lineTo(13.5f, 17.75f)
                lineTo(10.5f, 20.0f)
                lineTo(10.5f, 13.828f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, false, -0.732f, -1.768f)
                lineTo(5.207f, 7.5f)
                lineTo(18.793f, 7.5f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
