package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShipCargo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f, 12f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, false, hf, 1f)
                arcToRelative(1f, 1f, 0f, true, false, Vf, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, hf)
                arcToRelative(-13f, af, 1f, true, false, 00f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.38f, 19f)
                curveToRelative(1.076f, -1.815f, 1.636f, -4.89f, 1.628f, -6.008f)
                arcToRelative(1f, 1f, 0f, false, false, -.992f, Hf)
                arcToRelative(3.984f, af, 1f, true, false, 00f, -1f)
                arcToRelative(.984f, cf, -.03f, true, false, 5.621f, 2.826f)
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

public val LucideIcons.All.ShipCargoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShipCargo: ImageVector
    @Composable get() = ShipCargoDefinition.asImageVector()
