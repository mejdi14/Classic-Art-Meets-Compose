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

public val HomeIcon.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.316f, 6.052f)
                curveTo(17.25f, 5.029f, 13.519f, 3.1f, 12.728f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.7f, -0.3f)
                arcToRelative(1.022f, 1.022f, 0.0f, false, false, -0.71f, 0.288f)
                arcToRelative(20.035f, 20.035f, 0.0f, false, true, -7.585f, 3.88f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 7.13f)
                curveToRelative(0.0f, 8.359f, 1.306f, 12.711f, 8.726f, 14.832f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, false, 0.55f, 0.0f)
                curveTo(19.694f, 19.842f, 21.0f, 15.448f, 21.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.316f, 6.052f)
                close()
                moveTo(12.0f, 19.958f)
                curveTo(6.257f, 18.235f, 5.073f, 15.2f, 5.0f, 7.873f)
                arcTo(23.338f, 23.338f, 0.0f, false, false, 12.039f, 4.3f)
                arcTo(35.028f, 35.028f, 0.0f, false, false, 19.0f, 7.709f)
                curveTo(18.931f, 15.16f, 17.755f, 18.231f, 12.0f, 19.958f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
