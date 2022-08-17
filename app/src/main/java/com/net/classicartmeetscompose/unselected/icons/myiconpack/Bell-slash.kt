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

public val MyIconPack.`Bell-slash`: ImageVector
    get() {
        if (`_bell-slash` != null) {
            return `_bell-slash`!!
        }
        `_bell-slash` = Builder(name = "Bell-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                close()
                moveTo(4.52f, 15.98f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.354f, -0.146f)
                lineToRelative(11.2f, -11.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.045f, -0.747f)
                arcTo(6.512f, 6.512f, 0.0f, false, false, 5.5f, 8.99f)
                verticalLineToRelative(2.63f)
                arcToRelative(4.492f, 4.492f, 0.0f, false, true, -0.639f, 2.315f)
                lineToRelative(-0.77f, 1.29f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.429f, 0.755f)
                close()
                moveTo(20.707f, 3.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-16.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineTo(6.914f, 18.5f)
                horizontalLineTo(18.7f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.539f, -2.727f)
                lineToRelative(-1.1f, -1.84f)
                arcTo(4.491f, 4.491f, 0.0f, false, true, 18.5f, 11.62f)
                verticalLineTo(8.99f)
                arcToRelative(6.446f, 6.446f, 0.0f, false, false, -0.265f, -1.811f)
                lineToRelative(2.472f, -2.472f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.707f, 3.293f)
                close()
            }
        }
        .build()
        return `_bell-slash`!!
    }

private var `_bell-slash`: ImageVector? = null
