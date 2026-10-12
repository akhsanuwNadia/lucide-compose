package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SatelliteDish") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.824f, 10.459f)
                arcToRelative(8f, 8f, 0f, false, false, cf, .558f)
                arcToRelative(-.276f, .623f, -1.012f, false, false, lf, -9.448f)
                arcToRelative(-9.448f, cf, -.44f, false, false, -.375f, -1.452f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 15f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.SatelliteDishDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SatelliteDish: ImageVector
    @Composable get() = SatelliteDishDefinition.asImageVector()
