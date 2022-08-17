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

public val MyIconPack.`Volume-up`: ImageVector
    get() {
        if (`_volume-up` != null) {
            return `_volume-up`!!
        }
        `_volume-up` = Builder(name = "Volume-up", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 6.511f)
                lineTo(13.5f, 17.489f)
                arcToRelative(2.976f, 2.976f, 0.0f, false, true, -1.749f, 2.732f)
                arcToRelative(3.016f, 3.016f, 0.0f, false, true, -1.261f, 0.279f)
                arcToRelative(2.972f, 2.972f, 0.0f, false, true, -1.941f, -0.727f)
                lineTo(5.955f, 17.548f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.324f, -0.121f)
                lineTo(4.893f, 17.427f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -2.393f, -2.4f)
                lineTo(2.5f, 8.975f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.392f, -2.4f)
                horizontalLineToRelative(0.739f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.323f, -0.12f)
                lineToRelative(2.6f, -2.226f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.5f, 6.511f)
                close()
                moveTo(16.8f, 8.4f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 15.2f, 9.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 4.792f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.8f, 15.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -7.208f)
                close()
                moveTo(19.446f, 5.335f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.486f, 1.338f)
                arcToRelative(7.977f, 7.977f, 0.0f, false, true, 0.0f, 10.662f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.486f, 1.338f)
                arcToRelative(9.975f, 9.975f, 0.0f, false, false, 0.0f, -13.338f)
                close()
            }
        }
        .build()
        return `_volume-up`!!
    }

private var `_volume-up`: ImageVector? = null
