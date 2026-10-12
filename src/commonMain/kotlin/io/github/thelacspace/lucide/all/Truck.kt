package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Truck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                lineTo(14.0f,6.0f)
                curveTo(14.0f,4.8954306f,13.104569f,4.0f,12.0f,4.0f)
                lineTo(4.0f,4.0f)
                curveTo(2.8954306f,4.0f,2.0f,4.8954306f,2.0f,6.0f)
                lineTo(2.0f,17.0f)
                curveTo(2.0f,17.552284f,2.4477153f,18.0f,3.0f,18.0f)
                lineTo(5.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                lineTo(9.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,18.0f)
                lineTo(21.0f,18.0f)
                curveTo(21.552284f,18.0f,22.0f,17.552284f,22.0f,17.0f)
                lineTo(22.0f,13.35f)
                curveTo(21.999596f,13.123063f,21.922014f,12.903012f,21.78f,12.726001f)
                lineTo(18.300001f,8.376001f)
                curveTo(18.110558f,8.138762f,17.823597f,8.000433f,17.52f,8.0f)
                lineTo(14.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                curveTo(14.996795f,18.716661f,15.377291f,19.38026f,15.997409f,19.73952f)
                curveTo(16.617527f,20.09878f,17.382473f,20.09878f,18.00259f,19.73952f)
                curveTo(18.62271f,19.38026f,19.003204f,18.716661f,19.0f,18.0f)
                curveTo(19.003204f,17.283339f,18.62271f,16.61974f,18.00259f,16.26048f)
                curveTo(17.382473f,15.901221f,16.617527f,15.901221f,15.997409f,16.26048f)
                curveTo(15.377291f,16.61974f,14.996795f,17.283339f,15.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                curveTo(4.996795f,18.716661f,5.3772902f,19.38026f,5.9974093f,19.73952f)
                curveTo(6.617528f,20.09878f,7.382472f,20.09878f,8.002591f,19.73952f)
                curveTo(8.622709f,19.38026f,9.003205f,18.716661f,9.0f,18.0f)
                curveTo(9.003205f,17.283339f,8.622709f,16.61974f,8.002591f,16.26048f)
                curveTo(7.382472f,15.901221f,6.617528f,15.901221f,5.9974093f,16.26048f)
                curveTo(5.3772902f,16.61974f,4.996795f,17.283339f,5.0f,18.0f)
            }
}

public val LucideIcons.All.TruckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Truck: ImageVector
    @Composable get() = TruckDefinition.asImageVector()
