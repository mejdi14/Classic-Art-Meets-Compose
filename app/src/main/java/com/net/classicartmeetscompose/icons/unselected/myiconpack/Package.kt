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

public val UnselectedIcons.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = Builder(
            name = "Package",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF41416e)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.715f, 4.938f)
                lineToRelative(-4.4f, -1.953f)
                arcToRelative(5.786f, 5.786f, 0.0f, false, false, -4.632f, 0.0f)
                lineToRelative(-4.4f, 1.953f)
                arcTo(4.453f, 4.453f, 0.0f, false, false, 2.5f, 8.974f)
                verticalLineToRelative(6.049f)
                arcToRelative(4.453f, 4.453f, 0.0f, false, false, 2.785f, 4.036f)
                lineToRelative(4.4f, 1.954f)
                arcToRelative(5.729f, 5.729f, 0.0f, false, false, 2.3f, 0.482f)
                curveToRelative(0.006f, 0.0f, 0.012f, 0.0f, 0.019f, 0.0f)
                reflectiveCurveToRelative(0.013f, 0.0f, 0.019f, 0.0f)
                arcToRelative(5.729f, 5.729f, 0.0f, false, false, 2.3f, -0.482f)
                lineToRelative(4.4f, -1.954f)
                arcTo(4.453f, 4.453f, 0.0f, false, false, 21.5f, 15.023f)
                lineTo(21.5f, 8.974f)
                arcTo(4.453f, 4.453f, 0.0f, false, false, 18.715f, 4.938f)
                close()
                moveTo(10.09f, 3.9f)
                arcToRelative(4.771f, 4.771f, 0.0f, false, true, 3.82f, 0.0f)
                lineToRelative(4.4f, 1.954f)
                arcToRelative(4.019f, 4.019f, 0.0f, false, true, 1.156f, 0.78f)
                lineTo(16.5f, 7.952f)
                lineTo(8.732f, 4.5f)
                close()
                moveTo(5.69f, 5.854f)
                lineTo(7.499f, 5.054f)
                lineTo(15.267f, 8.5f)
                lineTo(13.3f, 9.372f)
                arcToRelative(3.379f, 3.379f, 0.0f, false, true, -2.608f, 0.0f)
                lineTo(4.535f, 6.633f)
                arcTo(4.019f, 4.019f, 0.0f, false, true, 5.691f, 5.853f)
                close()
                moveTo(5.69f, 18.146f)
                arcTo(3.468f, 3.468f, 0.0f, false, true, 3.5f, 15.023f)
                lineTo(3.5f, 8.974f)
                arcToRelative(3.144f, 3.144f, 0.0f, false, true, 0.4f, -1.526f)
                lineToRelative(6.385f, 2.838f)
                arcToRelative(4.174f, 4.174f, 0.0f, false, false, 1.21f, 0.3f)
                verticalLineToRelative(9.858f)
                arcToRelative(4.659f, 4.659f, 0.0f, false, true, -1.409f, -0.347f)
                close()
                moveTo(20.5f, 15.023f)
                arcToRelative(3.468f, 3.468f, 0.0f, false, true, -2.191f, 3.122f)
                lineToRelative(-4.4f, 1.954f)
                arcToRelative(4.659f, 4.659f, 0.0f, false, true, -1.409f, 0.347f)
                lineTo(12.5f, 10.588f)
                arcToRelative(4.174f, 4.174f, 0.0f, false, false, 1.21f, -0.3f)
                lineTo(20.1f, 7.448f)
                arcTo(3.144f, 3.144f, 0.0f, false, true, 20.5f, 8.974f)
                close()
            }
        }
            .build()
        return _package!!
    }

private var _package: ImageVector? = null
