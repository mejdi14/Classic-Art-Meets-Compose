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

public val HomeIcon.`Question-circle`: ImageVector
    get() {
        if (`_question-circle` != null) {
            return `_question-circle`!!
        }
        `_question-circle` = Builder(name = "Question-circle", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(15.937f, 9.283f)
                arcToRelative(3.884f, 3.884f, 0.0f, false, true, -1.9f, 4.032f)
                curveToRelative(-0.925f, 0.616f, -1.073f, 0.945f, -1.093f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.895f, -0.638f)
                arcToRelative(4.541f, 4.541f, 0.0f, false, true, 1.88f, -2.032f)
                arcToRelative(1.866f, 1.866f, 0.0f, false, false, 1.035f, -2.02f)
                arcToRelative(2.025f, 2.025f, 0.0f, false, false, -1.6f, -1.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.937f, -0.717f)
                close()
                moveTo(13.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 17.0f)
                close()
            }
        }
        .build()
        return `_question-circle`!!
    }

private var `_question-circle`: ImageVector? = null
