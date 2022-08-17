package com.net.classicartmeetscompose.icons.selected.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.selected.SelectedIcons

public val SelectedIcons.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(
            name = "Stopwatch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF41416e)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.209f, 8.21f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.42f, -1.42f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(1.278f, 1.278f, 0.0f, false, false, -0.14f, 0.21f)
                arcTo(8.008f, 8.008f, 0.0f, false, false, 13.0f, 5.57f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(10.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 5.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 7.07f, 2.73f)
                arcTo(1.1f, 1.1f, 0.0f, false, false, 18.209f, 8.21f)
                close()
                moveTo(14.619f, 16.78f)
                arcTo(0.961f, 0.961f, 0.0f, false, true, 14.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.78f, -0.38f)
                lineToRelative(-2.0f, -2.5f)
                arcTo(0.977f, 0.977f, 0.0f, false, true, 11.0f, 13.5f)
                lineTo(11.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(3.15f)
                lineToRelative(1.78f, 2.23f)
                arcTo(0.982f, 0.982f, 0.0f, false, true, 14.619f, 16.78f)
                close()
            }
        }
            .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
