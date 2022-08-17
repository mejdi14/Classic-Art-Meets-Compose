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

public val UnselectedIcons.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6f, 7.74f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -1.745f, 0.082f)
                lineTo(15.5f, 10.055f)
                lineTo(15.5f, 10.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 11.0f, 5.5f)
                lineTo(7.0f, 5.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 2.5f, 10.0f)
                verticalLineToRelative(4.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 7.0f, 18.5f)
                horizontalLineToRelative(4.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 15.5f, 14.0f)
                verticalLineToRelative(-0.055f)
                lineToRelative(3.359f, 2.232f)
                arcTo(1.7f, 1.7f, 0.0f, false, false, 21.5f, 14.761f)
                lineTo(21.5f, 9.238f)
                arcTo(1.7f, 1.7f, 0.0f, false, false, 20.6f, 7.74f)
                close()
                moveTo(14.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 11.0f, 17.5f)
                lineTo(7.0f, 17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 14.0f)
                lineTo(3.5f, 10.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 6.5f)
                horizontalLineToRelative(4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 14.5f, 10.0f)
                close()
                moveTo(20.5f, 14.761f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -1.087f, 0.583f)
                lineToRelative(-3.913f, -2.6f)
                lineTo(15.5f, 11.256f)
                lineToRelative(3.912f, -2.6f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 1.088f, 0.583f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
