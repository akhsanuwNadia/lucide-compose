package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ParkingMeter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,15.0)
                lineTo(13.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.281999588012695,19.0)
                curveTo(15.711180686950684,19.0002498626709,16.092662811279297,18.726613998413086,16.229999542236328,18.31999969482422)
                lineTo(18.599998474121094,11.331999778747559)
                curveTo(19.625099182128906,8.431246757507324,18.636051177978516,5.201196193695068,16.16254425048828,3.3717234134674072)
                curveTo(13.68903923034668,1.5422505140304565,10.310957908630371,1.5422505140304565,7.837451934814453,3.3717234134674072)
                curveTo(5.363946437835693,5.201196193695068,4.374898433685303,8.431246757507324,5.399998664855957,11.331999778747559)
                lineTo(7.769998550415039,18.31999969482422)
                curveTo(7.907336235046387,18.726613998413086,8.288817405700684,19.0002498626709,8.717998504638672,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                curveTo(8.995192527770996,7.925007343292236,9.565935134887695,6.929609298706055,10.496113777160645,6.390720367431641)
                curveTo(11.426291465759277,5.851831436157227,12.573708534240723,5.851831436157227,13.503886222839355,6.390720367431641)
                curveTo(14.434064865112305,6.929609298706055,15.004807472229004,7.925007343292236,15.0,9.0)
            }
}

public val LucideIcons.All.ParkingMeterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ParkingMeter: ImageVector
    @Composable get() = ParkingMeterDefinition.asImageVector()
