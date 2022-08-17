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

public val UnselectedIcons.`Microphone-slash`: ImageVector
    get() {
        if (`_microphone-slash` != null) {
            return `_microphone-slash`!!
        }
        `_microphone-slash` = Builder(name = "Microphone-slash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 16.5f, 11.0f)
                lineTo(16.5f, 8.207f)
                lineToRelative(3.854f, -3.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.707f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-12.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, 0.707f)
                lineToRelative(3.287f, -3.287f)
                arcTo(7.427f, 7.427f, 0.0f, false, false, 11.5f, 18.457f)
                lineTo(11.5f, 20.5f)
                lineTo(8.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(12.5f, 20.5f)
                lineTo(12.5f, 18.474f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 19.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                arcTo(6.462f, 6.462f, 0.0f, false, true, 8.357f, 16.349f)
                lineTo(9.8f, 14.906f)
                arcTo(4.465f, 4.465f, 0.0f, false, false, 12.0f, 15.5f)
                close()
                moveTo(15.5f, 11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 14.5f)
                arcToRelative(3.445f, 3.445f, 0.0f, false, true, -1.462f, -0.331f)
                lineTo(15.5f, 9.207f)
                close()
                moveTo(7.61f, 12.0f)
                arcToRelative(4.922f, 4.922f, 0.0f, false, true, -0.11f, -1.0f)
                lineTo(7.5f, 7.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 8.191f, -2.565f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.822f, 0.57f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 7.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.877f, 3.877f, 0.0f, false, false, 0.09f, 0.8f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.388f, 0.591f)
                arcToRelative(0.521f, 0.521f, 0.0f, false, true, -0.1f, 0.011f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.61f, 12.0f)
                close()
                moveTo(5.336f, 14.45f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 4.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.723f, 2.989f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.212f, 0.674f)
                arcToRelative(0.493f, 0.493f, 0.0f, false, true, -0.231f, 0.057f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.336f, 14.451f)
                close()
            }
        }
        .build()
        return `_microphone-slash`!!
    }

private var `_microphone-slash`: ImageVector? = null
