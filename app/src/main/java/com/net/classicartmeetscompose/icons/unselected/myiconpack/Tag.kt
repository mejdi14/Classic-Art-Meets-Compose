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

public val UnselectedIcons.Tag: ImageVector
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
                moveTo(20.183f, 10.353f)
                lineTo(13.649f, 3.819f)
                arcTo(4.47f, 4.47f, 0.0f, false, false, 10.467f, 2.5f)
                lineTo(6.0f, 2.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.5f, 6.0f)
                verticalLineToRelative(4.466f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, false, 1.318f, 3.182f)
                lineToRelative(6.534f, 6.534f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 6.364f, 0.0f)
                lineToRelative(3.466f, -3.466f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 20.183f, 10.353f)
                close()
                moveTo(19.476f, 16.01f)
                lineTo(16.01f, 19.476f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.95f, 0.0f)
                lineTo(4.526f, 12.942f)
                arcTo(3.477f, 3.477f, 0.0f, false, true, 3.5f, 10.467f)
                lineTo(3.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 3.5f)
                horizontalLineToRelative(4.466f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, true, 2.475f, 1.025f)
                lineToRelative(6.534f, 6.534f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 19.476f, 16.01f)
                close()
                moveTo(8.5f, 7.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.5f, 7.5f)
                close()
            }
        }
            .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
