package com.net.classicartmeetscompose.unselected.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.unselected.icons.MyIconPack

public val MyIconPack.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.71f, 8.0f)
                lineToRelative(-4.77f, 4.77f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.44f, 1.06f)
                verticalLineTo(18.0f)
                arcToRelative(0.479f, 0.479f, 0.0f, false, true, -0.2f, 0.4f)
                lineToRelative(-4.0f, 3.0f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, true, -0.3f, 0.1f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, -0.22f, -0.05f)
                arcTo(0.512f, 0.512f, 0.0f, false, true, 9.5f, 21.0f)
                verticalLineTo(13.83f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.44f, -1.06f)
                lineTo(4.29f, 8.0f)
                close()
                moveTo(18.5f, 2.5f)
                horizontalLineTo(5.5f)
                arcToRelative(2.006f, 2.006f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(17.0f)
                verticalLineTo(4.5f)
                arcTo(2.006f, 2.006f, 0.0f, false, false, 18.5f, 2.5f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
