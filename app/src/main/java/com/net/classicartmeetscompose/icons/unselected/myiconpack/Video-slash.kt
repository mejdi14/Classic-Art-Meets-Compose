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

public val UnselectedIcons.`Video-slash`: ImageVector
    get() {
        if (`_video-slash` != null) {
            return `_video-slash`!!
        }
        `_video-slash` = Builder(name = "Video-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.721f, 16.78f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.412f, -0.216f)
                arcTo(4.489f, 4.489f, 0.0f, false, true, 2.5f, 14.0f)
                lineTo(2.5f, 10.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 7.0f, 5.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.487f, 4.487f, 0.0f, false, true, 2.564f, 0.809f)
                arcTo(0.5f, 0.5f, 0.0f, true, true, 13.0f, 7.131f)
                arcTo(3.491f, 3.491f, 0.0f, false, false, 11.0f, 6.5f)
                lineTo(7.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.5f, 10.0f)
                verticalLineToRelative(4.0f)
                arcTo(3.491f, 3.491f, 0.0f, false, false, 4.131f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.41f, 0.785f)
                close()
                moveTo(21.5f, 9.238f)
                verticalLineToRelative(5.523f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -2.641f, 1.416f)
                lineTo(15.5f, 13.945f)
                lineTo(15.5f, 14.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 11.0f, 18.5f)
                lineTo(7.0f, 18.5f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, true, -0.727f, -0.067f)
                lineToRelative(-1.919f, 1.92f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.707f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.707f)
                lineToRelative(-4.92f, 4.92f)
                arcTo(4.812f, 4.812f, 0.0f, false, true, 15.5f, 10.0f)
                verticalLineToRelative(0.055f)
                lineToRelative(3.359f, -2.233f)
                arcTo(1.7f, 1.7f, 0.0f, false, true, 21.5f, 9.238f)
                close()
                moveTo(14.5f, 14.0f)
                lineTo(14.5f, 10.207f)
                lineTo(7.207f, 17.5f)
                lineTo(11.0f, 17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.5f, 14.0f)
                close()
                moveTo(20.5f, 9.238f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -1.088f, -0.583f)
                lineToRelative(-3.912f, 2.6f)
                verticalLineToRelative(1.488f)
                lineToRelative(3.913f, 2.6f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 1.087f, -0.583f)
                close()
            }
        }
        .build()
        return `_video-slash`!!
    }

private var `_video-slash`: ImageVector? = null
