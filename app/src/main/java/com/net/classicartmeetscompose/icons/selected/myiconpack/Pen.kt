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

public val SelectedIcons.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(
            name = "Pen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth =
            24.0f,
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
                moveTo(11.911f, 6.33f)
                lineToRelative(5.76f, 5.76f)
                lineTo(9.771f, 20.0f)
                arcToRelative(2.521f, 2.521f, 0.0f, false, true, -1.35f, 0.7f)
                lineToRelative(-4.74f, 0.79f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, true, -0.17f, 0.01f)
                arcToRelative(1.017f, 1.017f, 0.0f, false, true, -0.71f, -0.3f)
                arcToRelative(1.028f, 1.028f, 0.0f, false, true, -0.29f, -0.88f)
                lineToRelative(0.79f, -4.74f)
                arcTo(2.521f, 2.521f, 0.0f, false, true, 4.0f, 14.23f)
                close()
                moveTo(20.3f, 3.7f)
                arcToRelative(4.056f, 4.056f, 0.0f, false, false, -5.76f, 0.0f)
                lineToRelative(-1.21f, 1.21f)
                lineToRelative(5.76f, 5.76f)
                lineTo(20.3f, 9.46f)
                arcToRelative(4.056f, 4.056f, 0.0f, false, false, 0.0f, -5.76f)
                close()
            }
        }
            .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
