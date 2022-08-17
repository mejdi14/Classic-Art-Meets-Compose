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

public val SelectedIcons.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(
            name = "Video",
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
                moveTo(16.25f, 10.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, -4.5f, 4.5f)
                horizontalLineToRelative(-5.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 2.25f, 14.0f)
                lineTo(2.25f, 10.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, 4.5f, -4.5f)
                horizontalLineToRelative(5.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 16.25f, 10.0f)
                close()
                moveTo(20.85f, 7.739f)
                arcToRelative(1.689f, 1.689f, 0.0f, false, false, -1.736f, 0.085f)
                lineToRelative(-1.14f, 0.76f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 17.75f, 9.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.223f, 0.416f)
                lineToRelative(1.138f, 0.759f)
                arcTo(1.7f, 1.7f, 0.0f, false, false, 21.75f, 14.76f)
                lineTo(21.75f, 9.24f)
                arcTo(1.7f, 1.7f, 0.0f, false, false, 20.849f, 7.739f)
                close()
            }
        }
            .build()
        return _video!!
    }

private var _video: ImageVector? = null
