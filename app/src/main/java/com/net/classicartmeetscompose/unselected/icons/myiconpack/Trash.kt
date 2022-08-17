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

public val MyIconPack.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 5.0f)
                lineTo(6.559f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.948f, -0.684f)
                lineToRelative(0.316f, -0.948f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.721f, 2.0f)
                horizontalLineToRelative(4.558f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.9f, 1.367f)
                lineToRelative(0.316f, 0.95f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.441f, 5.0f)
                lineTo(21.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 6.0f)
                close()
                moveTo(19.3f, 9.03f)
                lineToRelative(-0.61f, 9.2f)
                arcToRelative(3.523f, 3.523f, 0.0f, false, true, -3.5f, 3.27f)
                lineTo(8.81f, 21.5f)
                arcToRelative(3.521f, 3.521f, 0.0f, false, true, -3.5f, -3.26f)
                lineTo(4.7f, 9.03f)
                arcToRelative(0.511f, 0.511f, 0.0f, false, true, 0.13f, -0.37f)
                arcTo(0.523f, 0.523f, 0.0f, false, true, 5.2f, 8.5f)
                lineTo(18.8f, 8.5f)
                arcToRelative(0.523f, 0.523f, 0.0f, false, true, 0.37f, 0.16f)
                arcTo(0.511f, 0.511f, 0.0f, false, true, 19.3f, 9.03f)
                close()
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
