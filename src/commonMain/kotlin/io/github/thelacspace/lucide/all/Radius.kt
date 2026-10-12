package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radius") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.34f,17.52f)
                curveTo(23.173935f,13.2380495f,22.304268f,7.5056443f,18.327848f,4.256895f)
                curveTo(14.351429f,1.0081462f,8.56073f,1.2990108f,4.9298706f,4.9298706f)
                curveTo(1.2990108f,8.56073f,1.0081462f,14.351429f,4.256895f,18.327848f)
                curveTo(7.5056443f,22.304268f,13.2380495f,23.173935f,17.52f,20.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,19.0f)
                curveTo(16.996796f,19.716661f,17.37729f,20.38026f,17.99741f,20.73952f)
                curveTo(18.617527f,21.09878f,19.382473f,21.09878f,20.00259f,20.73952f)
                curveTo(20.62271f,20.38026f,21.003204f,19.716661f,21.0f,19.0f)
                curveTo(21.003204f,18.283339f,20.62271f,17.61974f,20.00259f,17.26048f)
                curveTo(19.382473f,16.90122f,18.617527f,16.90122f,17.99741f,17.26048f)
                curveTo(17.37729f,17.61974f,16.996796f,18.283339f,17.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.41f,13.41f)
                lineTo(17.59f,17.59f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                curveTo(9.996795f,12.716661f,10.377291f,13.38026f,10.997409f,13.73952f)
                curveTo(11.617528f,14.098779f,12.382472f,14.098779f,13.002591f,13.73952f)
                curveTo(13.622709f,13.38026f,14.003205f,12.716661f,14.0f,12.0f)
                curveTo(14.003205f,11.283339f,13.622709f,10.61974f,13.002591f,10.26048f)
                curveTo(12.382472f,9.901221f,11.617528f,9.901221f,10.997409f,10.26048f)
                curveTo(10.377291f,10.61974f,9.996795f,11.283339f,10.0f,12.0f)
            }
}

public val LucideIcons.All.RadiusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radius: ImageVector
    @Composable get() = RadiusDefinition.asImageVector()
