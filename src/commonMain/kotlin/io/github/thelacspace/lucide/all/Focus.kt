package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Focus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                curveTo(8.995192527770996,13.074993133544922,9.565935134887695,14.070390701293945,10.496113777160645,14.60927963256836)
                curveTo(11.426291465759277,15.148168563842773,12.573708534240723,15.148168563842773,13.503886222839355,14.60927963256836)
                curveTo(14.434064865112305,14.070390701293945,15.004807472229004,13.074993133544922,15.0,12.0)
                curveTo(15.004807472229004,10.925006866455078,14.434064865112305,9.929609298706055,13.503886222839355,9.39072036743164)
                curveTo(12.573708534240723,8.851831436157227,11.426291465759277,8.851831436157227,10.496113777160645,9.39072036743164)
                curveTo(9.565935134887695,9.929609298706055,8.995192527770996,10.925006866455078,9.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(7.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,17.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(17.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,17.0)
            }
}

public val LucideIcons.All.FocusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Focus: ImageVector
    @Composable get() = FocusDefinition.asImageVector()
