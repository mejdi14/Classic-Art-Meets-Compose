package com.net.classicartmeetscompose.unselected.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.unselected.icons.MyIconPack

public val MyIconPack.`Shopping-basket`: ImageVector
    get() {
        if (`_shopping-basket` != null) {
            return `_shopping-basket`!!
        }
        `_shopping-basket` = Builder(name = "Shopping-basket", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.75f, 13.17f)
                arcToRelative(0.517f, 0.517f, 0.0f, false, false, -0.38f, -0.17f)
                lineTo(4.63f, 13.0f)
                arcToRelative(0.517f, 0.517f, 0.0f, false, false, -0.38f, 0.17f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, false, -0.12f, 0.4f)
                lineToRelative(0.71f, 5.38f)
                arcTo(3.513f, 3.513f, 0.0f, false, false, 8.31f, 22.0f)
                horizontalLineToRelative(7.4f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, false, 3.48f, -3.06f)
                lineToRelative(0.68f, -5.38f)
                arcTo(0.551f, 0.551f, 0.0f, false, false, 19.75f, 13.17f)
                close()
                moveTo(11.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(9.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(15.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(13.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(22.0f, 9.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.25f, 2.25f)
                lineTo(4.25f, 11.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -4.5f)
                lineTo(6.434f, 7.0f)
                lineTo(9.143f, 2.485f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.714f, 1.03f)
                lineTo(8.766f, 7.0f)
                horizontalLineToRelative(6.468f)
                lineTo(13.143f, 3.515f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.714f, -1.03f)
                lineTo(17.566f, 7.0f)
                lineTo(19.75f, 7.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 22.0f, 9.25f)
                close()
            }
        }
        .build()
        return `_shopping-basket`!!
    }

private var `_shopping-basket`: ImageVector? = null
