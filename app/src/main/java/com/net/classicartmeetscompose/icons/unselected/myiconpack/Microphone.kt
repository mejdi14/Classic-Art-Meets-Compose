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

public val UnselectedIcons.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(
            name = "Microphone",
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
                moveTo(12.0f, 15.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 16.5f, 11.0f)
                lineTo(16.5f, 7.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -9.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 12.0f, 15.5f)
                close()
                moveTo(8.5f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                close()
                moveTo(12.5f, 18.474f)
                lineTo(12.5f, 20.5f)
                lineTo(16.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(8.0f, 21.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                lineTo(11.5f, 18.474f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 4.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 13.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.5f, 18.474f)
                close()
            }
        }
            .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
