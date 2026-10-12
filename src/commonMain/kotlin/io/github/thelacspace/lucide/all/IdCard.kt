package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IdCard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,19.0)
                curveTo(12.990151405334473,16.79784393310547,11.202178001403809,15.01784896850586,9.0,15.01784896850586)
                curveTo(6.797821521759033,15.01784896850586,5.009848594665527,16.79784393310547,5.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,10.0)
                lineTo(18.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(18.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                curveTo(5.995192527770996,13.074993133544922,6.5659356117248535,14.070390701293945,7.4961137771606445,14.60927963256836)
                curveTo(8.426291465759277,15.148168563842773,9.573708534240723,15.148168563842773,10.503886222839355,14.60927963256836)
                curveTo(11.434064865112305,14.070390701293945,12.004807472229004,13.074993133544922,12.0,12.0)
                curveTo(12.004807472229004,10.925006866455078,11.434064865112305,9.929609298706055,10.503886222839355,9.39072036743164)
                curveTo(9.573708534240723,8.851831436157227,8.426291465759277,8.851831436157227,7.4961137771606445,9.39072036743164)
                curveTo(6.5659356117248535,9.929609298706055,5.995192527770996,10.925006866455078,6.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,5.0)
                lineTo(20.0,5.0)
                lineTo(22.0,5.0)
                lineTo(22.0,19.0)
                lineTo(20.0,19.0)
                lineTo(4.0,19.0)
                lineTo(2.0,19.0)
                lineTo(2.0,5.0)
                lineTo(4.0,5.0)
                close()
            }
}

public val LucideIcons.All.IdCardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IdCard: ImageVector
    @Composable get() = IdCardDefinition.asImageVector()
