package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ampersand") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(19.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5,12.0)
                curveTo(17.5,16.418277740478516,13.918277740478516,20.0,9.5,20.0)
                curveTo(7.014718532562256,20.0,5.0,17.985280990600586,5.0,15.5)
                curveTo(5.0,9.5,13.0,11.5,13.0,7.0)
                curveTo(13.004807472229004,5.925007343292236,12.434064865112305,4.929609298706055,11.503886222839355,4.390720367431641)
                curveTo(10.573708534240723,3.8518311977386475,9.426291465759277,3.8518311977386475,8.496113777160645,4.390720367431641)
                curveTo(7.5659356117248535,4.929609298706055,6.995192527770996,5.925007343292236,7.0,7.0)
                curveTo(7.0,10.0,9.5,15.5,19.0,20.0)
            }
}

public val LucideIcons.All.AmpersandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ampersand: ImageVector
    @Composable get() = AmpersandDefinition.asImageVector()
