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

public val SelectedIcons.Store: ImageVector
    get() {
        if (_store != null) {
            return _store!!
        }
        _store = Builder(name = "Store", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 18.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 21.5f)
                lineTo(14.53f, 21.5f)
                lineTo(14.53f, 19.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                verticalLineToRelative(2.5f)
                lineTo(7.0f, 21.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 18.0f)
                lineTo(3.5f, 13.35f)
                arcTo(5.634f, 5.634f, 0.0f, false, false, 5.99f, 14.0f)
                arcTo(4.409f, 4.409f, 0.0f, false, false, 9.0f, 12.78f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 6.0f, 0.0f)
                arcTo(4.409f, 4.409f, 0.0f, false, false, 18.01f, 14.0f)
                arcToRelative(5.634f, 5.634f, 0.0f, false, false, 2.49f, -0.65f)
                close()
                moveTo(21.474f, 8.842f)
                lineTo(20.386f, 5.577f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 16.117f, 2.5f)
                lineTo(7.883f, 2.5f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 3.614f, 5.577f)
                lineTo(2.526f, 8.842f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 2.5f, 9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.49f, 3.5f)
                arcTo(3.853f, 3.853f, 0.0f, false, false, 9.0f, 11.034f)
                arcToRelative(3.809f, 3.809f, 0.0f, false, false, 6.006f, 0.0f)
                arcTo(3.854f, 3.854f, 0.0f, false, false, 18.01f, 12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.5f, 9.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 21.474f, 8.842f)
                close()
            }
        }
        .build()
        return _store!!
    }

private var _store: ImageVector? = null
