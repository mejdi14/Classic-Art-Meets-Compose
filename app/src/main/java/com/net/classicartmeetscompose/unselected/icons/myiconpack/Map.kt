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

public val MyIconPack.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.88f, 2.77f)
                arcToRelative(2.388f, 2.388f, 0.0f, false, true, 0.37f, -0.15f)
                lineTo(8.25f, 19.11f)
                lineTo(6.12f, 20.2f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -2.4f, -0.09f)
                arcTo(2.538f, 2.538f, 0.0f, false, true, 2.5f, 17.92f)
                lineTo(2.5f, 7.74f)
                arcToRelative(3.574f, 3.574f, 0.0f, false, true, 1.93f, -3.2f)
                close()
                moveTo(9.75f, 2.62f)
                lineTo(9.75f, 19.11f)
                lineToRelative(4.13f, 2.12f)
                arcToRelative(2.388f, 2.388f, 0.0f, false, false, 0.37f, 0.15f)
                lineTo(14.25f, 4.89f)
                lineTo(10.12f, 2.77f)
                arcTo(2.388f, 2.388f, 0.0f, false, false, 9.75f, 2.62f)
                close()
                moveTo(20.28f, 3.89f)
                arcToRelative(2.445f, 2.445f, 0.0f, false, false, -2.4f, -0.09f)
                lineTo(15.75f, 4.89f)
                lineTo(15.75f, 21.38f)
                arcToRelative(2.388f, 2.388f, 0.0f, false, false, 0.37f, -0.15f)
                lineToRelative(3.45f, -1.77f)
                arcToRelative(3.574f, 3.574f, 0.0f, false, false, 1.93f, -3.2f)
                lineTo(21.5f, 6.08f)
                arcTo(2.538f, 2.538f, 0.0f, false, false, 20.28f, 3.89f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
