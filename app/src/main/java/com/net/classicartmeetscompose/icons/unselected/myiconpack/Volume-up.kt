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

public val UnselectedIcons.`Volume-up`: ImageVector
    get() {
        if (`_volume-up` != null) {
            return `_volume-up`!!
        }
        `_volume-up` = Builder(name = "Volume-up", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.751f, 3.778f)
                arcToRelative(2.964f, 2.964f, 0.0f, false, false, -3.2f, 0.449f)
                lineToRelative(-2.6f, 2.225f)
                arcToRelative(0.492f, 0.492f, 0.0f, false, true, -0.323f, 0.121f)
                horizontalLineTo(4.893f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 2.5f, 8.974f)
                verticalLineToRelative(6.051f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.393f, 2.4f)
                horizontalLineTo(5.63f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.325f, 0.12f)
                lineToRelative(2.594f, 2.225f)
                arcToRelative(2.971f, 2.971f, 0.0f, false, false, 1.942f, 0.728f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, false, 1.26f, -0.279f)
                arcTo(2.976f, 2.976f, 0.0f, false, false, 13.5f, 17.489f)
                verticalLineTo(6.51f)
                arcTo(2.976f, 2.976f, 0.0f, false, false, 11.751f, 3.778f)
                close()
                moveTo(12.5f, 17.489f)
                arcToRelative(1.986f, 1.986f, 0.0f, false, true, -1.167f, 1.824f)
                arcToRelative(1.955f, 1.955f, 0.0f, false, true, -2.134f, -0.3f)
                lineTo(6.606f, 16.788f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, false, -0.974f, -0.361f)
                horizontalLineTo(4.894f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.394f, -1.4f)
                verticalLineTo(8.974f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 1.394f, -1.4f)
                horizontalLineToRelative(0.738f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, false, 0.973f, -0.362f)
                lineTo(9.2f, 4.986f)
                arcTo(1.966f, 1.966f, 0.0f, false, true, 10.487f, 4.5f)
                arcToRelative(2.021f, 2.021f, 0.0f, false, true, 0.846f, 0.19f)
                arcTo(1.986f, 1.986f, 0.0f, false, true, 12.5f, 6.51f)
                close()
                moveTo(16.4f, 8.7f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, 6.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, 0.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, -0.8f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, -5.4f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.8f, -0.6f)
                close()
                moveTo(21.5f, 12.0f)
                arcToRelative(9.455f, 9.455f, 0.0f, false, true, -2.428f, 6.334f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.744f, -0.669f)
                arcToRelative(8.475f, 8.475f, 0.0f, false, false, 0.0f, -11.331f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.744f, -0.669f)
                arcTo(9.458f, 9.458f, 0.0f, false, true, 21.5f, 12.0f)
                close()
            }
        }
        .build()
        return `_volume-up`!!
    }

private var `_volume-up`: ImageVector? = null
