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

public val UnselectedIcons.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 17.638f)
                verticalLineToRelative(0.507f)
                arcToRelative(3.259f, 3.259f, 0.0f, false, true, -0.844f, 2.191f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.741f, -0.672f)
                arcToRelative(2.259f, 2.259f, 0.0f, false, false, 0.585f, -1.519f)
                verticalLineToRelative(-0.507f)
                arcToRelative(3.186f, 3.186f, 0.0f, false, false, -2.416f, -3.1f)
                arcToRelative(1.151f, 1.151f, 0.0f, false, false, -0.84f, 0.108f)
                arcToRelative(5.726f, 5.726f, 0.0f, false, true, -5.483f, 0.0f)
                arcToRelative(1.149f, 1.149f, 0.0f, false, false, -0.845f, -0.111f)
                arcToRelative(3.186f, 3.186f, 0.0f, false, false, -2.416f, 3.1f)
                verticalLineToRelative(0.507f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, 0.585f, 1.519f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.741f, 0.671f)
                arcToRelative(3.258f, 3.258f, 0.0f, false, true, -0.844f, -2.19f)
                verticalLineToRelative(-0.507f)
                arcToRelative(4.186f, 4.186f, 0.0f, false, true, 3.174f, -4.074f)
                arcToRelative(2.172f, 2.172f, 0.0f, false, true, 1.574f, 0.208f)
                arcToRelative(4.716f, 4.716f, 0.0f, false, false, 4.509f, 0.0f)
                arcToRelative(2.154f, 2.154f, 0.0f, false, true, 1.569f, -0.2f)
                arcTo(4.184f, 4.184f, 0.0f, false, true, 16.5f, 17.638f)
                close()
                moveTo(18.326f, 13.564f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.242f, 0.971f)
                arcToRelative(3.186f, 3.186f, 0.0f, false, true, 2.416f, 3.1f)
                verticalLineToRelative(0.507f)
                arcToRelative(2.259f, 2.259f, 0.0f, false, true, -0.585f, 1.519f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.741f, 0.672f)
                arcToRelative(3.259f, 3.259f, 0.0f, false, false, 0.844f, -2.191f)
                verticalLineToRelative(-0.507f)
                arcTo(4.186f, 4.186f, 0.0f, false, false, 18.326f, 13.564f)
                close()
                moveTo(5.0f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 4.5f, 4.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 5.0f, 8.0f)
                close()
                moveTo(6.0f, 8.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 9.5f, 4.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.0f, 8.0f)
                close()
                moveTo(15.062f, 3.534f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.124f, 0.993f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.749f, 6.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.626f, 0.78f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -2.251f, -7.978f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
