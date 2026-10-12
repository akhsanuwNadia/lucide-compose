package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineDotTopVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,9.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,6.0)
                curveTo(8.995192527770996,7.074992656707764,9.565935134887695,8.070390701293945,10.496113777160645,8.60927963256836)
                curveTo(11.426291465759277,9.148168563842773,12.573708534240723,9.148168563842773,13.503886222839355,8.60927963256836)
                curveTo(14.434064865112305,8.070390701293945,15.004807472229004,7.074992656707764,15.0,6.0)
                curveTo(15.004807472229004,4.925007343292236,14.434064865112305,3.9296092987060547,13.503886222839355,3.3907203674316406)
                curveTo(12.573708534240723,2.8518311977386475,11.426291465759277,2.8518311977386475,10.496113777160645,3.3907203674316406)
                curveTo(9.565935134887695,3.9296092987060547,8.995192527770996,4.925007343292236,9.0,6.0)
            }
}

public val LucideIcons.All.LineDotTopVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineDotTopVertical: ImageVector
    @Composable get() = LineDotTopVerticalDefinition.asImageVector()
