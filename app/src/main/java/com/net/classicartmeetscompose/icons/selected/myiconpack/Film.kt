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

public val SelectedIcons.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 7.0f)
                lineTo(2.0f, 17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(17.0f, 22.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(22.0f, 7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 17.0f, 2.0f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(18.0f, 11.0f)
                lineTo(18.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                lineTo(4.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                close()
                moveTo(4.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 15.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(18.0f, 15.0f)
                close()
                moveTo(20.0f, 7.0f)
                lineTo(18.0f, 7.0f)
                lineTo(18.0f, 4.184f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 7.0f)
                close()
                moveTo(6.0f, 4.184f)
                lineTo(6.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 4.184f)
                close()
                moveTo(4.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(2.816f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 17.0f)
                close()
                moveTo(18.0f, 19.816f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 19.816f)
                close()
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
