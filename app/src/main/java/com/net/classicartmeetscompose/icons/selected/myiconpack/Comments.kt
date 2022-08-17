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

public val SelectedIcons.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(
            name = "Comments",
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
                moveTo(21.5f, 11.0f)
                lineTo(21.5f, 21.0f)
                arcToRelative(0.489f, 0.489f, 0.0f, false, true, -0.31f, 0.46f)
                arcToRelative(0.433f, 0.433f, 0.0f, false, true, -0.19f, 0.04f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, true, -0.36f, -0.15f)
                lineTo(18.83f, 19.5f)
                lineTo(10.0f, 19.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 6.5f, 16.0f)
                lineTo(14.0f, 16.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(19.0f, 7.65f)
                arcTo(3.507f, 3.507f, 0.0f, false, true, 21.5f, 11.0f)
                close()
                moveTo(17.5f, 11.0f)
                lineTo(17.5f, 6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.0f, 2.5f)
                lineTo(6.0f, 2.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.5f, 6.0f)
                lineTo(2.5f, 16.0f)
                arcToRelative(0.489f, 0.489f, 0.0f, false, false, 0.31f, 0.46f)
                arcTo(0.433f, 0.433f, 0.0f, false, false, 3.0f, 16.5f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, false, 0.36f, -0.15f)
                lineTo(5.17f, 14.5f)
                lineTo(14.0f, 14.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.5f, 11.0f)
                close()
            }
        }
            .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
