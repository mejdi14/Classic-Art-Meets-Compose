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

public val SelectedIcons.Discount: ImageVector
    get() {
        if (_discount != null) {
            return _discount!!
        }
        _discount = Builder(
            name = "Discount",
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
                moveTo(20.62f, 9.869f)
                lineToRelative(-0.58f, -0.58f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.44f, -1.06f)
                verticalLineToRelative(-0.82f)
                arcTo(3.013f, 3.013f, 0.0f, false, false, 16.59f, 4.4f)
                horizontalLineToRelative(-0.82f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, true, -1.06f, -0.44f)
                lineToRelative(-0.58f, -0.58f)
                arcToRelative(3.024f, 3.024f, 0.0f, false, false, -4.26f, 0.0f)
                lineToRelative(-0.58f, 0.58f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, true, -1.06f, 0.44f)
                lineTo(7.41f, 4.4f)
                arcTo(3.013f, 3.013f, 0.0f, false, false, 4.4f, 7.409f)
                verticalLineToRelative(0.82f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, true, -0.44f, 1.06f)
                lineToRelative(-0.58f, 0.58f)
                arcToRelative(3.018f, 3.018f, 0.0f, false, false, 0.0f, 4.26f)
                lineToRelative(0.58f, 0.58f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, true, 0.44f, 1.06f)
                verticalLineToRelative(0.82f)
                arcTo(3.013f, 3.013f, 0.0f, false, false, 7.41f, 19.6f)
                horizontalLineToRelative(0.82f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, true, 1.06f, 0.44f)
                lineToRelative(0.58f, 0.58f)
                arcToRelative(3.018f, 3.018f, 0.0f, false, false, 4.26f, 0.0f)
                lineToRelative(0.58f, -0.58f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, true, 1.06f, -0.44f)
                horizontalLineToRelative(0.82f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, false, 3.01f, -3.01f)
                verticalLineToRelative(-0.82f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.44f, -1.06f)
                lineToRelative(0.58f, -0.58f)
                arcToRelative(3.018f, 3.018f, 0.0f, false, false, 0.0f, -4.26f)
                close()
                moveTo(9.5f, 8.249f)
                arcTo(1.25f, 1.25f, 0.0f, true, true, 8.25f, 9.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 9.5f, 8.249f)
                close()
                moveTo(14.5f, 15.749f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 1.25f, -1.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 14.5f, 15.749f)
                close()
                moveTo(15.71f, 9.709f)
                lineTo(9.71f, 15.709f)
                arcTo(1.024f, 1.024f, 0.0f, false, true, 9.0f, 16.0f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, true, -0.71f, -0.29f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 0.0f, -1.42f)
                lineToRelative(6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.42f, 1.42f)
                close()
            }
        }
            .build()
        return _discount!!
    }

private var _discount: ImageVector? = null
