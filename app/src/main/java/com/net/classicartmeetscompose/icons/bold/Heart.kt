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

public val HomeIcon.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3f, 5.438f)
                arcTo(6.49f, 6.49f, 0.0f, false, false, 15.228f, 3.0f)
                arcTo(7.025f, 7.025f, 0.0f, false, false, 12.0f, 3.775f)
                arcTo(7.025f, 7.025f, 0.0f, false, false, 8.772f, 3.0f)
                arcTo(6.49f, 6.49f, 0.0f, false, false, 3.7f, 5.438f)
                arcTo(7.586f, 7.586f, 0.0f, false, false, 2.14f, 11.657f)
                curveToRelative(0.993f, 5.095f, 6.152f, 8.636f, 8.324f, 9.922f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, false, 3.073f, 0.0f)
                curveToRelative(2.171f, -1.285f, 7.33f, -4.826f, 8.323f, -9.921f)
                arcTo(7.586f, 7.586f, 0.0f, false, false, 20.3f, 5.438f)
                close()
                moveTo(19.9f, 11.274f)
                curveToRelative(-0.838f, 4.3f, -5.439f, 7.435f, -7.379f, 8.583f)
                arcToRelative(1.022f, 1.022f, 0.0f, false, true, -1.036f, 0.0f)
                curveToRelative(-1.94f, -1.148f, -6.541f, -4.283f, -7.379f, -8.583f)
                arcTo(5.568f, 5.568f, 0.0f, false, true, 5.241f, 6.709f)
                arcTo(4.521f, 4.521f, 0.0f, false, true, 8.772f, 5.0f)
                arcToRelative(4.984f, 4.984f, 0.0f, false, true, 2.69f, 0.771f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, 1.076f, 0.0f)
                arcTo(4.984f, 4.984f, 0.0f, false, true, 15.228f, 5.0f)
                arcToRelative(4.521f, 4.521f, 0.0f, false, true, 3.531f, 1.709f)
                arcTo(5.568f, 5.568f, 0.0f, false, true, 19.9f, 11.274f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
