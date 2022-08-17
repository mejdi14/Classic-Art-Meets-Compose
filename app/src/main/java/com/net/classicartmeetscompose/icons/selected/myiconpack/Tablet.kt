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

public val SelectedIcons.Tablet: ImageVector
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
                moveTo(15.0f, 2.5f)
                horizontalLineTo(9.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 4.5f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 9.0f, 21.5f)
                horizontalLineToRelative(6.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 19.5f, 17.0f)
                verticalLineTo(7.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 15.0f, 2.5f)
                close()
                moveTo(12.5f, 19.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
            .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null
