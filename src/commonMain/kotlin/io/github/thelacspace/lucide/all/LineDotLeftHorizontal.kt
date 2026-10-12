package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineDotLeftHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(2.995192527770996,13.074993133544922,3.5659356117248535,14.070390701293945,4.4961137771606445,14.60927963256836)
                curveTo(5.4262919425964355,15.148168563842773,6.5737080574035645,15.148168563842773,7.5038862228393555,14.60927963256836)
                curveTo(8.434064865112305,14.070390701293945,9.004807472229004,13.074993133544922,9.0,12.0)
                curveTo(9.004807472229004,10.925006866455078,8.434064865112305,9.929609298706055,7.5038862228393555,9.39072036743164)
                curveTo(6.5737080574035645,8.851831436157227,5.4262919425964355,8.851831436157227,4.4961137771606445,9.39072036743164)
                curveTo(3.5659356117248535,9.929609298706055,2.995192527770996,10.925006866455078,3.0,12.0)
            }
}

public val LucideIcons.All.LineDotLeftHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineDotLeftHorizontal: ImageVector
    @Composable get() = LineDotLeftHorizontalDefinition.asImageVector()
