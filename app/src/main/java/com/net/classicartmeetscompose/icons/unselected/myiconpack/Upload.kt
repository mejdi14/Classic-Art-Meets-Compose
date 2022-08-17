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

public val UnselectedIcons.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.646f, 7.354f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineTo(12.5f, 5.207f)
                verticalLineTo(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(5.207f)
                lineTo(9.354f, 7.354f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.646f, 7.354f)
                close()
                moveTo(17.0f, 10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.5f, 15.0f)
                verticalLineToRelative(1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.0f, 19.5f)
                horizontalLineTo(7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 16.0f)
                verticalLineTo(15.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 2.5f, 15.0f)
                verticalLineToRelative(1.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 7.0f, 20.5f)
                horizontalLineTo(17.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 21.5f, 16.0f)
                verticalLineTo(15.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 17.0f, 10.5f)
                close()
                moveTo(17.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 16.0f)
                close()
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null
