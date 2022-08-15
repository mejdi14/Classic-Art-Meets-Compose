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

public val HomeIcon.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 7.3f)
                arcToRelative(2.194f, 2.194f, 0.0f, false, false, -2.258f, 0.106f)
                lineTo(15.917f, 9.177f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 11.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.917f, -4.177f)
                lineToRelative(2.665f, 1.771f)
                arcTo(2.2f, 2.2f, 0.0f, false, false, 22.0f, 14.762f)
                lineTo(22.0f, 9.238f)
                arcTo(2.194f, 2.194f, 0.0f, false, false, 20.84f, 7.3f)
                close()
                moveTo(14.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(7.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(4.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(20.0f, 14.762f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.311f, 0.166f)
                lineTo(16.0f, 12.476f)
                verticalLineToRelative(-0.952f)
                lineToRelative(3.689f, -2.452f)
                arcTo(0.2f, 0.2f, 0.0f, false, true, 20.0f, 9.238f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
