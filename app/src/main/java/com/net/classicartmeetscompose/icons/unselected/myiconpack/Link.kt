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

public val UnselectedIcons.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(
            name = "Link",
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
                moveTo(20.191f, 10.113f)
                lineToRelative(-1.839f, 1.84f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, -0.707f)
                lineToRelative(1.839f, -1.84f)
                arcToRelative(3.464f, 3.464f, 0.0f, false, false, 0.0f, -4.893f)
                arcToRelative(3.541f, 3.541f, 0.0f, false, false, -4.891f, 0.0f)
                lineToRelative(-3.359f, 3.36f)
                arcToRelative(2.549f, 2.549f, 0.0f, false, false, -0.334f, 0.4f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, false, 0.334f, 4.495f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, 0.707f)
                arcToRelative(4.415f, 4.415f, 0.0f, false, true, -0.449f, -5.77f)
                arcToRelative(3.389f, 3.389f, 0.0f, false, true, 0.449f, -0.537f)
                lineToRelative(3.359f, -3.36f)
                arcToRelative(4.459f, 4.459f, 0.0f, false, true, 6.305f, 6.307f)
                close()
                moveTo(12.766f, 10.526f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                arcToRelative(3.418f, 3.418f, 0.0f, false, true, 0.809f, 3.609f)
                arcToRelative(3.319f, 3.319f, 0.0f, false, true, -0.809f, 1.284f)
                lineToRelative(-3.359f, 3.36f)
                arcToRelative(3.539f, 3.539f, 0.0f, false, true, -4.891f, 0.0f)
                arcToRelative(3.463f, 3.463f, 0.0f, false, true, 0.0f, -4.892f)
                lineToRelative(1.839f, -1.841f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, -0.707f)
                lineToRelative(-1.839f, 1.84f)
                arcToRelative(4.459f, 4.459f, 0.0f, true, false, 6.305f, 6.307f)
                lineToRelative(3.359f, -3.36f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 1.047f, -1.664f)
                arcToRelative(4.461f, 4.461f, 0.0f, false, false, -1.047f, -4.643f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 12.766f, 10.526f)
                close()
            }
        }
            .build()
        return _link!!
    }

private var _link: ImageVector? = null
