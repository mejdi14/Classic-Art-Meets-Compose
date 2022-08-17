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

public val UnselectedIcons.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.061f, 6.354f)
                lineTo(17.646f, 2.939f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, -1.06f, -0.439f)
                lineTo(11.0f, 2.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.5f, 6.0f)
                verticalLineToRelative(0.5f)
                lineTo(6.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.5f, 10.0f)
                verticalLineToRelative(8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.0f, 21.5f)
                horizontalLineToRelative(7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.5f, 18.0f)
                verticalLineToRelative(-0.5f)
                lineTo(18.0f, 17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.5f, 14.0f)
                lineTo(21.5f, 7.414f)
                arcTo(1.49f, 1.49f, 0.0f, false, false, 21.061f, 6.354f)
                close()
                moveTo(17.481f, 4.188f)
                lineTo(19.812f, 6.519f)
                lineTo(18.8f, 6.519f)
                arcTo(1.323f, 1.323f, 0.0f, false, true, 17.481f, 5.2f)
                close()
                moveTo(15.5f, 18.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.0f, 20.5f)
                lineTo(6.0f, 20.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.5f, 18.0f)
                lineTo(3.5f, 10.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 7.5f)
                lineTo(7.5f, 7.5f)
                lineTo(7.5f, 14.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.0f, 17.5f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(18.0f, 16.5f)
                lineTo(11.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.5f, 14.0f)
                lineTo(8.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.0f, 3.5f)
                horizontalLineToRelative(5.481f)
                lineTo(16.481f, 5.2f)
                arcTo(2.323f, 2.323f, 0.0f, false, false, 18.8f, 7.519f)
                horizontalLineToRelative(1.7f)
                lineTo(20.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.0f, 16.5f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
