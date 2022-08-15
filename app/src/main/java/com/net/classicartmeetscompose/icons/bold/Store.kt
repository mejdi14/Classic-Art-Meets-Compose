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

public val HomeIcon.Store: ImageVector
    get() {
        if (_store != null) {
            return _store!!
        }
        _store = Builder(name = "Store", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, -0.051f, -0.318f)
                lineTo(20.86f, 5.419f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 16.117f, 2.0f)
                horizontalLineTo(7.883f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 3.14f, 5.419f)
                lineTo(2.051f, 8.684f)
                arcTo(1.008f, 1.008f, 0.0f, false, false, 2.0f, 9.0f)
                arcToRelative(3.979f, 3.979f, 0.0f, false, false, 1.0f, 2.616f)
                verticalLineTo(18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(4.027f)
                verticalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(11.618f)
                arcTo(3.979f, 3.979f, 0.0f, false, false, 22.0f, 9.0f)
                close()
                moveTo(5.037f, 6.052f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.883f, 4.0f)
                horizontalLineToRelative(8.234f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.846f, 2.052f)
                lineTo(20.0f, 9.146f)
                arcTo(1.974f, 1.974f, 0.0f, false, true, 18.01f, 11.0f)
                arcToRelative(2.252f, 2.252f, 0.0f, false, true, -2.066f, -1.331f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 9.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.942f, 0.677f)
                arcToRelative(2.256f, 2.256f, 0.0f, false, true, -4.108f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 9.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.944f, 0.669f)
                arcTo(2.252f, 2.252f, 0.0f, false, true, 5.99f, 11.0f)
                arcTo(1.974f, 1.974f, 0.0f, false, true, 4.005f, 9.146f)
                close()
                moveTo(17.0f, 20.0f)
                horizontalLineTo(15.027f)
                verticalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(12.86f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, false, 0.99f, 0.14f)
                arcTo(4.39f, 4.39f, 0.0f, false, false, 9.0f, 11.779f)
                arcToRelative(4.306f, 4.306f, 0.0f, false, false, 6.008f, 0.0f)
                arcTo(4.393f, 4.393f, 0.0f, false, false, 18.01f, 13.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.99f, -0.14f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _store!!
    }

private var _store: ImageVector? = null
