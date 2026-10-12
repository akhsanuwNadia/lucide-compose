package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Forklift") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(5.0f,12.0f)
                curveTo(3.8954306f,12.0f,3.0f,12.895431f,3.0f,14.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,19.0f)
                lineTo(22.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,19.0f)
                lineTo(16.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(6.0f,7.0f)
                curveTo(6.0f,5.8954306f,6.8954306f,5.0f,8.0f,5.0f)
                lineTo(10.172f,5.0f)
                curveTo(10.70239f,5.000113f,11.211015f,5.2109013f,11.586f,5.586f)
                lineTo(15.4140005f,9.414f)
                curveTo(15.789099f,9.788985f,15.999887f,10.29761f,16.0f,10.828f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,19.0f)
                lineTo(11.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,19.0f)
                curveTo(10.996795f,19.716661f,11.377291f,20.38026f,11.997409f,20.73952f)
                curveTo(12.617528f,21.09878f,13.382472f,21.09878f,14.002591f,20.73952f)
                curveTo(14.622709f,20.38026f,15.003205f,19.716661f,15.0f,19.0f)
                curveTo(15.003205f,18.283339f,14.622709f,17.61974f,14.002591f,17.26048f)
                curveTo(13.382472f,16.90122f,12.617528f,16.90122f,11.997409f,17.26048f)
                curveTo(11.377291f,17.61974f,10.996795f,18.283339f,11.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                curveTo(2.996795f,19.716661f,3.3772902f,20.38026f,3.997409f,20.73952f)
                curveTo(4.617528f,21.09878f,5.382472f,21.09878f,6.0025907f,20.73952f)
                curveTo(6.6227098f,20.38026f,7.003205f,19.716661f,7.0f,19.0f)
                curveTo(7.003205f,18.283339f,6.6227098f,17.61974f,6.0025907f,17.26048f)
                curveTo(5.382472f,16.90122f,4.617528f,16.90122f,3.997409f,17.26048f)
                curveTo(3.3772902f,17.61974f,2.996795f,18.283339f,3.0f,19.0f)
            }
}

public val LucideIcons.All.ForkliftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Forklift: ImageVector
    @Composable get() = ForkliftDefinition.asImageVector()
