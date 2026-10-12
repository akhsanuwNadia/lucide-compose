package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareUser") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,10.0)
                curveTo(8.995192527770996,11.074993133544922,9.565935134887695,12.070390701293945,10.496113777160645,12.60927963256836)
                curveTo(11.426291465759277,13.148168563842773,12.573708534240723,13.148168563842773,13.503886222839355,12.60927963256836)
                curveTo(14.434064865112305,12.070390701293945,15.004807472229004,11.074993133544922,15.0,10.0)
                curveTo(15.004807472229004,8.925006866455078,14.434064865112305,7.929609298706055,13.503886222839355,7.390720367431641)
                curveTo(12.573708534240723,6.851831436157227,11.426291465759277,6.851831436157227,10.496113777160645,7.390720367431641)
                curveTo(9.565935134887695,7.929609298706055,8.995192527770996,8.925006866455078,9.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(7.0,19.0)
                curveTo(7.0,17.895429611206055,7.895430564880371,17.0,9.0,17.0)
                lineTo(15.0,17.0)
                curveTo(16.104570388793945,17.0,17.0,17.895429611206055,17.0,19.0)
                lineTo(17.0,21.0)
            }
}

public val LucideIcons.All.SquareUserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareUser: ImageVector
    @Composable get() = SquareUserDefinition.asImageVector()
