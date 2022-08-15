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

public val HomeIcon.`Volume-up`: ImageVector
    get() {
        if (`_volume-up` != null) {
            return `_volume-up`!!
        }
        `_volume-up` = Builder(name = "Volume-up", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.96f, 3.324f)
                arcToRelative(3.461f, 3.461f, 0.0f, false, false, -3.736f, 0.524f)
                lineTo(5.631f, 6.073f)
                horizontalLineToRelative(-0.74f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 2.0f, 8.975f)
                verticalLineToRelative(6.05f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 2.892f, 2.9f)
                horizontalLineToRelative(0.737f)
                lineToRelative(2.6f, 2.225f)
                arcTo(3.464f, 3.464f, 0.0f, false, false, 10.489f, 21.0f)
                arcToRelative(3.509f, 3.509f, 0.0f, false, false, 1.471f, -0.326f)
                arcTo(3.468f, 3.468f, 0.0f, false, false, 14.0f, 17.489f)
                lineTo(14.0f, 6.511f)
                arcTo(3.471f, 3.471f, 0.0f, false, false, 11.96f, 3.324f)
                close()
                moveTo(12.0f, 17.489f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.475f, 1.146f)
                lineTo(6.932f, 16.409f)
                arcToRelative(2.006f, 2.006f, 0.0f, false, false, -1.3f, -0.482f)
                lineTo(4.895f, 15.927f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.895f, -0.9f)
                lineTo(4.0f, 8.975f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 0.895f, -0.9f)
                horizontalLineToRelative(0.741f)
                arcToRelative(2.011f, 2.011f, 0.0f, false, false, 1.3f, -0.482f)
                lineTo(9.525f, 5.365f)
                arcTo(1.483f, 1.483f, 0.0f, false, true, 10.49f, 5.0f)
                arcToRelative(1.511f, 1.511f, 0.0f, false, true, 0.635f, 0.143f)
                arcTo(1.471f, 1.471f, 0.0f, false, true, 12.0f, 6.511f)
                close()
                moveTo(18.0f, 12.0f)
                arcToRelative(5.912f, 5.912f, 0.0f, false, true, -1.2f, 3.6f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 15.2f, 14.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -4.792f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 16.8f, 8.4f)
                arcTo(5.912f, 5.912f, 0.0f, false, true, 18.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(9.956f, 9.956f, 0.0f, false, true, -2.557f, 6.669f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.486f, -1.338f)
                arcToRelative(7.977f, 7.977f, 0.0f, false, false, 0.0f, -10.662f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.486f, -1.338f)
                arcTo(9.956f, 9.956f, 0.0f, false, true, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_volume-up`!!
    }

private var `_volume-up`: ImageVector? = null
