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

public val UnselectedIcons.`Plus-square`: ImageVector
    get() {
        if (`_plus-square` != null) {
            return `_plus-square`!!
        }
        `_plus-square` = Builder(name = "Plus-square", defaultWidth = 24.0.dp, defaultHeight =
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
                lineTo(12.5f, 12.5f)
                lineTo(12.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(11.5f, 12.5f)
                lineTo(8.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                lineTo(11.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(3.5f)
                lineTo(16.0f, 11.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 16.5f, 12.0f)
                close()
            }
        }
        .build()
        return `_plus-square`!!
    }

private var `_plus-square`: ImageVector? = null
