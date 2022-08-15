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

public val HomeIcon.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.542f, 3.461f)
                arcToRelative(2.939f, 2.939f, 0.0f, false, false, -2.893f, -0.107f)
                lineTo(15.438f, 4.489f)
                arcToRelative(0.948f, 0.948f, 0.0f, false, true, -0.876f, 0.0f)
                lineTo(10.351f, 2.327f)
                arcTo(2.956f, 2.956f, 0.0f, false, false, 9.019f, 2.0f)
                curveTo(9.012f, 2.0f, 9.007f, 2.0f, 9.0f, 2.0f)
                reflectiveCurveToRelative(-0.012f, 0.0f, -0.019f, 0.0f)
                arcToRelative(2.964f, 2.964f, 0.0f, false, false, -1.333f, 0.323f)
                lineTo(4.2f, 4.1f)
                arcTo(4.068f, 4.068f, 0.0f, false, false, 2.0f, 7.742f)
                lineTo(2.0f, 17.919f)
                arcToRelative(3.043f, 3.043f, 0.0f, false, false, 1.458f, 2.62f)
                arcToRelative(2.938f, 2.938f, 0.0f, false, false, 2.893f, 0.107f)
                lineToRelative(2.211f, -1.135f)
                arcToRelative(0.948f, 0.948f, 0.0f, false, true, 0.876f, 0.0f)
                lineToRelative(4.211f, 2.162f)
                arcTo(2.961f, 2.961f, 0.0f, false, false, 14.988f, 22.0f)
                lineTo(15.0f, 22.0f)
                lineToRelative(0.012f, 0.0f)
                arcToRelative(2.961f, 2.961f, 0.0f, false, false, 1.339f, -0.325f)
                horizontalLineToRelative(0.0f)
                lineTo(19.8f, 19.9f)
                arcTo(4.068f, 4.068f, 0.0f, false, false, 22.0f, 16.258f)
                lineTo(22.0f, 6.081f)
                arcTo(3.043f, 3.043f, 0.0f, false, false, 20.542f, 3.461f)
                close()
                moveTo(5.437f, 18.866f)
                arcToRelative(0.943f, 0.943f, 0.0f, false, true, -0.937f, -0.034f)
                arcToRelative(1.056f, 1.056f, 0.0f, false, true, -0.5f, -0.913f)
                lineTo(4.0f, 7.742f)
                arcTo(2.074f, 2.074f, 0.0f, false, true, 5.115f, 5.877f)
                lineTo(8.0f, 4.395f)
                lineTo(8.0f, 17.6f)
                arcToRelative(2.952f, 2.952f, 0.0f, false, false, -0.351f, 0.129f)
                close()
                moveTo(10.351f, 17.731f)
                arcTo(2.952f, 2.952f, 0.0f, false, false, 10.0f, 17.6f)
                lineTo(10.0f, 4.395f)
                lineToRelative(3.649f, 1.874f)
                arcTo(2.952f, 2.952f, 0.0f, false, false, 14.0f, 6.4f)
                lineTo(14.0f, 19.605f)
                close()
                moveTo(20.0f, 16.258f)
                arcToRelative(2.074f, 2.074f, 0.0f, false, true, -1.115f, 1.865f)
                lineTo(16.0f, 19.605f)
                lineTo(16.0f, 6.4f)
                arcToRelative(2.952f, 2.952f, 0.0f, false, false, 0.351f, -0.129f)
                lineToRelative(2.211f, -1.135f)
                arcToRelative(0.943f, 0.943f, 0.0f, false, true, 0.938f, 0.034f)
                arcToRelative(1.056f, 1.056f, 0.0f, false, true, 0.5f, 0.913f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
