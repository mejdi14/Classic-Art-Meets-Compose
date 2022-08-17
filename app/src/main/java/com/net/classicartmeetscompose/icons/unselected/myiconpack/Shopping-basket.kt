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

public val UnselectedIcons.`Shopping-basket`: ImageVector
    get() {
        if (`_shopping-basket` != null) {
            return `_shopping-basket`!!
        }
        `_shopping-basket` = Builder(name = "Shopping-basket", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 15.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(9.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(14.0f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(14.5f, 15.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 14.5f)
                close()
                moveTo(19.965f, 12.3f)
                lineTo(19.182f, 18.438f)
                arcTo(3.507f, 3.507f, 0.0f, false, true, 15.71f, 21.5f)
                horizontalLineToRelative(-7.4f)
                arcToRelative(3.509f, 3.509f, 0.0f, false, true, -3.47f, -3.045f)
                lineToRelative(-0.806f, -6.15f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.0f, 7.5f)
                lineTo(6.717f, 7.5f)
                lineTo(9.571f, 2.742f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.858f, 0.515f)
                lineTo(7.883f, 7.5f)
                horizontalLineToRelative(8.234f)
                lineTo(13.571f, 3.257f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.858f, -0.515f)
                lineTo(17.283f, 7.5f)
                lineTo(19.0f, 7.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.965f, 4.805f)
                close()
                moveTo(18.19f, 18.316f)
                lineToRelative(0.742f, -5.816f)
                lineTo(5.07f, 12.5f)
                lineToRelative(0.763f, 5.825f)
                arcTo(2.508f, 2.508f, 0.0f, false, false, 8.312f, 20.5f)
                horizontalLineToRelative(7.4f)
                arcTo(2.506f, 2.506f, 0.0f, false, false, 18.19f, 18.316f)
                close()
                moveTo(20.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 8.5f)
                lineTo(5.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(19.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 10.0f)
                close()
            }
        }
        .build()
        return `_shopping-basket`!!
    }

private var `_shopping-basket`: ImageVector? = null
