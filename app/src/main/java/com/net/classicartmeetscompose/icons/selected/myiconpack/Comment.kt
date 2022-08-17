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

public val SelectedIcons.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 8.0f)
                verticalLineToRelative(6.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 17.0f, 18.5f)
                horizontalLineTo(6.829f)
                arcToRelative(1.491f, 1.491f, 0.0f, false, false, -1.061f, 0.439f)
                lineTo(3.354f, 21.354f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 21.5f)
                arcToRelative(0.512f, 0.512f, 0.0f, false, true, -0.191f, -0.038f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 21.0f)
                verticalLineTo(8.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 7.0f, 3.5f)
                horizontalLineTo(17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 21.5f, 8.0f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
