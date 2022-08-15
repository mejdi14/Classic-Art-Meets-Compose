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

public val HomeIcon.`Shopping-basket`: ImageVector
    get() {
        if (`_shopping-basket` != null) {
            return `_shopping-basket`!!
        }
        `_shopping-basket` = Builder(name = "Shopping-basket", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(9.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(14.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(15.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 14.0f)
                close()
                moveTo(20.429f, 12.621f)
                lineTo(19.678f, 18.507f)
                arcTo(4.008f, 4.008f, 0.0f, false, true, 15.71f, 22.0f)
                horizontalLineToRelative(-7.4f)
                arcToRelative(4.011f, 4.011f, 0.0f, false, true, -3.966f, -3.48f)
                lineToRelative(-0.773f, -5.9f)
                arcTo(2.989f, 2.989f, 0.0f, false, true, 5.0f, 7.0f)
                lineTo(6.434f, 7.0f)
                lineTo(9.143f, 2.485f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.714f, 1.03f)
                lineTo(8.766f, 7.0f)
                horizontalLineToRelative(6.468f)
                lineTo(13.143f, 3.515f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.714f, -1.03f)
                lineTo(17.566f, 7.0f)
                lineTo(19.0f, 7.0f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, true, 1.429f, 5.621f)
                close()
                moveTo(4.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(19.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(5.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 10.0f)
                close()
                moveTo(18.364f, 13.0f)
                lineTo(5.64f, 13.0f)
                lineToRelative(0.69f, 5.26f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.312f, 20.0f)
                horizontalLineToRelative(7.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.984f, -1.746f)
                close()
            }
        }
        .build()
        return `_shopping-basket`!!
    }

private var `_shopping-basket`: ImageVector? = null
