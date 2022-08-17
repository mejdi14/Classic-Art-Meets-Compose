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

public val UnselectedIcons.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.019f, 7.5f)
                horizontalLineToRelative(-4.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.832f, -0.445f)
                lineTo(10.88f, 5.391f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.216f, 4.5f)
                horizontalLineToRelative(-2.2f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 2.519f, 9.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.5f, 4.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, 4.5f, -4.5f)
                lineTo(21.519f, 12.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 17.019f, 7.5f)
                close()
                moveTo(20.519f, 16.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, -3.5f)
                lineTo(3.519f, 9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                horizontalLineToRelative(2.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.832f, 0.445f)
                lineToRelative(1.109f, 1.664f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.664f, 0.891f)
                horizontalLineToRelative(4.2f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
