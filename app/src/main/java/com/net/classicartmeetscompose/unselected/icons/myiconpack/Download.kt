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

public val MyIconPack.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.48f)
                horizontalLineToRelative(-0.92f)
                lineToRelative(-2.3f, 2.3f)
                arcToRelative(2.475f, 2.475f, 0.0f, false, true, -3.53f, 0.0f)
                lineToRelative(-2.3f, -2.3f)
                lineTo(7.0f, 10.48f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(1.0f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 7.0f, 20.48f)
                lineTo(17.0f, 20.48f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.5f, -4.5f)
                verticalLineToRelative(-1.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 17.0f, 10.48f)
                close()
                moveTo(17.0f, 16.23f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 1.24f, -1.25f)
                arcTo(1.253f, 1.253f, 0.0f, false, true, 17.0f, 16.23f)
                close()
                moveTo(8.31f, 8.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.41f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                lineTo(11.01f, 8.6f)
                lineTo(11.01f, 4.02f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.01f, 8.6f)
                lineToRelative(1.3f, -1.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.41f)
                lineToRelative(-1.76f, 1.76f)
                lineToRelative(-1.24f, 1.24f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, true, -1.41f, 0.0f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
