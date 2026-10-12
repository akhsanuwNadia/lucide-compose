package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Car") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,17.0f)
                lineTo(21.0f,17.0f)
                curveTo(21.6f,17.0f,22.0f,16.6f,22.0f,16.0f)
                lineTo(22.0f,13.0f)
                curveTo(22.0f,12.1f,21.3f,11.3f,20.5f,11.1f)
                curveTo(18.7f,10.6f,16.0f,10.0f,16.0f,10.0f)
                curveTo(16.0f,10.0f,14.7f,8.6f,13.8f,7.7f)
                curveTo(13.3f,7.2999997f,12.7f,7.0f,12.0f,7.0f)
                lineTo(5.0f,7.0f)
                curveTo(4.4f,7.0f,3.9f,7.4f,3.6f,7.9f)
                lineTo(2.1999998f,10.8f)
                curveTo(2.0675797f,11.186225f,2.0f,11.591705f,2.0f,12.0f)
                lineTo(2.0f,16.0f)
                curveTo(2.0f,16.6f,2.4f,17.0f,3.0f,17.0f)
                lineTo(5.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,17.0f)
                curveTo(4.996795f,17.716661f,5.3772902f,18.38026f,5.9974093f,18.73952f)
                curveTo(6.617528f,19.09878f,7.382472f,19.09878f,8.002591f,18.73952f)
                curveTo(8.622709f,18.38026f,9.003205f,17.716661f,9.0f,17.0f)
                curveTo(9.003205f,16.283339f,8.622709f,15.61974f,8.002591f,15.26048f)
                curveTo(7.382472f,14.901221f,6.617528f,14.901221f,5.9974093f,15.26048f)
                curveTo(5.3772902f,15.61974f,4.996795f,16.283339f,5.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(15.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,17.0f)
                curveTo(14.996795f,17.716661f,15.377291f,18.38026f,15.997409f,18.73952f)
                curveTo(16.617527f,19.09878f,17.382473f,19.09878f,18.00259f,18.73952f)
                curveTo(18.62271f,18.38026f,19.003204f,17.716661f,19.0f,17.0f)
                curveTo(19.003204f,16.283339f,18.62271f,15.61974f,18.00259f,15.26048f)
                curveTo(17.382473f,14.901221f,16.617527f,14.901221f,15.997409f,15.26048f)
                curveTo(15.377291f,15.61974f,14.996795f,16.283339f,15.0f,17.0f)
            }
}

public val LucideIcons.All.CarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Car: ImageVector
    @Composable get() = CarDefinition.asImageVector()
