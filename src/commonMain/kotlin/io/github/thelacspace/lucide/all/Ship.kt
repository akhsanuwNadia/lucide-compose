package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ship") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 9.189f)
                verticalLineTo(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 12f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Hf)
                arcToRelative(7f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.38f, 19f)
                arcTo(11.6f, 11.6f, 0f, false, false, lf, -8.188f)
                arcTo(-3.639f, af, 2f, false, false, 00f, -1.624f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 20f)
                curveToRelative(.6f, .5f, 1.2f, 1f, 2.5f, 1f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, .5f, 2.5f, 1f)
                reflectiveCurveToRelative(1.2f, 1f, 2.5f, 1f)
                curveToRelative(2.5f, 0f, 2.5f, -2f, 5f, -2f)
                curveToRelative(1.3f, 0f, 1.9f, .5f, 2.5f, 1f)
            }
}

public val LucideIcons.All.ShipDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ship: ImageVector
    @Composable get() = ShipDefinition.asImageVector()
