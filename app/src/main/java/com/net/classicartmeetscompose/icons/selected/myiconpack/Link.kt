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

public val SelectedIcons.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.545f, 10.467f)
                lineToRelative(-1.839f, 1.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.839f, -1.84f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, false, 0.0f, -4.186f)
                arcToRelative(3.027f, 3.027f, 0.0f, false, false, -4.184f, 0.0f)
                lineToRelative(-3.36f, 3.36f)
                arcToRelative(2.046f, 2.046f, 0.0f, false, false, -0.267f, 0.316f)
                arcToRelative(2.943f, 2.943f, 0.0f, false, false, 0.268f, 3.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.415f, 1.414f)
                arcToRelative(4.915f, 4.915f, 0.0f, false, true, -0.5f, -6.42f)
                arcToRelative(3.792f, 3.792f, 0.0f, false, true, 0.5f, -0.594f)
                lineToRelative(3.36f, -3.36f)
                arcToRelative(4.959f, 4.959f, 0.0f, false, true, 7.013f, 7.014f)
                close()
                moveTo(12.413f, 10.173f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                arcToRelative(2.928f, 2.928f, 0.0f, false, true, 0.688f, 3.1f)
                arcToRelative(2.827f, 2.827f, 0.0f, false, true, -0.688f, 1.088f)
                lineToRelative(-3.36f, 3.36f)
                arcToRelative(3.027f, 3.027f, 0.0f, false, true, -4.184f, 0.0f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, true, 0.0f, -4.186f)
                lineToRelative(1.839f, -1.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-1.839f, 1.84f)
                arcToRelative(4.959f, 4.959f, 0.0f, true, false, 7.013f, 7.014f)
                lineToRelative(3.359f, -3.359f)
                arcToRelative(4.813f, 4.813f, 0.0f, false, false, 1.163f, -1.849f)
                arcToRelative(4.963f, 4.963f, 0.0f, false, false, -1.163f, -5.166f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.413f, 10.173f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
