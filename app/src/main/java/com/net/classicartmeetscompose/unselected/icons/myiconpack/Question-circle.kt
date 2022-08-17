package com.net.classicartmeetscompose.unselected.icons.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.net.classicartmeetscompose.unselected.icons.MyIconPack

public val MyIconPack.`Question-circle`: ImageVector
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
                arcTo(10.016f, 10.016f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 18.0f)
                close()
                moveTo(14.04f, 13.32f)
                curveToRelative(-0.92f, 0.61f, -1.07f, 0.94f, -1.09f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 15.0f)
                arcToRelative(1.185f, 1.185f, 0.0f, false, true, -0.32f, -0.05f)
                arcToRelative(1.015f, 1.015f, 0.0f, false, true, -0.63f, -1.27f)
                arcToRelative(4.585f, 4.585f, 0.0f, false, true, 1.88f, -2.03f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, 1.04f, -2.02f)
                arcToRelative(2.029f, 2.029f, 0.0f, false, false, -1.6f, -1.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(3.982f, 3.982f, 0.0f, false, true, 9.43f, 6.94f)
                arcToRelative(3.995f, 3.995f, 0.0f, false, true, 6.51f, 2.34f)
                arcTo(3.906f, 3.906f, 0.0f, false, true, 14.04f, 13.32f)
                close()
            }
        }
        .build()
        return `_question-circle`!!
    }

private var `_question-circle`: ImageVector? = null
