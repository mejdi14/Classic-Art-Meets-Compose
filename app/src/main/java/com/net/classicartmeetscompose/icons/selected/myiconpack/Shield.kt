package com.net.classicartmeetscompose.icons.selected.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.icons.selected.SelectedIcons

public val SelectedIcons.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(
            name = "Shield",
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
                moveTo(20.5f, 7.0f)
                curveToRelative(0.0f, 8.361f, -1.207f, 12.436f, -8.362f, 14.48f)
                arcToRelative(0.479f, 0.479f, 0.0f, false, true, -0.274f, 0.0f)
                curveTo(4.708f, 19.437f, 3.5f, 15.4f, 3.5f, 7.132f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.364f, -0.482f)
                arcToRelative(20.227f, 20.227f, 0.0f, false, false, 7.8f, -4.005f)
                arcTo(0.435f, 0.435f, 0.0f, false, true, 12.02f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.352f, 0.149f)
                curveToRelative(0.931f, 0.945f, 4.86f, 2.9f, 7.786f, 3.876f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 20.5f, 7.0f)
                close()
            }
        }
            .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
