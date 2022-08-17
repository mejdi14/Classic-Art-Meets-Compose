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

public val UnselectedIcons.`Sliders-h`: ImageVector
    get() {
        if (`_sliders-h` != null) {
            return `_sliders-h`!!
        }
        `_sliders-h` = Builder(name = "Sliders-h", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.551f, 6.5f)
                lineTo(3.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(5.551f, 7.5f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 8.5f, 4.0f)
                close()
                moveTo(8.5f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.5f, 9.0f)
                close()
                moveTo(14.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(15.0f, 7.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 14.5f, 7.0f)
                close()
                moveTo(21.0f, 16.5f)
                lineTo(18.449f, 16.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 1.0f)
                lineTo(21.0f, 17.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(15.5f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.5f, 19.0f)
                close()
                moveTo(9.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(3.0f, 17.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(9.0f, 16.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 9.5f, 17.0f)
                close()
            }
        }
        .build()
        return `_sliders-h`!!
    }

private var `_sliders-h`: ImageVector? = null
