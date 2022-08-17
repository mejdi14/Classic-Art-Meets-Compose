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

public val MyIconPack.`Credit-card`: ImageVector
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
                horizontalLineTo(7.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 2.5f, 9.0f)
                horizontalLineToRelative(19.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 17.0f, 4.5f)
                close()
                moveTo(2.5f, 11.0f)
                verticalLineToRelative(4.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 7.0f, 19.5f)
                horizontalLineTo(17.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 21.5f, 15.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(10.0f, 16.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_credit-card`!!
    }

private var `_credit-card`: ImageVector? = null
