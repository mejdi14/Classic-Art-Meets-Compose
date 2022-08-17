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

public val SelectedIcons.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.424f, 8.669f)
                arcTo(9.936f, 9.936f, 0.0f, false, false, 13.431f, 2.1f)
                arcToRelative(10.322f, 10.322f, 0.0f, false, false, -2.863f, 0.0f)
                arcTo(9.93f, 9.93f, 0.0f, false, false, 2.58f, 8.66f)
                arcToRelative(9.913f, 9.913f, 0.0f, false, false, 0.0f, 6.671f)
                arcTo(9.936f, 9.936f, 0.0f, false, false, 10.569f, 21.9f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, false, 2.863f, 0.0f)
                arcToRelative(9.93f, 9.93f, 0.0f, false, false, 7.988f, -6.56f)
                arcToRelative(9.913f, 9.913f, 0.0f, false, false, 0.0f, -6.671f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(7.832f, 7.832f, 0.0f, false, true, -0.257f, 2.0f)
                lineTo(16.865f, 14.0f)
                arcTo(16.728f, 16.728f, 0.0f, false, false, 17.0f, 12.0f)
                arcToRelative(16.667f, 16.667f, 0.0f, false, false, -0.135f, -2.0f)
                horizontalLineToRelative(2.879f)
                arcTo(7.838f, 7.838f, 0.0f, false, true, 20.0f, 12.0f)
                close()
                moveTo(9.154f, 14.0f)
                arcTo(14.556f, 14.556f, 0.0f, false, true, 9.0f, 12.0f)
                arcToRelative(14.576f, 14.576f, 0.0f, false, true, 0.154f, -2.0f)
                horizontalLineToRelative(5.692f)
                arcTo(14.527f, 14.527f, 0.0f, false, true, 15.0f, 12.0f)
                arcToRelative(14.764f, 14.764f, 0.0f, false, true, -0.154f, 2.0f)
                close()
                moveTo(4.254f, 14.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 0.0f, -4.0f)
                lineTo(7.135f, 10.0f)
                arcTo(16.7f, 16.7f, 0.0f, false, false, 7.0f, 12.0f)
                arcToRelative(16.686f, 16.686f, 0.0f, false, false, 0.135f, 2.0f)
                close()
                moveTo(18.909f, 8.0f)
                lineTo(16.5f, 8.0f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, -1.146f, -3.266f)
                arcTo(7.906f, 7.906f, 0.0f, false, true, 18.909f, 8.0f)
                close()
                moveTo(12.7f, 4.049f)
                arcTo(14.566f, 14.566f, 0.0f, false, true, 14.445f, 8.0f)
                lineTo(9.555f, 8.0f)
                arcTo(14.555f, 14.555f, 0.0f, false, true, 11.3f, 4.049f)
                curveToRelative(0.233f, -0.02f, 0.464f, -0.049f, 0.7f, -0.049f)
                reflectiveCurveTo(12.469f, 4.029f, 12.7f, 4.049f)
                close()
                moveTo(8.647f, 4.734f)
                arcTo(16.479f, 16.479f, 0.0f, false, false, 7.5f, 8.0f)
                lineTo(5.089f, 8.0f)
                arcTo(7.916f, 7.916f, 0.0f, false, true, 8.649f, 4.734f)
                close()
                moveTo(5.092f, 16.0f)
                lineTo(7.5f, 16.0f)
                arcToRelative(16.423f, 16.423f, 0.0f, false, false, 1.147f, 3.264f)
                arcTo(7.907f, 7.907f, 0.0f, false, true, 5.092f, 16.0f)
                close()
                moveTo(11.297f, 19.95f)
                arcTo(14.575f, 14.575f, 0.0f, false, true, 9.556f, 16.0f)
                horizontalLineToRelative(4.889f)
                arcToRelative(14.591f, 14.591f, 0.0f, false, true, -1.743f, 3.95f)
                arcTo(8.451f, 8.451f, 0.0f, false, true, 11.3f, 19.951f)
                close()
                moveTo(15.352f, 19.265f)
                arcTo(16.432f, 16.432f, 0.0f, false, false, 16.5f, 16.0f)
                horizontalLineToRelative(2.411f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 15.352f, 19.266f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
