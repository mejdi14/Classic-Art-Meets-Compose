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

public val SelectedIcons.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(
            name = "Phone",
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
                moveTo(20.489f, 20.011f)
                arcTo(4.273f, 4.273f, 0.0f, false, true, 17.248f, 21.5f)
                horizontalLineToRelative(-0.116f)
                arcTo(15.042f, 15.042f, 0.0f, false, true, 2.5f, 6.868f)
                arcTo(4.28f, 4.28f, 0.0f, false, true, 4.0f, 3.494f)
                arcToRelative(4.028f, 4.028f, 0.0f, false, true, 3.349f, -0.931f)
                arcToRelative(3.549f, 3.549f, 0.0f, false, true, 0.474f, 0.119f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, true, 1.0f, 1.191f)
                lineToRelative(0.67f, 4.254f)
                arcToRelative(1.515f, 1.515f, 0.0f, false, true, -0.541f, 1.412f)
                curveToRelative(-0.084f, 0.068f, -0.171f, 0.132f, -0.262f, 0.193f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, false, -0.215f, 0.666f)
                arcTo(9.857f, 9.857f, 0.0f, false, false, 13.6f, 15.525f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, false, 0.671f, -0.222f)
                curveToRelative(0.047f, -0.068f, 0.1f, -0.135f, 0.146f, -0.2f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, true, 1.431f, -0.547f)
                lineToRelative(4.332f, 0.721f)
                arcToRelative(1.473f, 1.473f, 0.0f, false, true, 1.186f, 1.033f)
                curveToRelative(0.027f, 0.1f, 0.052f, 0.207f, 0.074f, 0.332f)
                arcTo(4.072f, 4.072f, 0.0f, false, true, 20.489f, 20.011f)
                close()
            }
        }
            .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
