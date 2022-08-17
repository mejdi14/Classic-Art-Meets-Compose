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

public val UnselectedIcons.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(
            name = "Comments",
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
                moveTo(18.0f, 7.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(17.5f, 6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.0f, 2.5f)
                lineTo(6.0f, 2.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.5f, 6.0f)
                lineTo(2.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.857f, 0.35f)
                lineTo(5.17f, 14.5f)
                lineTo(6.5f, 14.5f)
                lineTo(6.5f, 16.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 10.0f, 19.5f)
                horizontalLineToRelative(8.83f)
                lineToRelative(1.813f, 1.85f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 21.5f, 21.0f)
                lineTo(21.5f, 11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.0f, 7.5f)
                close()
                moveTo(4.96f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.357f, 0.15f)
                lineTo(3.5f, 14.775f)
                lineTo(3.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 3.5f)
                horizontalLineToRelative(8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 6.0f)
                verticalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 13.5f)
                close()
                moveTo(20.5f, 19.775f)
                lineTo(19.4f, 18.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.357f, -0.15f)
                lineTo(10.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.5f, 16.0f)
                lineTo(7.5f, 14.5f)
                lineTo(14.0f, 14.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.5f, 11.0f)
                lineTo(17.5f, 8.5f)
                lineTo(18.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 20.5f, 11.0f)
                close()
            }
        }
            .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
