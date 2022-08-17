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

public val UnselectedIcons.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.917f, 5.256f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 15.228f, 3.0f)
                arcTo(6.514f, 6.514f, 0.0f, false, false, 12.0f, 3.844f)
                arcTo(6.514f, 6.514f, 0.0f, false, false, 8.772f, 3.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 4.083f, 5.256f)
                arcTo(7.085f, 7.085f, 0.0f, false, false, 2.63f, 11.062f)
                curveToRelative(0.955f, 4.9f, 5.974f, 8.335f, 8.088f, 9.586f)
                arcToRelative(2.511f, 2.511f, 0.0f, false, false, 2.564f, 0.0f)
                curveToRelative(2.114f, -1.251f, 7.133f, -4.69f, 8.088f, -9.586f)
                arcTo(7.085f, 7.085f, 0.0f, false, false, 19.917f, 5.256f)
                close()
                moveTo(20.388f, 10.87f)
                curveToRelative(-0.877f, 4.5f, -5.618f, 7.735f, -7.616f, 8.918f)
                arcToRelative(1.515f, 1.515f, 0.0f, false, true, -1.544f, 0.0f)
                curveToRelative(-2.0f, -1.183f, -6.739f, -4.419f, -7.616f, -8.918f)
                arcTo(6.071f, 6.071f, 0.0f, false, true, 4.855f, 5.892f)
                arcTo(5.015f, 5.015f, 0.0f, false, true, 8.772f, 4.0f)
                arcToRelative(5.478f, 5.478f, 0.0f, false, true, 2.959f, 0.85f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.538f, 0.0f)
                arcTo(5.478f, 5.478f, 0.0f, false, true, 15.228f, 4.0f)
                arcToRelative(5.015f, 5.015f, 0.0f, false, true, 3.917f, 1.892f)
                arcTo(6.071f, 6.071f, 0.0f, false, true, 20.388f, 10.87f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
