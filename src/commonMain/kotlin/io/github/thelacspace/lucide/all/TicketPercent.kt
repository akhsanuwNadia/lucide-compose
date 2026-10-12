package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TicketPercent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                curveTo(3.0749928951263428,8.995192527770996,4.070390701293945,9.565935134887695,4.609279632568359,10.496113777160645)
                curveTo(5.148168563842773,11.426291465759277,5.148168563842773,12.573708534240723,4.609279632568359,13.503886222839355)
                curveTo(4.070390701293945,14.434064865112305,3.0749928951263428,15.004807472229004,2.0,15.0)
                lineTo(2.0,17.0)
                curveTo(2.0,18.104570388793945,2.895430564880371,19.0,4.0,19.0)
                lineTo(20.0,19.0)
                curveTo(21.104570388793945,19.0,22.0,18.104570388793945,22.0,17.0)
                lineTo(22.0,15.0)
                curveTo(20.925006866455078,15.004807472229004,19.929609298706055,14.434064865112305,19.39072036743164,13.503886222839355)
                curveTo(18.851831436157227,12.573708534240723,18.851831436157227,11.426291465759277,19.39072036743164,10.496113777160645)
                curveTo(19.929609298706055,9.565935134887695,20.925006866455078,8.995192527770996,22.0,9.0)
                lineTo(22.0,7.0)
                curveTo(22.0,5.895430564880371,21.104570388793945,5.0,20.0,5.0)
                lineTo(4.0,5.0)
                curveTo(2.895430564880371,5.0,2.0,5.895430564880371,2.0,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                lineTo(9.010000228881836,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.0)
                lineTo(9.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,15.0)
                lineTo(15.010000228881836,15.0)
            }
}

public val LucideIcons.All.TicketPercentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TicketPercent: ImageVector
    @Composable get() = TicketPercentDefinition.asImageVector()
