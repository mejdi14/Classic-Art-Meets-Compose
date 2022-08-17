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

public val SelectedIcons.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(
            name = "Upload",
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
                moveTo(17.0f, 10.48f)
                lineTo(14.52f, 10.48f)
                verticalLineToRelative(0.53f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                verticalLineToRelative(-0.53f)
                lineTo(7.0f, 10.48f)
                arcToRelative(4.507f, 4.507f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(1.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 7.0f, 20.48f)
                lineTo(17.0f, 20.48f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.5f, -4.5f)
                verticalLineToRelative(-1.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 17.0f, 10.48f)
                close()
                moveTo(17.0f, 16.23f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 1.26f, -1.25f)
                arcTo(1.242f, 1.242f, 0.0f, false, true, 17.0f, 16.23f)
                close()
                moveTo(15.73f, 7.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.41f, 0.0f)
                lineToRelative(-1.3f, -1.3f)
                verticalLineToRelative(4.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(11.02f, 6.42f)
                lineTo(9.73f, 7.72f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.32f, 6.3f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                lineToRelative(3.0f, 3.0f)
                arcTo(1.008f, 1.008f, 0.0f, false, true, 15.73f, 7.72f)
                close()
            }
        }
            .build()
        return _upload!!
    }

private var _upload: ImageVector? = null
