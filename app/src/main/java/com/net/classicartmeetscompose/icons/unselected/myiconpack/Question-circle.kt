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

public val UnselectedIcons.`Question-circle`: ImageVector
    get() {
        if (`_question-circle` != null) {
            return `_question-circle`!!
        }
        `_question-circle` = Builder(name = "Question-circle", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, true, false, 21.5f, 12.0f)
                arcTo(9.511f, 9.511f, 0.0f, false, false, 12.0f, 2.5f)
                close()
                moveTo(12.0f, 20.5f)
                arcTo(8.5f, 8.5f, 0.0f, true, true, 20.5f, 12.0f)
                arcTo(8.51f, 8.51f, 0.0f, false, true, 12.0f, 20.5f)
                close()
                moveTo(15.445f, 9.369f)
                arcToRelative(3.371f, 3.371f, 0.0f, false, true, -1.681f, 3.53f)
                curveToRelative(-0.921f, 0.611f, -1.21f, 1.023f, -1.29f, 1.26f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.947f, -0.319f)
                arcToRelative(3.873f, 3.873f, 0.0f, false, true, 1.683f, -1.774f)
                arcToRelative(2.407f, 2.407f, 0.0f, false, false, 1.25f, -2.524f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.945f, -0.631f)
                close()
                moveTo(12.75f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.75f, -0.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.75f, 17.0f)
                close()
            }
        }
        .build()
        return `_question-circle`!!
    }

private var `_question-circle`: ImageVector? = null
