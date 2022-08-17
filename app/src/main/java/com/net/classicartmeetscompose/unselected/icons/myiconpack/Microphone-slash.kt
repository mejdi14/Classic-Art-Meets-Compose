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

public val MyIconPack.`Microphone-slash`: ImageVector
    get() {
        if (`_microphone-slash` != null) {
            return `_microphone-slash`!!
        }
        `_microphone-slash` = Builder(name = "Microphone-slash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.275f, 15.139f)
                lineTo(9.146f, 16.268f)
                arcTo(5.986f, 5.986f, 0.0f, false, false, 18.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcToRelative(8.008f, 8.008f, 0.0f, false, true, -7.0f, 7.931f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(18.93f)
                arcToRelative(7.972f, 7.972f, 0.0f, false, true, -3.313f, -1.2f)
                lineToRelative(-2.98f, 2.98f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                lineTo(16.5f, 8.914f)
                verticalLineTo(11.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 12.0f, 15.5f)
                arcTo(4.443f, 4.443f, 0.0f, false, true, 10.275f, 15.139f)
                close()
                moveTo(7.957f, 12.38f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, false, 0.5f, -0.126f)
                lineToRelative(7.179f, -7.181f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.058f, -0.637f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 7.5f, 7.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.932f, 4.932f, 0.0f, false, false, 0.11f, 1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 7.957f, 12.38f)
                close()
                moveTo(5.781f, 15.22f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, false, 0.461f, -0.114f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.425f, -1.348f)
                arcTo(5.983f, 5.983f, 0.0f, false, true, 6.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.893f, 3.682f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.781f, 15.22f)
                close()
            }
        }
        .build()
        return `_microphone-slash`!!
    }

private var `_microphone-slash`: ImageVector? = null
