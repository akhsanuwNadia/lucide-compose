package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineDotBottomVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,18.0)
                curveTo(8.995192527770996,19.074993133544922,9.565935134887695,20.070390701293945,10.496113777160645,20.60927963256836)
                curveTo(11.426291465759277,21.148168563842773,12.573708534240723,21.148168563842773,13.503886222839355,20.60927963256836)
                curveTo(14.434064865112305,20.070390701293945,15.004807472229004,19.074993133544922,15.0,18.0)
                curveTo(15.004807472229004,16.925006866455078,14.434064865112305,15.929609298706055,13.503886222839355,15.39072036743164)
                curveTo(12.573708534240723,14.851831436157227,11.426291465759277,14.851831436157227,10.496113777160645,15.39072036743164)
                curveTo(9.565935134887695,15.929609298706055,8.995192527770996,16.925006866455078,9.0,18.0)
            }
}

public val LucideIcons.All.LineDotBottomVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineDotBottomVertical: ImageVector
    @Composable get() = LineDotBottomVerticalDefinition.asImageVector()
