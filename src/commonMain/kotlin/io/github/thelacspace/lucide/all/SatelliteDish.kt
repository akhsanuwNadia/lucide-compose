package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SatelliteDish") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                curveTo(18.0,8.686291694641113,15.313708305358887,6.0,12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.8239998817443848,10.458999633789062)
                curveTo(1.303692102432251,13.533958435058594,1.9129480123519897,17.235925674438477,4.338510990142822,19.661489486694336)
                curveTo(6.764073848724365,22.087051391601562,10.466041564941406,22.696306228637695,13.541000366210938,21.17599868774414)
                curveTo(14.098999977111816,20.899999618530273,14.164000511169434,20.163999557495117,13.723999977111816,19.7239990234375)
                lineTo(4.276000022888184,10.275999069213867)
                curveTo(3.8359999656677246,9.835999488830566,3.0999999046325684,9.900999069213867,2.8239998817443848,10.458998680114746)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                curveTo(22.0,6.477152347564697,17.52284812927246,2.0,12.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,15.0)
                lineTo(13.0,11.0)
            }
}

public val LucideIcons.All.SatelliteDishDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SatelliteDish: ImageVector
    @Composable get() = SatelliteDishDefinition.asImageVector()
