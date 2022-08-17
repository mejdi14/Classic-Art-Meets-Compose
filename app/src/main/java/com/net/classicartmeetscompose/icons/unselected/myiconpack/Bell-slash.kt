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

public val UnselectedIcons.`Bell-slash`: ImageVector
    get() {
        if (`_bell-slash` != null) {
            return `_bell-slash`!!
        }
        `_bell-slash` = Builder(name = "Bell-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.138f, 13.932f)
                arcTo(4.485f, 4.485f, 0.0f, false, true, 18.5f, 11.62f)
                lineTo(18.5f, 8.99f)
                arcToRelative(6.421f, 6.421f, 0.0f, false, false, -0.446f, -2.338f)
                lineToRelative(2.3f, -2.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.707f)
                lineToRelative(-14.0f, 14.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, 0.707f)
                lineTo(6.207f, 18.5f)
                lineTo(9.566f, 18.5f)
                arcTo(2.474f, 2.474f, 0.0f, false, false, 9.5f, 19.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(2.474f, 2.474f, 0.0f, false, false, -0.066f, -0.5f)
                lineTo(18.7f, 18.5f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.539f, -2.727f)
                close()
                moveTo(13.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.9f, -0.5f)
                lineTo(13.4f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 19.0f)
                close()
                moveTo(19.392f, 17.1f)
                arcToRelative(0.786f, 0.786f, 0.0f, false, true, -0.692f, 0.4f)
                lineTo(7.207f, 17.5f)
                lineTo(17.27f, 7.437f)
                arcTo(5.431f, 5.431f, 0.0f, false, true, 17.5f, 8.99f)
                verticalLineToRelative(2.63f)
                arcToRelative(5.486f, 5.486f, 0.0f, false, false, 0.781f, 2.827f)
                lineToRelative(1.1f, 1.839f)
                arcTo(0.8f, 0.8f, 0.0f, false, true, 19.392f, 17.1f)
                close()
                moveTo(4.092f, 15.226f)
                lineTo(4.862f, 13.936f)
                arcTo(4.48f, 4.48f, 0.0f, false, false, 5.5f, 11.62f)
                lineTo(5.5f, 8.99f)
                arcToRelative(6.513f, 6.513f, 0.0f, false, true, 10.529f, -5.1f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.617f, 0.787f)
                arcTo(5.513f, 5.513f, 0.0f, false, false, 6.5f, 8.99f)
                verticalLineToRelative(2.63f)
                arcToRelative(5.478f, 5.478f, 0.0f, false, true, -0.782f, 2.828f)
                lineToRelative(-0.769f, 1.288f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.858f, -0.513f)
                close()
            }
        }
        .build()
        return `_bell-slash`!!
    }

private var `_bell-slash`: ImageVector? = null
