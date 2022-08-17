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

public val MyIconPack.`Eye-slash`: ImageVector
    get() {
        if (`_eye-slash` != null) {
            return `_eye-slash`!!
        }
        `_eye-slash` = Builder(name = "Eye-slash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.016f, 10.241f)
                arcToRelative(14.386f, 14.386f, 0.0f, false, false, -2.646f, -3.2f)
                lineTo(20.7f, 4.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-16.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 4.7f, 20.707f)
                lineToRelative(2.535f, -2.535f)
                arcTo(9.139f, 9.139f, 0.0f, false, false, 12.0f, 19.5f)
                curveToRelative(4.83f, 0.0f, 7.72f, -3.6f, 9.02f, -5.74f)
                arcTo(3.421f, 3.421f, 0.0f, false, false, 21.016f, 10.241f)
                close()
                moveTo(12.0f, 16.5f)
                arcToRelative(4.457f, 4.457f, 0.0f, false, true, -2.385f, -0.7f)
                lineToRelative(1.473f, -1.474f)
                arcTo(2.49f, 2.49f, 0.0f, false, false, 14.5f, 12.0f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, -0.01f, -0.13f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 14.0f, 12.0f)
                arcToRelative(0.972f, 0.972f, 0.0f, false, true, -0.461f, -0.127f)
                lineTo(15.8f, 9.612f)
                arcTo(4.485f, 4.485f, 0.0f, false, true, 12.0f, 16.5f)
                close()
                moveTo(4.32f, 15.62f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, -1.33f, -1.86f)
                arcToRelative(3.444f, 3.444f, 0.0f, false, true, -0.01f, -3.52f)
                curveTo(4.276f, 8.1f, 7.176f, 4.5f, 12.0f, 4.5f)
                arcToRelative(9.307f, 9.307f, 0.0f, false, true, 2.75f, 0.41f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, 0.35f, 0.36f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, true, -0.14f, 0.47f)
                lineToRelative(-1.89f, 1.89f)
                arcTo(4.679f, 4.679f, 0.0f, false, false, 12.0f, 7.5f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 7.5f, 12.0f)
                arcToRelative(4.316f, 4.316f, 0.0f, false, false, 0.13f, 1.08f)
                lineToRelative(-2.57f, 2.57f)
                arcToRelative(0.491f, 0.491f, 0.0f, false, true, -0.36f, 0.15f)
                horizontalLineToRelative(-0.02f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.316f, 15.621f)
                close()
            }
        }
        .build()
        return `_eye-slash`!!
    }

private var `_eye-slash`: ImageVector? = null
