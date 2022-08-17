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

public val UnselectedIcons.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(
            name = "Bell",
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
                moveTo(20.242f, 15.775f)
                lineToRelative(-1.107f, -1.846f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.64f, -2.312f)
                lineTo(18.495f, 8.99f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -12.99f, 0.0f)
                verticalLineToRelative(2.627f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.64f, 2.312f)
                lineTo(3.758f, 15.775f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 5.3f, 18.5f)
                lineTo(9.566f, 18.5f)
                arcTo(2.474f, 2.474f, 0.0f, false, false, 9.5f, 19.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(2.474f, 2.474f, 0.0f, false, false, -0.066f, -0.5f)
                lineTo(18.7f, 18.5f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.545f, -2.725f)
                close()
                moveTo(13.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.9f, -0.5f)
                lineTo(13.4f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 19.0f)
                close()
                moveTo(19.394f, 17.094f)
                arcToRelative(0.793f, 0.793f, 0.0f, false, true, -0.7f, 0.406f)
                lineTo(5.3f, 17.5f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.687f, -1.211f)
                lineToRelative(1.106f, -1.846f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.783f, -2.826f)
                lineTo(6.502f, 8.99f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 10.99f, 0.0f)
                verticalLineToRelative(2.627f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.783f, 2.826f)
                lineToRelative(1.106f, 1.846f)
                arcTo(0.79f, 0.79f, 0.0f, false, true, 19.394f, 17.094f)
                close()
            }
        }
            .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
