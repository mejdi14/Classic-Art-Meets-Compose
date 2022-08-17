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

public val SelectedIcons.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.14f)
                verticalLineToRelative(0.51f)
                arcToRelative(3.208f, 3.208f, 0.0f, false, true, -0.71f, 2.02f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, true, -0.74f, 0.33f)
                lineTo(16.87f, 21.0f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, 0.63f, -2.35f)
                verticalLineToRelative(-0.51f)
                arcToRelative(5.663f, 5.663f, 0.0f, false, false, -1.43f, -3.78f)
                arcToRelative(1.108f, 1.108f, 0.0f, false, false, 0.19f, -0.09f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, true, 1.57f, -0.21f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 21.0f, 18.14f)
                close()
                moveTo(14.0f, 4.0f)
                arcToRelative(4.078f, 4.078f, 0.0f, false, false, -0.93f, 0.1f)
                arcToRelative(5.981f, 5.981f, 0.0f, false, true, 0.0f, 8.8f)
                arcTo(4.078f, 4.078f, 0.0f, false, false, 14.0f, 13.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, -9.0f)
                close()
                moveTo(9.0f, 4.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 4.5f, 4.5f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 9.0f, 4.0f)
                close()
                moveTo(12.83f, 14.06f)
                arcTo(2.393f, 2.393f, 0.0f, false, false, 12.3f, 14.0f)
                arcToRelative(2.068f, 2.068f, 0.0f, false, false, -1.04f, 0.27f)
                arcToRelative(4.763f, 4.763f, 0.0f, false, true, -4.5f, 0.01f)
                arcTo(2.247f, 2.247f, 0.0f, false, false, 5.69f, 14.0f)
                arcToRelative(2.315f, 2.315f, 0.0f, false, false, -0.46f, 0.05f)
                arcTo(4.177f, 4.177f, 0.0f, false, false, 2.0f, 18.14f)
                verticalLineToRelative(0.51f)
                arcToRelative(3.208f, 3.208f, 0.0f, false, false, 0.71f, 2.02f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, false, 0.74f, 0.33f)
                horizontalLineToRelative(11.1f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, false, 0.74f, -0.33f)
                arcTo(3.208f, 3.208f, 0.0f, false, false, 16.0f, 18.65f)
                verticalLineToRelative(-0.51f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 12.83f, 14.06f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
