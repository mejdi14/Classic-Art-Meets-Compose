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

public val UnselectedIcons.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.5f)
                horizontalLineTo(7.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 2.5f, 8.0f)
                verticalLineTo(21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.309f, 0.462f)
                arcTo(0.493f, 0.493f, 0.0f, false, false, 3.0f, 21.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.354f, -0.147f)
                lineToRelative(2.414f, -2.414f)
                arcTo(1.491f, 1.491f, 0.0f, false, true, 6.829f, 18.5f)
                horizontalLineTo(17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 21.5f, 14.0f)
                verticalLineTo(8.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 17.0f, 3.5f)
                close()
                moveTo(20.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 17.5f)
                horizontalLineTo(6.829f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, false, -1.768f, 0.732f)
                lineTo(3.5f, 19.793f)
                verticalLineTo(8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 4.5f)
                horizontalLineTo(17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 8.0f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
