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

public val HomeIcon.`Chart-pie`: ImageVector
    get() {
        if (`_chart-pie` != null) {
            return `_chart-pie`!!
        }
        `_chart-pie` = Builder(name = "Chart-pie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.95f, 9.931f)
                arcTo(10.045f, 10.045f, 0.0f, false, false, 14.069f, 2.05f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, -3.0f, 2.457f)
                lineTo(11.069f, 9.931f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(5.424f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, 2.457f, -3.0f)
                close()
                moveTo(19.885f, 10.744f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.392f, 0.187f)
                lineTo(14.069f, 10.931f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(13.069f, 4.507f)
                arcToRelative(0.509f, 0.509f, 0.0f, false, true, 0.5f, -0.507f)
                arcToRelative(0.476f, 0.476f, 0.0f, false, true, 0.1f, 0.011f)
                arcToRelative(8.046f, 8.046f, 0.0f, false, true, 6.314f, 6.314f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 19.885f, 10.744f)
                close()
                moveTo(20.577f, 15.291f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 2.0f, 12.5f)
                arcTo(9.431f, 9.431f, 0.0f, false, true, 8.709f, 3.423f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.582f, 1.914f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 9.372f, 9.372f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.914f, 0.582f)
                close()
            }
        }
        .build()
        return `_chart-pie`!!
    }

private var `_chart-pie`: ImageVector? = null
