package com.net.classicartmeetscompose.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.HomeIcon

public val HomeIcon.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.444f, 9.987f)
                curveTo(20.1f, 7.751f, 17.09f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(3.9f, 7.751f, 2.556f, 9.987f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, 0.0f, 4.026f)
                curveTo(3.9f, 16.249f, 6.911f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveToRelative(8.1f, -3.751f, 9.444f, -5.987f)
                arcTo(3.905f, 3.905f, 0.0f, false, false, 21.444f, 9.987f)
                close()
                moveTo(19.729f, 12.987f)
                curveTo(18.6f, 14.857f, 16.105f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveToRelative(-6.6f, -3.144f, -7.729f, -5.017f)
                arcToRelative(1.906f, 1.906f, 0.0f, false, true, 0.0f, -1.966f)
                curveTo(5.4f, 9.144f, 7.9f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(6.6f, 3.143f, 7.729f, 5.017f)
                arcTo(1.906f, 1.906f, 0.0f, false, true, 19.729f, 12.983f)
                close()
                moveTo(12.0f, 7.5f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 16.5f, 12.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 12.0f, 7.5f)
                close()
                moveTo(12.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 14.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 14.5f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
