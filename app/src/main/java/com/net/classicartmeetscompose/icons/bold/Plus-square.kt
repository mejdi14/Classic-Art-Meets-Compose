package com.net.classicartmeetscompose.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.HomeIcon

public val HomeIcon.`Plus-square`: ImageVector
    get() {
        if (`_plus-square` != null) {
            return `_plus-square`!!
        }
        `_plus-square` = Builder(name = "Plus-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                arcTo(7.008f, 7.008f, 0.0f, false, false, 2.0f, 9.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, 7.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, 7.0f, -7.0f)
                lineTo(22.0f, 9.0f)
                arcTo(7.008f, 7.008f, 0.0f, false, false, 15.0f, 2.0f)
                close()
                moveTo(20.0f, 15.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(9.0f, 20.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(4.0f, 9.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                close()
                moveTo(17.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(13.0f, 13.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_plus-square`!!
    }

private var `_plus-square`: ImageVector? = null
