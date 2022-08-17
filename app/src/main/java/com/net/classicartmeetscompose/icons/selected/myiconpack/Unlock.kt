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

public val SelectedIcons.Unlock: ImageVector
    get() {
        if (_unlock != null) {
            return _unlock!!
        }
        _unlock = Builder(name = "Unlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, true, 3.0f, -3.0f)
                arcToRelative(3.162f, 3.162f, 0.0f, false, true, 3.03f, 2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.94f, -0.5f)
                arcTo(5.15f, 5.15f, 0.0f, false, false, 12.0f, 2.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 7.0f)
                verticalLineTo(9.99f)
                arcTo(4.482f, 4.482f, 0.0f, false, false, 4.5f, 14.0f)
                verticalLineToRelative(3.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 9.0f, 21.5f)
                horizontalLineToRelative(6.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 19.5f, 17.0f)
                verticalLineTo(14.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 15.0f, 9.5f)
                close()
                moveTo(13.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _unlock!!
    }

private var _unlock: ImageVector? = null
