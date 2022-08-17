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

public val SelectedIcons.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = Builder(
            name = "Package",
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
                moveTo(6.27f, 4.524f)
                lineTo(15.73f, 8.9f)
                lineToRelative(-2.53f, 1.12f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, -2.4f, 0.01f)
                lineTo(3.25f, 6.624f)
                arcToRelative(4.813f, 4.813f, 0.0f, false, true, 2.04f, -1.66f)
                close()
                moveTo(18.71f, 4.964f)
                lineTo(14.32f, 3.014f)
                arcToRelative(5.764f, 5.764f, 0.0f, false, false, -4.64f, 0.0f)
                lineToRelative(-1.59f, 0.7f)
                lineToRelative(9.45f, 4.37f)
                lineToRelative(3.21f, -1.46f)
                arcTo(4.813f, 4.813f, 0.0f, false, false, 18.71f, 4.964f)
                close()
                moveTo(2.63f, 7.984f)
                arcTo(3.856f, 3.856f, 0.0f, false, false, 2.5f, 9.0f)
                verticalLineToRelative(6.04f)
                arcToRelative(4.452f, 4.452f, 0.0f, false, false, 2.79f, 4.04f)
                lineToRelative(4.4f, 1.95f)
                arcToRelative(5.258f, 5.258f, 0.0f, false, false, 1.56f, 0.44f)
                verticalLineToRelative(-9.76f)
                arcToRelative(4.635f, 4.635f, 0.0f, false, true, -1.06f, -0.31f)
                close()
                moveTo(21.37f, 7.984f)
                lineTo(13.81f, 11.4f)
                arcToRelative(4.635f, 4.635f, 0.0f, false, true, -1.06f, 0.31f)
                verticalLineToRelative(9.76f)
                arcToRelative(5.406f, 5.406f, 0.0f, false, false, 1.57f, -0.44f)
                lineToRelative(4.39f, -1.95f)
                arcToRelative(4.452f, 4.452f, 0.0f, false, false, 2.79f, -4.04f)
                lineTo(21.5f, 9.0f)
                arcTo(3.856f, 3.856f, 0.0f, false, false, 21.37f, 7.984f)
                close()
            }
        }
            .build()
        return _package!!
    }

private var _package: ImageVector? = null
