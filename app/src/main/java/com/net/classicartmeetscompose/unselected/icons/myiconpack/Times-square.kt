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

public val MyIconPack.`Times-square`: ImageVector
    get() {
        if (`_times-square` != null) {
            return `_times-square`!!
        }
        `_times-square` = Builder(name = "Times-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.5f)
                lineTo(9.0f, 2.5f)
                arcTo(6.513f, 6.513f, 0.0f, false, false, 2.5f, 9.0f)
                verticalLineToRelative(6.0f)
                arcTo(6.513f, 6.513f, 0.0f, false, false, 9.0f, 21.5f)
                horizontalLineToRelative(6.0f)
                arcTo(6.513f, 6.513f, 0.0f, false, false, 21.5f, 15.0f)
                lineTo(21.5f, 9.0f)
                arcTo(6.513f, 6.513f, 0.0f, false, false, 15.0f, 2.5f)
                close()
                moveTo(15.71f, 14.29f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 0.0f, 1.42f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, true, -1.42f, 0.0f)
                lineTo(12.0f, 13.42f)
                lineTo(9.71f, 15.71f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, true, -1.42f, 0.0f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 0.0f, -1.42f)
                lineTo(10.58f, 12.0f)
                lineTo(8.29f, 9.71f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.71f, 8.29f)
                lineTo(12.0f, 10.58f)
                lineToRelative(2.29f, -2.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 1.42f)
                lineTo(13.42f, 12.0f)
                close()
            }
        }
        .build()
        return `_times-square`!!
    }

private var `_times-square`: ImageVector? = null
