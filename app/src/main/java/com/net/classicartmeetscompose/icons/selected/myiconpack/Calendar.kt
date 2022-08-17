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

public val SelectedIcons.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(
            name = "Calendar",
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
                moveTo(21.5f, 7.94f)
                arcTo(4.766f, 4.766f, 0.0f, false, false, 17.0f, 3.2f)
                lineTo(17.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(0.17f)
                lineTo(9.0f, 3.17f)
                lineTo(9.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 3.0f)
                verticalLineToRelative(0.2f)
                arcTo(4.766f, 4.766f, 0.0f, false, false, 2.5f, 7.94f)
                lineTo(2.5f, 9.83f)
                arcToRelative(0.292f, 0.292f, 0.0f, false, false, 0.02f, 0.09f)
                arcTo(0.188f, 0.188f, 0.0f, false, false, 2.5f, 10.0f)
                verticalLineToRelative(7.0f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 7.0f, 21.5f)
                lineTo(17.0f, 21.5f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 21.5f, 17.0f)
                lineTo(21.5f, 10.0f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, false, -0.02f, -0.08f)
                arcToRelative(0.292f, 0.292f, 0.0f, false, false, 0.02f, -0.09f)
                close()
                moveTo(8.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 18.0f)
                close()
                moveTo(8.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 14.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 14.0f)
                close()
                moveTo(16.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 18.0f)
                close()
                moveTo(16.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 14.0f)
                close()
                moveTo(19.5f, 9.5f)
                lineTo(4.5f, 9.5f)
                lineTo(4.5f, 7.94f)
                arcTo(2.766f, 2.766f, 0.0f, false, true, 7.04f, 5.19f)
                arcTo(0.985f, 0.985f, 0.0f, false, false, 8.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.97f, -0.83f)
                horizontalLineToRelative(6.06f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 6.0f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, false, 0.96f, -0.81f)
                arcTo(2.773f, 2.773f, 0.0f, false, true, 19.5f, 7.94f)
                close()
            }
        }
            .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
