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

public val UnselectedIcons.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(
            name = "Settings",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF41416d)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.015f, 15.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 15.5f, 11.985f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.015f, 15.5f)
                close()
                moveTo(11.99f, 9.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 2.51f, 2.49f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.99f, 9.5f)
                close()
                moveTo(12.54f, 21.5f)
                lineTo(11.54f, 21.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.531f, 19.51f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.378f, -0.569f)
                lineToRelative(-0.007f, 0.0f)
                arcToRelative(0.579f, 0.579f, 0.0f, false, false, -0.631f, 0.128f)
                arcToRelative(2.008f, 2.008f, 0.0f, false, true, -2.85f, 0.033f)
                lineToRelative(-0.708f, -0.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.008f, -2.833f)
                arcToRelative(0.621f, 0.621f, 0.0f, false, false, 0.129f, -0.667f)
                verticalLineToRelative(0.0f)
                arcToRelative(0.584f, 0.584f, 0.0f, false, false, -0.541f, -0.363f)
                arcTo(2.007f, 2.007f, 0.0f, false, true, 2.5f, 12.54f)
                lineToRelative(0.0f, -1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.49f, 9.531f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.569f, -0.378f)
                lineToRelative(0.0f, -0.007f)
                arcToRelative(0.582f, 0.582f, 0.0f, false, false, -0.128f, -0.631f)
                arcTo(2.009f, 2.009f, 0.0f, false, true, 4.9f, 5.665f)
                lineToRelative(0.705f, -0.711f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.829f, -0.012f)
                arcToRelative(0.609f, 0.609f, 0.0f, false, false, 0.669f, 0.137f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, false, 0.365f, -0.541f)
                arcTo(2.008f, 2.008f, 0.0f, false, true, 11.46f, 2.5f)
                lineToRelative(1.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.469f, 4.49f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, false, 0.369f, 0.564f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, false, 0.654f, -0.121f)
                arcToRelative(1.992f, 1.992f, 0.0f, false, true, 1.425f, -0.609f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.989f, 1.989f, 0.0f, false, true, 1.417f, 0.58f)
                lineToRelative(0.708f, 0.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.012f, 2.829f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.143f, 0.657f)
                lineToRelative(0.007f, 0.014f)
                arcToRelative(0.579f, 0.579f, 0.0f, false, false, 0.54f, 0.363f)
                arcTo(2.008f, 2.008f, 0.0f, false, true, 21.5f, 11.46f)
                lineToRelative(0.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.992f, 2.009f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, false, -0.564f, 0.369f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.618f, 0.618f, 0.0f, false, false, 0.121f, 0.654f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.029f, 2.845f)
                lineToRelative(-0.7f, 0.708f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.829f, 0.012f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.657f, -0.143f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.377f, 0.547f)
                arcTo(2.008f, 2.008f, 0.0f, false, true, 12.54f, 21.5f)
                close()
                moveTo(9.581f, 18.039f)
                arcToRelative(1.612f, 1.612f, 0.0f, false, true, 0.95f, 1.439f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, 1.0f, 1.024f)
                lineToRelative(1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, true, 0.993f, -1.5f)
                arcToRelative(1.58f, 1.58f, 0.0f, false, true, 1.724f, 0.335f)
                arcToRelative(1.009f, 1.009f, 0.0f, false, false, 1.436f, 0.015f)
                lineToRelative(0.7f, -0.708f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.008f, -1.417f)
                arcToRelative(1.621f, 1.621f, 0.0f, false, true, -0.364f, -1.74f)
                lineToRelative(0.0f, -0.011f)
                lineToRelative(0.0f, -0.013f)
                arcToRelative(1.574f, 1.574f, 0.0f, false, true, 1.457f, -0.984f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, 1.022f, -1.0f)
                lineToRelative(0.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                arcTo(1.589f, 1.589f, 0.0f, false, true, 18.0f, 9.5f)
                lineToRelative(0.0f, -0.007f)
                arcToRelative(1.586f, 1.586f, 0.0f, false, true, 0.33f, -1.737f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, 0.015f, -1.436f)
                lineToRelative(-0.708f, -0.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.709f, -0.29f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, -0.707f, 0.3f)
                arcToRelative(1.621f, 1.621f, 0.0f, false, true, -1.74f, 0.364f)
                lineToRelative(-0.011f, 0.0f)
                lineToRelative(-0.013f, 0.0f)
                arcToRelative(1.574f, 1.574f, 0.0f, false, true, -0.984f, -1.457f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, -1.0f, -1.022f)
                lineToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcTo(1.588f, 1.588f, 0.0f, false, true, 9.489f, 6.0f)
                arcToRelative(1.612f, 1.612f, 0.0f, false, true, -1.737f, -0.33f)
                arcToRelative(1.009f, 1.009f, 0.0f, false, false, -1.436f, -0.015f)
                lineToRelative(-0.7f, 0.711f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.006f, 1.415f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, 0.37f, 1.742f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, true, -0.026f, 0.055f)
                arcToRelative(1.612f, 1.612f, 0.0f, false, true, -1.439f, 0.95f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, -1.024f, 1.0f)
                lineToRelative(0.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcTo(1.585f, 1.585f, 0.0f, false, true, 6.0f, 14.506f)
                lineToRelative(0.0f, 0.01f)
                lineToRelative(0.0f, 0.011f)
                arcToRelative(1.617f, 1.617f, 0.0f, false, true, -0.337f, 1.731f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.009f, 1.429f)
                lineToRelative(0.708f, 0.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.415f, -0.006f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, 1.742f, -0.37f)
                arcTo(0.464f, 0.464f, 0.0f, false, true, 9.581f, 18.039f)
                close()
            }
        }
            .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
