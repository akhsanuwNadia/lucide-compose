package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToggleRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                curveTo(11.995192527770996,13.074993133544922,12.565935134887695,14.070390701293945,13.496113777160645,14.60927963256836)
                curveTo(14.426291465759277,15.148168563842773,15.573708534240723,15.148168563842773,16.503887176513672,14.60927963256836)
                curveTo(17.434064865112305,14.070390701293945,18.00480842590332,13.074993133544922,18.0,12.0)
                curveTo(18.00480842590332,10.925006866455078,17.434064865112305,9.929609298706055,16.503887176513672,9.39072036743164)
                curveTo(15.573708534240723,8.851831436157227,14.426291465759277,8.851831436157227,13.496113777160645,9.39072036743164)
                curveTo(12.565935134887695,9.929609298706055,11.995192527770996,10.925006866455078,12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,5.0)
                lineTo(15.0,5.0)
                lineTo(22.0,5.0)
                lineTo(22.0,19.0)
                lineTo(15.0,19.0)
                lineTo(9.0,19.0)
                lineTo(2.0,19.0)
                lineTo(2.0,5.0)
                lineTo(9.0,5.0)
                close()
            }
}

public val LucideIcons.All.ToggleRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToggleRight: ImageVector
    @Composable get() = ToggleRightDefinition.asImageVector()
