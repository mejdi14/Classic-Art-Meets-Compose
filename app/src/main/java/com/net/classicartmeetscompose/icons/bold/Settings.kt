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

public val HomeIcon.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
                moveTo(12.5f, 22.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.0f, 19.5f)
                arcToRelative(0.107f, 0.107f, 0.0f, false, false, -0.068f, -0.109f)
                curveToRelative(-0.049f, -0.024f, -0.106f, 0.028f, -0.106f, 0.028f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -3.543f, 0.009f)
                lineToRelative(-0.706f, -0.707f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.006f, -3.54f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.02f, -0.123f)
                arcTo(0.13f, 0.13f, 0.0f, false, false, 4.5f, 15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 12.5f)
                verticalLineToRelative(-1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 9.0f)
                arcToRelative(0.113f, 0.113f, 0.0f, false, false, 0.108f, -0.064f)
                arcToRelative(0.087f, 0.087f, 0.0f, false, false, -0.022f, -0.105f)
                arcToRelative(2.508f, 2.508f, 0.0f, false, true, -0.012f, -3.549f)
                lineToRelative(0.708f, -0.709f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, true, 3.535f, 0.0f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.126f, 0.032f)
                curveTo(9.0f, 4.58f, 9.0f, 4.5f, 9.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.5f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 4.5f)
                reflectiveCurveToRelative(-0.005f, 0.1f, 0.05f, 0.12f)
                arcToRelative(0.123f, 0.123f, 0.0f, false, false, 0.118f, -0.025f)
                arcToRelative(2.487f, 2.487f, 0.0f, false, true, 1.781f, -0.75f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, 1.768f, 0.732f)
                lineToRelative(0.7f, 0.705f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 3.535f)
                curveToRelative(-0.014f, 0.021f, -0.072f, 0.064f, -0.049f, 0.124f)
                arcToRelative(0.086f, 0.086f, 0.0f, false, false, 0.1f, 0.059f)
                arcTo(2.509f, 2.509f, 0.0f, false, true, 22.0f, 11.5f)
                verticalLineToRelative(1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.5f, 15.0f)
                curveToRelative(-0.06f, 0.0f, -0.114f, 0.0f, -0.133f, 0.049f)
                reflectiveCurveToRelative(-0.009f, 0.08f, 0.04f, 0.121f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.016f, 3.551f)
                lineToRelative(-0.7f, 0.706f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, true, -3.535f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-0.056f, -0.068f, -0.112f, -0.048f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.071f, 0.092f)
                arcTo(2.509f, 2.509f, 0.0f, false, true, 12.5f, 22.0f)
                close()
                moveTo(9.671f, 17.532f)
                lineToRelative(0.044f, 0.018f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 11.0f, 19.472f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, false, 0.5f, 0.528f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                arcToRelative(2.124f, 2.124f, 0.0f, false, true, 1.31f, -1.961f)
                arcToRelative(2.084f, 2.084f, 0.0f, false, true, 2.265f, 0.451f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, false, 0.729f, 0.022f)
                lineToRelative(0.705f, -0.705f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.708f)
                arcToRelative(2.125f, 2.125f, 0.0f, false, true, -0.475f, -2.265f)
                curveToRelative(0.006f, -0.016f, 0.011f, -0.031f, 0.018f, -0.047f)
                lineToRelative(0.006f, -0.014f)
                arcTo(2.074f, 2.074f, 0.0f, false, true, 19.474f, 13.0f)
                arcTo(0.507f, 0.507f, 0.0f, false, false, 20.0f, 12.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                arcToRelative(2.086f, 2.086f, 0.0f, false, true, -1.952f, -1.291f)
                lineToRelative(-0.019f, -0.046f)
                arcToRelative(2.066f, 2.066f, 0.0f, false, true, 0.463f, -2.239f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, false, 0.02f, -0.728f)
                lineToRelative(-0.705f, -0.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.354f, -0.146f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.354f, 0.147f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, true, -2.3f, 0.464f)
                horizontalLineToRelative(0.0f)
                arcTo(2.075f, 2.075f, 0.0f, false, true, 13.0f, 4.526f)
                arcTo(0.507f, 0.507f, 0.0f, false, false, 12.5f, 4.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 7.425f, 6.01f)
                arcTo(0.506f, 0.506f, 0.0f, false, false, 6.7f, 5.988f)
                lineTo(5.988f, 6.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                arcTo(2.089f, 2.089f, 0.0f, false, true, 6.46f, 9.691f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, -0.1f, 0.189f)
                arcTo(2.106f, 2.106f, 0.0f, false, true, 4.528f, 11.0f)
                arcTo(0.508f, 0.508f, 0.0f, false, false, 4.0f, 11.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                arcToRelative(2.083f, 2.083f, 0.0f, false, true, 1.943f, 1.273f)
                lineToRelative(0.006f, 0.014f)
                curveToRelative(0.009f, 0.021f, 0.017f, 0.041f, 0.024f, 0.063f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.468f, 2.236f)
                arcToRelative(0.511f, 0.511f, 0.0f, false, false, -0.16f, 0.366f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, false, 0.146f, 0.355f)
                lineToRelative(0.706f, 0.706f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.0f)
                arcTo(2.092f, 2.092f, 0.0f, false, true, 9.671f, 17.532f)
                close()
                moveTo(19.4f, 8.96f)
                lineToRelative(0.0f, 0.006f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
