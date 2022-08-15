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

public val HomeIcon.`Microphone-slash`: ImageVector
    get() {
        if (`_microphone-slash` != null) {
            return `_microphone-slash`!!
        }
        `_microphone-slash` = Builder(name = "Microphone-slash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(17.0f, 8.414f)
                lineToRelative(3.707f, -3.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-12.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(2.98f, -2.98f)
                arcTo(7.972f, 7.972f, 0.0f, false, false, 11.0f, 18.93f)
                lineTo(11.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(13.0f, 20.0f)
                lineTo(13.0f, 18.931f)
                arcTo(8.008f, 8.008f, 0.0f, false, false, 20.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(5.986f, 5.986f, 0.0f, false, true, -8.854f, 5.268f)
                lineToRelative(0.745f, -0.745f)
                arcTo(4.957f, 4.957f, 0.0f, false, false, 12.0f, 16.0f)
                close()
                moveTo(15.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                arcToRelative(2.865f, 2.865f, 0.0f, false, true, -0.532f, -0.054f)
                lineTo(15.0f, 10.414f)
                close()
                moveTo(7.121f, 12.1f)
                arcTo(5.437f, 5.437f, 0.0f, false, true, 7.0f, 11.0f)
                lineTo(7.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 9.1f, -2.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.644f, 1.139f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 7.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.453f, 3.453f, 0.0f, false, false, 0.079f, 0.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.3f, 12.88f)
                arcToRelative(1.022f, 1.022f, 0.0f, false, true, -0.2f, 0.02f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.121f, 12.1f)
                close()
                moveTo(4.893f, 14.682f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcToRelative(5.983f, 5.983f, 0.0f, false, false, 0.667f, 2.758f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.425f, 1.348f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, true, -0.461f, 0.114f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.893f, 14.682f)
                close()
            }
        }
        .build()
        return `_microphone-slash`!!
    }

private var `_microphone-slash`: ImageVector? = null
