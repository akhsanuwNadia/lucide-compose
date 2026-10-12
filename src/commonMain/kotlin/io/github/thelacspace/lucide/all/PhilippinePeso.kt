package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PhilippinePeso") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,11.0)
                lineTo(4.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,7.0)
                lineTo(4.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(7.0,4.0)
                curveTo(7.0,3.4477152824401855,7.4477152824401855,3.0,8.0,3.0)
                lineTo(12.0,3.0)
                curveTo(15.303234100341797,3.014772653579712,17.97322654724121,5.696732521057129,17.97322654724121,9.0)
                curveTo(17.97322654724121,12.303267478942871,15.303234100341797,14.985227584838867,12.0,15.0)
                lineTo(7.0,15.0)
            }
}

public val LucideIcons.All.PhilippinePesoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PhilippinePeso: ImageVector
    @Composable get() = PhilippinePesoDefinition.asImageVector()
