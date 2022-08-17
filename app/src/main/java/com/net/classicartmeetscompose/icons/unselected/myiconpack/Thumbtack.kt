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

public val UnselectedIcons.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.233f, 9.526f)
                lineTo(16.5f, 8.793f)
                verticalLineToRelative(-2.6f)
                arcTo(5.488f, 5.488f, 0.0f, false, false, 17.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                arcToRelative(5.487f, 5.487f, 0.0f, false, false, 1.0f, 3.192f)
                verticalLineToRelative(2.6f)
                lineToRelative(-0.733f, 0.733f)
                arcTo(7.69f, 7.69f, 0.0f, false, false, 4.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                arcTo(7.688f, 7.688f, 0.0f, false, false, 17.233f, 9.526f)
                close()
                moveTo(5.519f, 14.5f)
                arcToRelative(6.683f, 6.683f, 0.0f, false, true, 1.955f, -4.266f)
                lineToRelative(0.88f, -0.88f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 8.5f, 9.0f)
                verticalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.146f, -0.353f)
                arcTo(3.941f, 3.941f, 0.0f, false, true, 7.53f, 3.5f)
                horizontalLineToRelative(8.94f)
                arcToRelative(3.948f, 3.948f, 0.0f, false, true, -0.824f, 2.146f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 15.5f, 6.0f)
                verticalLineTo(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.146f, 0.353f)
                lineToRelative(0.88f, 0.88f)
                arcTo(6.683f, 6.683f, 0.0f, false, true, 18.481f, 14.5f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
