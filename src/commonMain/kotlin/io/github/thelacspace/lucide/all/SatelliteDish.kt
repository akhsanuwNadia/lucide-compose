package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SatelliteDish") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                curveTo(18.0f,8.686292f,15.313708f,6.0f,12.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.824f,10.459f)
                curveTo(1.3036921f,13.533958f,1.912948f,17.235926f,4.338511f,19.66149f)
                curveTo(6.764074f,22.087051f,10.466042f,22.696306f,13.541f,21.175999f)
                curveTo(14.099f,20.9f,14.1640005f,20.164f,13.724f,19.723999f)
                lineTo(4.276f,10.275999f)
                curveTo(3.836f,9.8359995f,3.1f,9.900999f,2.824f,10.458999f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                curveTo(22.0f,6.4771523f,17.522848f,2.0f,12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,15.0f)
                lineTo(13.0f,11.0f)
            }
}

public val LucideIcons.All.SatelliteDishDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SatelliteDish: ImageVector
    @Composable get() = SatelliteDishDefinition.asImageVector()
