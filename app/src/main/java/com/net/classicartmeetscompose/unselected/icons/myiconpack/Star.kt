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

public val MyIconPack.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.934f, 12.13f)
                lineTo(17.82f, 15.122f)
                lineToRelative(0.735f, 4.221f)
                arcToRelative(1.824f, 1.824f, 0.0f, false, true, -0.726f, 1.792f)
                arcToRelative(1.872f, 1.872f, 0.0f, false, true, -1.973f, 0.152f)
                lineTo(12.0f, 19.29f)
                lineToRelative(-3.856f, 2.0f)
                arcToRelative(1.869f, 1.869f, 0.0f, false, true, -1.973f, -0.152f)
                arcToRelative(1.824f, 1.824f, 0.0f, false, true, -0.726f, -1.792f)
                lineToRelative(0.735f, -4.221f)
                lineTo(3.066f, 12.13f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -0.477f, -1.881f)
                arcTo(1.845f, 1.845f, 0.0f, false, true, 4.1f, 8.986f)
                lineToRelative(4.309f, -0.617f)
                lineToRelative(1.926f, -3.845f)
                arcToRelative(1.871f, 1.871f, 0.0f, false, true, 3.336f, 0.0f)
                lineToRelative(1.926f, 3.845f)
                lineToRelative(4.309f, 0.617f)
                arcToRelative(1.845f, 1.845f, 0.0f, false, true, 1.508f, 1.263f)
                arcTo(1.82f, 1.82f, 0.0f, false, true, 20.934f, 12.13f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
