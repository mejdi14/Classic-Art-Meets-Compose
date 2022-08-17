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

public val SelectedIcons.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(
            name = "Copy",
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
                moveTo(11.0f, 19.5f)
                horizontalLineToRelative(5.7f)
                arcTo(3.978f, 3.978f, 0.0f, false, true, 13.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(2.0f, 10.0f)
                arcTo(4.007f, 4.007f, 0.0f, false, true, 5.5f, 6.03f)
                lineTo(5.5f, 14.0f)
                arcTo(5.51f, 5.51f, 0.0f, false, false, 11.0f, 19.5f)
                close()
                moveTo(19.5f, 6.25f)
                horizontalLineToRelative(2.12f)
                arcTo(1.638f, 1.638f, 0.0f, false, false, 21.41f, 6.0f)
                lineTo(18.0f, 2.59f)
                arcToRelative(1.156f, 1.156f, 0.0f, false, false, -0.25f, -0.2f)
                lineTo(17.75f, 4.5f)
                arcTo(1.758f, 1.758f, 0.0f, false, false, 19.5f, 6.25f)
                close()
                moveTo(19.5f, 7.75f)
                arcTo(3.256f, 3.256f, 0.0f, false, true, 16.25f, 4.5f)
                lineTo(16.25f, 2.0f)
                lineTo(11.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 7.0f, 6.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(22.0f, 7.75f)
                close()
            }
        }
            .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
