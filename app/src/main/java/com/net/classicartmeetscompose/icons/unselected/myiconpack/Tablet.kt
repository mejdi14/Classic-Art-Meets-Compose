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

public val UnselectedIcons.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = Builder(
            name = "Tablet",
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
                moveTo(13.5f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(11.0f, 18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 18.0f)
                close()
                moveTo(19.5f, 7.0f)
                lineTo(19.5f, 17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 15.0f, 21.5f)
                lineTo(9.0f, 21.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 4.5f, 17.0f)
                lineTo(4.5f, 7.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 9.0f, 2.5f)
                horizontalLineToRelative(6.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 19.5f, 7.0f)
                close()
                moveTo(18.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.0f, 3.5f)
                lineTo(9.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.5f, 7.0f)
                lineTo(5.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.0f, 20.5f)
                horizontalLineToRelative(6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.5f, 17.0f)
                close()
            }
        }
            .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null
