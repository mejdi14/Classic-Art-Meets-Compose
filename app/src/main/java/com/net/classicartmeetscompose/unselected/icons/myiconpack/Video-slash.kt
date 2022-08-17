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

public val MyIconPack.`Video-slash`: ImageVector
    get() {
        if (`_video-slash` != null) {
            return `_video-slash`!!
        }
        `_video-slash` = Builder(name = "Video-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.134f, 16.579f)
                arcTo(4.451f, 4.451f, 0.0f, false, true, 2.312f, 14.0f)
                verticalLineTo(10.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, 4.5f, -4.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(4.278f, 4.278f, 0.0f, false, true, 1.867f, 0.42f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.137f, 0.8f)
                lineTo(3.9f, 16.644f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, true, -0.354f, 0.146f)
                lineToRelative(-0.042f, 0.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.134f, 16.579f)
                close()
                moveTo(20.853f, 7.85f)
                arcToRelative(1.561f, 1.561f, 0.0f, false, false, -1.608f, 0.078f)
                lineToRelative(-1.141f, 0.76f)
                arcTo(0.377f, 0.377f, 0.0f, false, false, 17.937f, 9.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, false, 0.167f, 0.312f)
                lineToRelative(1.14f, 0.759f)
                arcToRelative(1.572f, 1.572f, 0.0f, false, false, 2.443f, -1.311f)
                verticalLineTo(9.24f)
                arcTo(1.57f, 1.57f, 0.0f, false, false, 20.853f, 7.85f)
                close()
                moveTo(20.52f, 4.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.415f, -1.414f)
                lineToRelative(-16.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.52f, 20.707f)
                lineToRelative(2.215f, -2.216f)
                curveToRelative(0.028f, 0.0f, 0.05f, 0.009f, 0.077f, 0.009f)
                horizontalLineToRelative(5.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.5f, -4.5f)
                verticalLineTo(10.0f)
                arcToRelative(4.507f, 4.507f, 0.0f, false, false, -0.108f, -0.977f)
                close()
            }
        }
        .build()
        return `_video-slash`!!
    }

private var `_video-slash`: ImageVector? = null
