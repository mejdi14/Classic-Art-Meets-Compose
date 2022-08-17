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

public val UnselectedIcons.`Credit-card`: ImageVector
    get() {
        if (`_credit-card` != null) {
            return `_credit-card`!!
        }
        `_credit-card` = Builder(name = "Credit-card", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.5f)
                lineTo(7.0f, 4.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 2.5f, 9.0f)
                verticalLineToRelative(6.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 7.0f, 19.5f)
                lineTo(17.0f, 19.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 21.5f, 15.0f)
                lineTo(21.5f, 9.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 17.0f, 4.5f)
                close()
                moveTo(7.0f, 5.5f)
                lineTo(17.0f, 5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 9.0f)
                verticalLineToRelative(0.5f)
                lineTo(3.5f, 9.5f)
                lineTo(3.5f, 9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 5.5f)
                close()
                moveTo(17.0f, 18.5f)
                lineTo(7.0f, 18.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 15.0f)
                lineTo(3.5f, 10.5f)
                horizontalLineToRelative(17.0f)
                lineTo(20.5f, 15.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 18.5f)
                close()
                moveTo(10.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(7.0f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.5f, 15.0f)
                close()
            }
        }
        .build()
        return `_credit-card`!!
    }

private var `_credit-card`: ImageVector? = null
