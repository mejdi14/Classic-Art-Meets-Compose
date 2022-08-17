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

public val SelectedIcons.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 5.5f)
                verticalLineTo(3.04f)
                lineToRelative(4.21f, 4.21f)
                horizontalLineTo(16.5f)
                arcTo(1.758f, 1.758f, 0.0f, false, true, 14.75f, 5.5f)
                close()
                moveTo(16.5f, 8.75f)
                arcTo(3.256f, 3.256f, 0.0f, false, true, 13.25f, 5.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(9.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 4.5f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 9.0f, 21.5f)
                horizontalLineToRelative(6.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 19.5f, 17.0f)
                verticalLineTo(8.75f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
