package com.net.classicartmeetscompose.icons.selected.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.selected.SelectedIcons

public val SelectedIcons.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.014f, 10.24f)
                curveToRelative(-1.29f, -2.14f, -4.17f, -5.74f, -9.02f, -5.74f)
                reflectiveCurveToRelative(-7.73f, 3.6f, -9.01f, 5.74f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 0.0f, 3.51f)
                curveToRelative(1.28f, 2.15f, 4.17f, 5.75f, 9.01f, 5.75f)
                reflectiveCurveToRelative(7.73f, -3.6f, 9.02f, -5.75f)
                arcTo(3.427f, 3.427f, 0.0f, false, false, 21.5f, 12.0f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 21.014f, 10.24f)
                close()
                moveTo(11.994f, 16.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 4.5f, -4.5f)
                arcTo(4.507f, 4.507f, 0.0f, false, true, 11.994f, 16.5f)
                close()
                moveTo(14.484f, 11.86f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, 0.01f, 0.14f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -0.9f, -1.92f)
                arcToRelative(1.016f, 1.016f, 0.0f, false, false, -0.6f, 0.92f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcTo(0.906f, 0.906f, 0.0f, false, false, 14.484f, 11.86f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
