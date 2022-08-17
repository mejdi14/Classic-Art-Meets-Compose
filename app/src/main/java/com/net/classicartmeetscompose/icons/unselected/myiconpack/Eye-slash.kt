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

public val UnselectedIcons.`Eye-slash`: ImageVector
    get() {
        if (`_eye-slash` != null) {
            return `_eye-slash`!!
        }
        `_eye-slash` = Builder(name = "Eye-slash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF41416e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.016f, 10.243f)
                arcToRelative(13.957f, 13.957f, 0.0f, false, false, -3.027f, -3.528f)
                lineToRelative(2.362f, -2.361f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, -0.708f)
                lineTo(14.112f, 9.178f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                lineTo(3.644f, 19.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.708f)
                lineTo(6.806f, 17.9f)
                arcTo(9.219f, 9.219f, 0.0f, false, false, 12.0f, 19.5f)
                curveToRelative(4.824f, 0.0f, 7.719f, -3.6f, 9.016f, -5.743f)
                arcTo(3.419f, 3.419f, 0.0f, false, false, 21.016f, 10.243f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                arcToRelative(2.944f, 2.944f, 0.0f, false, true, -1.731f, -0.562f)
                lineToRelative(4.169f, -4.169f)
                arcTo(2.942f, 2.942f, 0.0f, false, true, 15.0f, 12.0f)
                close()
                moveTo(20.162f, 13.241f)
                curveTo(18.972f, 15.205f, 16.333f, 18.5f, 12.0f, 18.5f)
                arcToRelative(8.221f, 8.221f, 0.0f, false, true, -4.458f, -1.337f)
                lineTo(9.56f, 15.145f)
                arcTo(3.922f, 3.922f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcToRelative(3.925f, 3.925f, 0.0f, false, false, -0.855f, -2.438f)
                lineToRelative(2.14f, -2.14f)
                arcToRelative(12.869f, 12.869f, 0.0f, false, true, 2.876f, 3.335f)
                arcTo(2.415f, 2.415f, 0.0f, false, true, 20.159f, 13.241f)
                close()
                moveTo(4.32f, 15.623f)
                arcToRelative(14.659f, 14.659f, 0.0f, false, true, -1.336f, -1.865f)
                arcToRelative(3.421f, 3.421f, 0.0f, false, true, 0.0f, -3.514f)
                curveTo(4.281f, 8.1f, 7.176f, 4.5f, 12.0f, 4.5f)
                arcToRelative(9.461f, 9.461f, 0.0f, false, true, 2.753f, 0.411f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.288f, 0.958f)
                arcTo(8.463f, 8.463f, 0.0f, false, false, 12.0f, 5.5f)
                curveToRelative(-4.333f, 0.0f, -6.972f, 3.3f, -8.16f, 5.259f)
                arcToRelative(2.419f, 2.419f, 0.0f, false, false, 0.0f, 2.485f)
                arcToRelative(13.444f, 13.444f, 0.0f, false, false, 1.242f, 1.733f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.764f, 0.646f)
                close()
                moveTo(11.371f, 8.056f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.153f, 0.988f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.483f, 2.482f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.988f, -0.152f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.371f, 8.056f)
                close()
            }
        }
        .build()
        return `_eye-slash`!!
    }

private var `_eye-slash`: ImageVector? = null
