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

public val UnselectedIcons.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.283f, 3.888f)
                arcTo(2.446f, 2.446f, 0.0f, false, false, 17.877f, 3.8f)
                lineTo(15.666f, 4.934f)
                arcToRelative(1.459f, 1.459f, 0.0f, false, true, -1.332f, 0.0f)
                lineTo(10.123f, 2.772f)
                arcTo(2.457f, 2.457f, 0.0f, false, false, 9.012f, 2.5f)
                lineTo(9.0f, 2.5f)
                lineToRelative(-0.012f, 0.0f)
                arcToRelative(2.457f, 2.457f, 0.0f, false, false, -1.111f, 0.27f)
                lineTo(4.43f, 4.542f)
                arcToRelative(3.571f, 3.571f, 0.0f, false, false, -1.93f, 3.2f)
                lineTo(2.5f, 17.919f)
                arcToRelative(2.544f, 2.544f, 0.0f, false, false, 1.217f, 2.192f)
                arcToRelative(2.444f, 2.444f, 0.0f, false, false, 2.406f, 0.09f)
                lineToRelative(2.211f, -1.135f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, true, 1.332f, 0.0f)
                lineToRelative(4.211f, 2.162f)
                arcToRelative(2.444f, 2.444f, 0.0f, false, false, 1.106f, 0.268f)
                curveToRelative(0.006f, 0.0f, 0.011f, 0.0f, 0.017f, 0.0f)
                reflectiveCurveToRelative(0.011f, 0.0f, 0.017f, 0.0f)
                arcToRelative(2.444f, 2.444f, 0.0f, false, false, 1.106f, -0.268f)
                lineToRelative(3.447f, -1.77f)
                arcToRelative(3.572f, 3.572f, 0.0f, false, false, 1.93f, -3.2f)
                lineTo(21.5f, 6.08f)
                arcTo(2.547f, 2.547f, 0.0f, false, false, 20.283f, 3.888f)
                close()
                moveTo(7.877f, 18.176f)
                lineTo(5.666f, 19.311f)
                arcToRelative(1.428f, 1.428f, 0.0f, false, true, -1.427f, -0.053f)
                arcTo(1.552f, 1.552f, 0.0f, false, true, 3.5f, 17.919f)
                lineTo(3.5f, 7.742f)
                arcTo(2.576f, 2.576f, 0.0f, false, true, 4.887f, 5.431f)
                lineToRelative(3.447f, -1.77f)
                arcTo(1.437f, 1.437f, 0.0f, false, true, 8.5f, 3.6f)
                lineTo(8.5f, 17.964f)
                arcTo(2.428f, 2.428f, 0.0f, false, false, 7.877f, 18.176f)
                close()
                moveTo(10.123f, 18.176f)
                arcToRelative(2.428f, 2.428f, 0.0f, false, false, -0.623f, -0.212f)
                lineTo(9.5f, 3.6f)
                arcToRelative(1.437f, 1.437f, 0.0f, false, true, 0.166f, 0.061f)
                lineToRelative(4.211f, 2.162f)
                arcToRelative(2.43f, 2.43f, 0.0f, false, false, 0.623f, 0.213f)
                lineTo(14.5f, 20.4f)
                arcToRelative(1.437f, 1.437f, 0.0f, false, true, -0.166f, -0.061f)
                close()
                moveTo(20.5f, 16.258f)
                arcToRelative(2.575f, 2.575f, 0.0f, false, true, -1.387f, 2.31f)
                lineToRelative(-3.447f, 1.77f)
                arcToRelative(1.657f, 1.657f, 0.0f, false, true, -0.166f, 0.062f)
                lineTo(15.5f, 6.036f)
                arcToRelative(2.43f, 2.43f, 0.0f, false, false, 0.623f, -0.213f)
                lineToRelative(2.211f, -1.135f)
                arcToRelative(1.428f, 1.428f, 0.0f, false, true, 1.427f, 0.054f)
                arcTo(1.55f, 1.55f, 0.0f, false, true, 20.5f, 6.08f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
