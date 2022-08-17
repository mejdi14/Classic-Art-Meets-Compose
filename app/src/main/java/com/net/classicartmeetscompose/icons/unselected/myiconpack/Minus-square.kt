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

public val UnselectedIcons.`Minus-square`: ImageVector
    get() {
        if (`_minus-square` != null) {
            return `_minus-square`!!
        }
        `_minus-square` = Builder(name = "Minus-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.5f)
                lineTo(9.0f, 2.5f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 2.5f, 9.0f)
                verticalLineToRelative(6.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 9.0f, 21.5f)
                horizontalLineToRelative(6.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 21.5f, 15.0f)
                lineTo(21.5f, 9.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 15.0f, 2.5f)
                close()
                moveTo(20.5f, 15.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 15.0f, 20.5f)
                lineTo(9.0f, 20.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 3.5f, 15.0f)
                lineTo(3.5f, 9.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 9.0f, 3.5f)
                horizontalLineToRelative(6.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 20.5f, 9.0f)
                close()
                moveTo(16.5f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(8.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 16.5f, 12.0f)
                close()
            }
        }
        .build()
        return `_minus-square`!!
    }

private var `_minus-square`: ImageVector? = null
