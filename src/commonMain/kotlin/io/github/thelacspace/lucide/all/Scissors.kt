package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scissors") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,6.0)
                curveTo(2.995192527770996,7.074992656707764,3.5659356117248535,8.070390701293945,4.4961137771606445,8.60927963256836)
                curveTo(5.4262919425964355,9.148168563842773,6.5737080574035645,9.148168563842773,7.5038862228393555,8.60927963256836)
                curveTo(8.434064865112305,8.070390701293945,9.004807472229004,7.074992656707764,9.0,6.0)
                curveTo(9.004807472229004,4.925007343292236,8.434064865112305,3.9296092987060547,7.5038862228393555,3.3907203674316406)
                curveTo(6.5737080574035645,2.8518311977386475,5.4262919425964355,2.8518311977386475,4.4961137771606445,3.3907203674316406)
                curveTo(3.5659356117248535,3.9296092987060547,2.995192527770996,4.925007343292236,3.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.119999885559082,8.119999885559082)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,4.0)
                lineTo(8.119999885559082,15.880000114440918)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,18.0)
                curveTo(2.995192527770996,19.074993133544922,3.5659356117248535,20.070390701293945,4.4961137771606445,20.60927963256836)
                curveTo(5.4262919425964355,21.148168563842773,6.5737080574035645,21.148168563842773,7.5038862228393555,20.60927963256836)
                curveTo(8.434064865112305,20.070390701293945,9.004807472229004,19.074993133544922,9.0,18.0)
                curveTo(9.004807472229004,16.925006866455078,8.434064865112305,15.929609298706055,7.5038862228393555,15.39072036743164)
                curveTo(6.5737080574035645,14.851831436157227,5.4262919425964355,14.851831436157227,4.4961137771606445,15.39072036743164)
                curveTo(3.5659356117248535,15.929609298706055,2.995192527770996,16.925006866455078,3.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.800000190734863,14.800000190734863)
                lineTo(20.0,20.0)
            }
}

public val LucideIcons.All.ScissorsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scissors: ImageVector
    @Composable get() = ScissorsDefinition.asImageVector()
