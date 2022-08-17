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

public val UnselectedIcons.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.894f, 9.692f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, true, 0.0f, -1.342f)
                lineToRelative(2.553f, -5.106f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 19.0f, 2.521f)
                horizontalLineTo(9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineTo(20.979f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineTo(15.521f)
                horizontalLineTo(19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.447f, -0.724f)
                close()
                moveTo(5.5f, 14.521f)
                verticalLineToRelative(-7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.0f, 3.521f)
                horizontalLineToRelative(9.191f)
                lineTo(16.0f, 7.9f)
                arcToRelative(2.512f, 2.512f, 0.0f, false, false, 0.0f, 2.236f)
                lineToRelative(2.191f, 4.382f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
