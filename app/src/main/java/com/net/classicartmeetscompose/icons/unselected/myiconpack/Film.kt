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

public val UnselectedIcons.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.5f)
                lineTo(7.0f, 2.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 2.5f, 7.0f)
                lineTo(2.5f, 17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 7.0f, 21.5f)
                lineTo(17.0f, 21.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 21.5f, 17.0f)
                lineTo(21.5f, 7.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 17.0f, 2.5f)
                close()
                moveTo(17.5f, 12.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(17.5f, 8.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(20.5f, 7.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.5f, 3.55f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 7.0f)
                close()
                moveTo(16.5f, 3.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(6.5f, 15.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(3.5f, 11.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.5f, 3.55f)
                lineTo(6.5f, 7.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(3.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 6.5f, 3.55f)
                close()
                moveTo(3.5f, 17.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.949f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 3.5f, 17.0f)
                close()
                moveTo(7.5f, 20.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(17.5f, 20.449f)
                lineTo(17.5f, 16.5f)
                horizontalLineToRelative(3.0f)
                lineTo(20.5f, 17.0f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 17.5f, 20.449f)
                close()
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
