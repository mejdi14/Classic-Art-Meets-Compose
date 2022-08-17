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

public val UnselectedIcons.`Chart-pie`: ImageVector
    get() {
        if (`_chart-pie` != null) {
            return `_chart-pie`!!
        }
        `_chart-pie` = Builder(name = "Chart-pie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.46f, 10.029f)
                arcToRelative(9.546f, 9.546f, 0.0f, false, false, -7.489f, -7.49f)
                arcToRelative(2.009f, 2.009f, 0.0f, false, false, -2.4f, 1.967f)
                lineTo(11.571f, 9.93f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(5.424f)
                arcToRelative(2.007f, 2.007f, 0.0f, false, false, 1.967f, -2.4f)
                close()
                moveTo(20.271f, 11.061f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.778f, 0.369f)
                lineTo(14.069f, 11.43f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                lineTo(12.569f, 4.506f)
                arcTo(1.009f, 1.009f, 0.0f, false, true, 13.575f, 3.5f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, 0.2f, 0.02f)
                arcToRelative(8.546f, 8.546f, 0.0f, false, true, 6.706f, 6.706f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.271f, 11.061f)
                close()
                moveTo(20.1f, 15.146f)
                arcTo(9.0f, 9.0f, 0.0f, true, true, 8.854f, 3.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.292f, 0.957f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.957f, 0.292f)
                close()
            }
        }
        .build()
        return `_chart-pie`!!
    }

private var `_chart-pie`: ImageVector? = null
