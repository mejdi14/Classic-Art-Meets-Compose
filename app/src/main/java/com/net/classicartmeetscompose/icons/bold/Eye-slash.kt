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

public val HomeIcon.`Eye-slash`: ImageVector
    get() {
        if (`_eye-slash` != null) {
            return `_eye-slash`!!
        }
        `_eye-slash` = Builder(name = "Eye-slash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.445f, 9.985f)
                arcToRelative(14.772f, 14.772f, 0.0f, false, false, -2.718f, -3.3f)
                lineToRelative(1.978f, -1.978f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineTo(8.828f, 13.756f)
                horizontalLineToRelative(0.0f)
                lineTo(3.291f, 19.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineTo(6.872f, 18.54f)
                arcTo(9.659f, 9.659f, 0.0f, false, false, 12.0f, 20.0f)
                curveToRelative(5.069f, 0.0f, 8.092f, -3.748f, 9.446f, -5.986f)
                arcTo(3.922f, 3.922f, 0.0f, false, false, 21.445f, 9.985f)
                close()
                moveTo(14.5f, 12.0f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, -3.411f, 2.325f)
                lineToRelative(3.235f, -3.236f)
                arcTo(2.474f, 2.474f, 0.0f, false, true, 14.5f, 12.0f)
                close()
                moveTo(19.733f, 12.982f)
                curveTo(18.6f, 14.856f, 16.088f, 18.0f, 12.0f, 18.0f)
                arcToRelative(7.669f, 7.669f, 0.0f, false, true, -3.659f, -0.929f)
                lineTo(9.61f, 15.8f)
                arcTo(4.436f, 4.436f, 0.0f, false, false, 12.0f, 16.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 16.5f, 12.0f)
                arcToRelative(4.433f, 4.433f, 0.0f, false, false, -0.7f, -2.387f)
                lineTo(17.31f, 8.1f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, 2.419f, 2.912f)
                arcTo(1.937f, 1.937f, 0.0f, false, true, 19.731f, 12.982f)
                close()
                moveTo(3.938f, 15.945f)
                arcToRelative(15.131f, 15.131f, 0.0f, false, true, -1.382f, -1.928f)
                arcToRelative(3.922f, 3.922f, 0.0f, false, true, 0.0f, -4.03f)
                curveTo(3.908f, 7.748f, 6.931f, 4.0f, 12.0f, 4.0f)
                arcToRelative(9.947f, 9.947f, 0.0f, false, true, 2.9f, 0.432f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.573f, 1.916f)
                arcTo(7.961f, 7.961f, 0.0f, false, false, 12.0f, 6.0f)
                curveTo(7.912f, 6.0f, 5.4f, 9.144f, 4.269f, 11.018f)
                arcToRelative(1.944f, 1.944f, 0.0f, false, false, 0.0f, 1.969f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 1.2f, 1.667f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.119f, 1.409f)
                arcTo(0.986f, 0.986f, 0.0f, false, true, 4.7f, 16.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.938f, 15.945f)
                close()
                moveTo(11.3f, 7.562f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 11.6f, 9.538f)
                arcTo(2.492f, 2.492f, 0.0f, false, false, 9.536f, 11.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.977f, -0.3f)
                arcTo(4.453f, 4.453f, 0.0f, false, true, 11.3f, 7.562f)
                close()
            }
        }
        .build()
        return `_eye-slash`!!
    }

private var `_eye-slash`: ImageVector? = null
