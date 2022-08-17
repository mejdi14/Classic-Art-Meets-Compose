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

public val SelectedIcons.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(
            name = "Tag",
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
                moveTo(20.18f, 10.35f)
                lineTo(13.65f, 3.82f)
                arcTo(4.531f, 4.531f, 0.0f, false, false, 10.47f, 2.5f)
                horizontalLineTo(6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.5f, 6.0f)
                verticalLineToRelative(4.47f)
                arcToRelative(4.471f, 4.471f, 0.0f, false, false, 1.32f, 3.18f)
                lineToRelative(6.53f, 6.53f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 6.37f, 0.0f)
                lineToRelative(3.46f, -3.46f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 20.18f, 10.35f)
                close()
                moveTo(7.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 9.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 9.0f)
                close()
            }
        }
            .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
