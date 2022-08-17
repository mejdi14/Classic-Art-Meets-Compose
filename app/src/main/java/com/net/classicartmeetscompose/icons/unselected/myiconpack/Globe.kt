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

public val UnselectedIcons.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.952f, 8.834f)
                arcToRelative(9.438f, 9.438f, 0.0f, false, false, -7.591f, -6.24f)
                arcToRelative(9.926f, 9.926f, 0.0f, false, false, -2.722f, 0.0f)
                arcTo(9.434f, 9.434f, 0.0f, false, false, 3.05f, 8.83f)
                arcToRelative(9.412f, 9.412f, 0.0f, false, false, 0.0f, 6.335f)
                arcToRelative(9.436f, 9.436f, 0.0f, false, false, 7.592f, 6.24f)
                arcToRelative(9.789f, 9.789f, 0.0f, false, false, 2.721f, 0.0f)
                arcTo(9.433f, 9.433f, 0.0f, false, false, 20.95f, 15.17f)
                arcToRelative(9.415f, 9.415f, 0.0f, false, false, 0.0f, -6.336f)
                close()
                moveTo(19.723f, 8.5f)
                lineTo(16.1f, 8.5f)
                arcToRelative(16.026f, 16.026f, 0.0f, false, false, -1.791f, -4.682f)
                arcTo(8.416f, 8.416f, 0.0f, false, true, 19.723f, 8.5f)
                close()
                moveTo(15.5f, 12.0f)
                arcToRelative(15.2f, 15.2f, 0.0f, false, true, -0.222f, 2.5f)
                lineTo(8.722f, 14.5f)
                arcTo(15.168f, 15.168f, 0.0f, false, true, 8.5f, 12.0f)
                arcToRelative(15.163f, 15.163f, 0.0f, false, true, 0.222f, -2.5f)
                horizontalLineToRelative(6.556f)
                arcTo(15.134f, 15.134f, 0.0f, false, true, 15.5f, 12.0f)
                close()
                moveTo(13.0f, 3.569f)
                arcTo(15.079f, 15.079f, 0.0f, false, true, 15.078f, 8.5f)
                lineTo(8.922f, 8.5f)
                arcTo(15.069f, 15.069f, 0.0f, false, true, 11.0f, 3.569f)
                arcTo(8.553f, 8.553f, 0.0f, false, true, 12.0f, 3.5f)
                arcTo(8.568f, 8.568f, 0.0f, false, true, 13.0f, 3.569f)
                close()
                moveTo(9.691f, 3.819f)
                arcTo(16.054f, 16.054f, 0.0f, false, false, 7.9f, 8.5f)
                lineTo(4.277f, 8.5f)
                arcTo(8.412f, 8.412f, 0.0f, false, true, 9.687f, 3.819f)
                close()
                moveTo(3.887f, 9.5f)
                lineTo(7.712f, 9.5f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 7.5f, 12.0f)
                arcToRelative(16.07f, 16.07f, 0.0f, false, false, 0.213f, 2.5f)
                lineTo(3.888f, 14.5f)
                arcToRelative(8.258f, 8.258f, 0.0f, false, true, 0.0f, -5.0f)
                close()
                moveTo(4.279f, 15.5f)
                lineTo(7.9f, 15.5f)
                arcToRelative(16.036f, 16.036f, 0.0f, false, false, 1.791f, 4.68f)
                arcTo(8.415f, 8.415f, 0.0f, false, true, 4.279f, 15.5f)
                close()
                moveTo(11.0f, 20.43f)
                arcTo(15.08f, 15.08f, 0.0f, false, true, 8.923f, 15.5f)
                horizontalLineToRelative(6.154f)
                arcTo(15.046f, 15.046f, 0.0f, false, true, 13.0f, 20.43f)
                arcTo(8.73f, 8.73f, 0.0f, false, true, 11.0f, 20.43f)
                close()
                moveTo(14.309f, 20.181f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.1f, 15.5f)
                horizontalLineToRelative(3.618f)
                arcTo(8.415f, 8.415f, 0.0f, false, true, 14.313f, 20.181f)
                close()
                moveTo(20.109f, 14.501f)
                lineTo(16.287f, 14.501f)
                arcTo(16.111f, 16.111f, 0.0f, false, false, 16.5f, 12.0f)
                arcToRelative(16.166f, 16.166f, 0.0f, false, false, -0.212f, -2.5f)
                horizontalLineToRelative(3.825f)
                arcToRelative(8.258f, 8.258f, 0.0f, false, true, 0.0f, 5.0f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
