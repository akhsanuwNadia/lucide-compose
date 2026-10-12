package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SwitchCamera") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,19.0)
                lineTo(4.0,19.0)
                curveTo(2.895430564880371,19.0,2.0,18.104570388793945,2.0,17.0)
                lineTo(2.0,7.0)
                curveTo(2.0,5.895430564880371,2.895430564880371,5.0,4.0,5.0)
                lineTo(9.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,5.0)
                lineTo(20.0,5.0)
                curveTo(21.104570388793945,5.0,22.0,5.895430564880371,22.0,7.0)
                lineTo(22.0,17.0)
                curveTo(22.0,18.104570388793945,21.104570388793945,19.0,20.0,19.0)
                lineTo(15.0,19.0)
            }
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
                moveTo(18.0,22.0)
                lineTo(15.0,19.0)
                lineTo(18.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(9.0,5.0)
                lineTo(6.0,8.0)
            }
}

public val LucideIcons.All.SwitchCameraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SwitchCamera: ImageVector
    @Composable get() = SwitchCameraDefinition.asImageVector()
