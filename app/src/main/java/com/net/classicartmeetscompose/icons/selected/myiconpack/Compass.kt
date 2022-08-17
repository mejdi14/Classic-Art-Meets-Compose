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

public val SelectedIcons.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(
            name = "Compass",
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
                moveTo(13.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 12.0f)
                close()
                moveTo(21.5f, 12.0f)
                arcTo(9.5f, 9.5f, 0.0f, true, true, 12.0f, 2.5f)
                arcTo(9.509f, 9.509f, 0.0f, false, true, 21.5f, 12.0f)
                close()
                moveTo(16.69f, 7.31f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, false, -1.43f, -0.39f)
                lineTo(11.21f, 7.93f)
                arcToRelative(4.512f, 4.512f, 0.0f, false, false, -3.28f, 3.28f)
                lineTo(6.92f, 15.26f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, false, 0.39f, 1.43f)
                arcToRelative(1.534f, 1.534f, 0.0f, false, false, 1.06f, 0.44f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, false, 0.37f, -0.05f)
                lineToRelative(4.05f, -1.01f)
                arcToRelative(4.512f, 4.512f, 0.0f, false, false, 3.28f, -3.28f)
                lineToRelative(1.01f, -4.05f)
                arcTo(1.508f, 1.508f, 0.0f, false, false, 16.69f, 7.31f)
                close()
            }
        }
            .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
