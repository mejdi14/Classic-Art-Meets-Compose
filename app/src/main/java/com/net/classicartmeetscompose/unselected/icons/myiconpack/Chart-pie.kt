package com.net.classicartmeetscompose.unselected.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.unselected.icons.MyIconPack

public val MyIconPack.`Chart-pie`: ImageVector
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
                moveTo(19.737f, 14.938f)
                arcToRelative(1.021f, 1.021f, 0.0f, false, true, 0.1f, 0.954f)
                arcTo(8.925f, 8.925f, 0.0f, false, true, 11.509f, 21.5f)
                arcToRelative(9.412f, 9.412f, 0.0f, false, true, -0.96f, -0.05f)
                arcToRelative(9.113f, 9.113f, 0.0f, false, true, -8.0f, -8.0f)
                arcTo(8.944f, 8.944f, 0.0f, false, true, 8.108f, 4.165f)
                arcToRelative(1.026f, 1.026f, 0.0f, false, true, 0.954f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.438f, 0.825f)
                lineTo(9.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 14.5f)
                horizontalLineToRelative(6.912f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.737f, 14.938f)
                close()
            }
        }
        .build()
        return `_chart-pie`!!
    }

private var `_chart-pie`: ImageVector? = null
