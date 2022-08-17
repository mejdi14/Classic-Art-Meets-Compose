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

public val UnselectedIcons.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.015f, 10.245f)
                curveTo(19.727f, 8.1f, 16.843f, 4.5f, 12.0f, 4.5f)
                reflectiveCurveTo(4.273f, 8.1f, 2.985f, 10.245f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 0.0f, 3.51f)
                curveTo(4.273f, 15.9f, 7.158f, 19.5f, 12.0f, 19.5f)
                reflectiveCurveToRelative(7.727f, -3.6f, 9.015f, -5.745f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 21.015f, 10.245f)
                close()
                moveTo(20.158f, 13.245f)
                curveTo(18.978f, 15.205f, 16.35f, 18.5f, 12.0f, 18.5f)
                reflectiveCurveToRelative(-6.978f, -3.295f, -8.158f, -5.259f)
                arcToRelative(2.409f, 2.409f, 0.0f, false, true, 0.0f, -2.482f)
                curveTo(5.022f, 8.8f, 7.65f, 5.5f, 12.0f, 5.5f)
                reflectiveCurveToRelative(6.978f, 3.3f, 8.158f, 5.259f)
                arcTo(2.409f, 2.409f, 0.0f, false, true, 20.158f, 13.241f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
