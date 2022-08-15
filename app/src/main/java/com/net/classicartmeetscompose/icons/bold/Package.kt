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

public val HomeIcon.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = Builder(name = "Package", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.918f, 4.481f)
                lineToRelative(-4.4f, -1.954f)
                arcToRelative(6.314f, 6.314f, 0.0f, false, false, -5.038f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-4.4f, 1.954f)
                arcTo(5.008f, 5.008f, 0.0f, false, false, 2.0f, 8.973f)
                verticalLineToRelative(6.049f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 3.082f, 4.492f)
                lineToRelative(4.4f, 1.955f)
                arcToRelative(6.221f, 6.221f, 0.0f, false, false, 2.492f, 0.523f)
                arcToRelative(0.059f, 0.059f, 0.0f, false, false, 0.052f, 0.0f)
                arcToRelative(6.226f, 6.226f, 0.0f, false, false, 2.493f, -0.523f)
                lineToRelative(4.4f, -1.955f)
                arcTo(5.008f, 5.008f, 0.0f, false, false, 22.0f, 15.022f)
                lineTo(22.0f, 8.973f)
                arcTo(5.008f, 5.008f, 0.0f, false, false, 18.918f, 4.481f)
                close()
                moveTo(13.707f, 4.355f)
                lineTo(18.107f, 6.309f)
                arcToRelative(3.753f, 3.753f, 0.0f, false, true, 0.394f, 0.205f)
                lineToRelative(-2.0f, 0.89f)
                lineTo(9.963f, 4.5f)
                lineToRelative(0.329f, -0.146f)
                arcTo(4.27f, 4.27f, 0.0f, false, true, 13.707f, 4.355f)
                close()
                moveTo(7.5f, 5.6f)
                lineToRelative(6.535f, 2.9f)
                lineToRelative(-0.934f, 0.415f)
                arcToRelative(2.868f, 2.868f, 0.0f, false, true, -2.2f, 0.0f)
                lineToRelative(-5.4f, -2.4f)
                arcTo(3.77f, 3.77f, 0.0f, false, true, 5.9f, 6.309f)
                close()
                moveTo(5.894f, 17.686f)
                arcTo(2.973f, 2.973f, 0.0f, false, true, 4.0f, 15.022f)
                lineTo(4.0f, 8.973f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 0.153f, -0.868f)
                lineToRelative(5.933f, 2.637f)
                arcToRelative(4.511f, 4.511f, 0.0f, false, false, 0.914f, 0.291f)
                verticalLineToRelative(8.834f)
                arcToRelative(4.118f, 4.118f, 0.0f, false, true, -0.706f, -0.226f)
                close()
                moveTo(20.0f, 15.022f)
                arcToRelative(2.973f, 2.973f, 0.0f, false, true, -1.895f, 2.664f)
                lineToRelative(-4.4f, 1.955f)
                arcToRelative(4.157f, 4.157f, 0.0f, false, true, -0.707f, 0.226f)
                lineTo(12.998f, 11.033f)
                arcToRelative(4.511f, 4.511f, 0.0f, false, false, 0.914f, -0.291f)
                lineToRelative(5.933f, -2.637f)
                arcTo(2.6f, 2.6f, 0.0f, false, true, 20.0f, 8.973f)
                close()
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
