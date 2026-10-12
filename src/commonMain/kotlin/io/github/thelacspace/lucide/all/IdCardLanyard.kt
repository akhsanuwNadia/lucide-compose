package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IdCardLanyard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5,8.0)
                lineTo(10.5,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,2.0)
                lineTo(14.0,4.0)
                lineTo(17.0,4.0)
                curveTo(18.104570388793945,4.0,19.0,4.895430564880371,19.0,6.0)
                lineTo(19.0,20.0)
                curveTo(19.0,21.104570388793945,18.104570388793945,22.0,17.0,22.0)
                lineTo(7.0,22.0)
                curveTo(5.895430564880371,22.0,5.0,21.104570388793945,5.0,20.0)
                lineTo(5.0,6.0)
                curveTo(5.0,4.895430564880371,5.895430564880371,4.0,7.0,4.0)
                lineTo(10.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,22.0)
                curveTo(15.990151405334473,19.79784393310547,14.202178001403809,18.01784896850586,12.0,18.01784896850586)
                curveTo(9.797821998596191,18.01784896850586,8.009848594665527,19.79784393310547,8.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(12.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,15.0)
                curveTo(8.995192527770996,16.074993133544922,9.565935134887695,17.070390701293945,10.496113777160645,17.60927963256836)
                curveTo(11.426291465759277,18.148168563842773,12.573708534240723,18.148168563842773,13.503886222839355,17.60927963256836)
                curveTo(14.434064865112305,17.070390701293945,15.004807472229004,16.074993133544922,15.0,15.0)
                curveTo(15.004807472229004,13.925006866455078,14.434064865112305,12.929609298706055,13.503886222839355,12.39072036743164)
                curveTo(12.573708534240723,11.851831436157227,11.426291465759277,11.851831436157227,10.496113777160645,12.39072036743164)
                curveTo(9.565935134887695,12.929609298706055,8.995192527770996,13.925006866455078,9.0,15.0)
            }
}

public val LucideIcons.All.IdCardLanyardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IdCardLanyard: ImageVector
    @Composable get() = IdCardLanyardDefinition.asImageVector()
