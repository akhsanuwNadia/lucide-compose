package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Projector") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,7.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,6.0)
                lineTo(9.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,7.0)
                lineTo(15.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,13.0)
                curveTo(5.995192527770996,14.074993133544922,6.5659356117248535,15.070390701293945,7.4961137771606445,15.60927963256836)
                curveTo(8.426291465759277,16.148168563842773,9.573708534240723,16.148168563842773,10.503886222839355,15.60927963256836)
                curveTo(11.434064865112305,15.070390701293945,12.004807472229004,14.074993133544922,12.0,13.0)
                curveTo(12.004807472229004,11.925006866455078,11.434064865112305,10.929609298706055,10.503886222839355,10.39072036743164)
                curveTo(9.573708534240723,9.851831436157227,8.426291465759277,9.851831436157227,7.4961137771606445,10.39072036743164)
                curveTo(6.5659356117248535,10.929609298706055,5.995192527770996,11.925006866455078,6.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.829999923706055,12.0)
                lineTo(20.0,12.0)
                curveTo(21.104570388793945,12.0,22.0,12.895430564880371,22.0,14.0)
                lineTo(22.0,18.0)
                curveTo(22.0,19.104570388793945,21.104570388793945,20.0,20.0,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,14.0)
                curveTo(2.0,12.895430564880371,2.895430564880371,12.0,4.0,12.0)
                lineTo(6.170000076293945,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(18.0,16.0)
            }
}

public val LucideIcons.All.ProjectorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Projector: ImageVector
    @Composable get() = ProjectorDefinition.asImageVector()
