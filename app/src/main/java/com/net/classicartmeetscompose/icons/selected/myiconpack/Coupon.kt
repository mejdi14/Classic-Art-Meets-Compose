package com.net.classicartmeetscompose.icons.selected.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.selected.SelectedIcons

public val SelectedIcons.Coupon: ImageVector
    get() {
        if (_coupon != null) {
            return _coupon!!
        }
        _coupon = Builder(
            name = "Coupon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF41416e)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.0f, 10.5f)
                horizontalLineToRelative(0.5f)
                lineTo(21.5f, 9.0f)
                arcTo(4.513f, 4.513f, 0.0f, false, false, 17.0f, 4.5f)
                horizontalLineToRelative(-0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 16.0f, 5.0f)
                lineTo(16.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(14.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(7.0f, 4.5f)
                arcTo(4.513f, 4.513f, 0.0f, false, false, 2.5f, 9.0f)
                verticalLineToRelative(1.5f)
                lineTo(3.0f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                lineTo(2.5f, 13.5f)
                lineTo(2.5f, 15.0f)
                arcTo(4.513f, 4.513f, 0.0f, false, false, 7.0f, 19.5f)
                horizontalLineToRelative(6.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 19.0f)
                lineTo(14.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                lineTo(17.0f, 19.5f)
                arcTo(4.513f, 4.513f, 0.0f, false, false, 21.5f, 15.0f)
                lineTo(21.5f, 13.5f)
                lineTo(21.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(16.0f, 13.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
            .build()
        return _coupon!!
    }

private var _coupon: ImageVector? = null
