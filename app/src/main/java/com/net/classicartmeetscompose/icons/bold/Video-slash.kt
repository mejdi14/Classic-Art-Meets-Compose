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

public val HomeIcon.`Video-slash`: ImageVector
    get() {
        if (`_video-slash` != null) {
            return `_video-slash`!!
        }
        `_video-slash` = Builder(name = "Video-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.721f, 17.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.823f, -0.43f)
                arcTo(4.993f, 4.993f, 0.0f, false, true, 2.0f, 14.0f)
                lineTo(2.0f, 10.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 7.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, true, 2.849f, 0.9f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 12.71f, 7.542f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.542f, 1.711f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.821f, 1.569f)
                close()
                moveTo(22.0f, 9.238f)
                verticalLineToRelative(5.524f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -3.418f, 1.832f)
                lineToRelative(-2.665f, -1.771f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 11.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                arcToRelative(4.778f, 4.778f, 0.0f, false, true, -0.553f, -0.033f)
                lineToRelative(-1.74f, 1.74f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                lineTo(16.87f, 8.544f)
                lineToRelative(1.712f, -1.138f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 22.0f, 9.238f)
                close()
                moveTo(14.0f, 14.0f)
                lineTo(14.0f, 11.414f)
                lineTo(8.414f, 17.0f)
                lineTo(11.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 14.0f)
                close()
                moveTo(20.0f, 9.238f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.311f, -0.166f)
                lineTo(16.0f, 11.524f)
                verticalLineToRelative(0.952f)
                lineToRelative(3.689f, 2.452f)
                arcTo(0.2f, 0.2f, 0.0f, false, false, 20.0f, 14.762f)
                close()
            }
        }
        .build()
        return `_video-slash`!!
    }

private var `_video-slash`: ImageVector? = null
