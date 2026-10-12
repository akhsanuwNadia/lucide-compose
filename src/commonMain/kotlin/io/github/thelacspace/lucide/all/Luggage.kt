package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Luggage") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,20.0f)
                curveTo(4.8954306f,20.0f,4.0f,19.10457f,4.0f,18.0f)
                lineTo(4.0f,8.0f)
                curveTo(4.0f,6.8954306f,4.8954306f,6.0f,6.0f,6.0f)
                lineTo(18.0f,6.0f)
                curveTo(19.10457f,6.0f,20.0f,6.8954306f,20.0f,8.0f)
                lineTo(20.0f,18.0f)
                curveTo(20.0f,19.10457f,19.10457f,20.0f,18.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                lineTo(8.0f,4.0f)
                curveTo(8.0f,2.8954306f,8.895431f,2.0f,10.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(15.104569f,2.0f,16.0f,2.8954306f,16.0f,4.0f)
                lineTo(16.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,20.0f)
                lineTo(14.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,20.0f)
                curveTo(13.996795f,20.716661f,14.377291f,21.38026f,14.997409f,21.73952f)
                curveTo(15.617528f,22.09878f,16.382473f,22.09878f,17.00259f,21.73952f)
                curveTo(17.62271f,21.38026f,18.003204f,20.716661f,18.0f,20.0f)
                curveTo(18.003204f,19.283339f,17.62271f,18.61974f,17.00259f,18.26048f)
                curveTo(16.382473f,17.90122f,15.617528f,17.90122f,14.997409f,18.26048f)
                curveTo(14.377291f,18.61974f,13.996795f,19.283339f,14.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,20.0f)
                curveTo(5.996795f,20.716661f,6.3772902f,21.38026f,6.9974093f,21.73952f)
                curveTo(7.617528f,22.09878f,8.382472f,22.09878f,9.002591f,21.73952f)
                curveTo(9.622709f,21.38026f,10.003205f,20.716661f,10.0f,20.0f)
                curveTo(10.003205f,19.283339f,9.622709f,18.61974f,9.002591f,18.26048f)
                curveTo(8.382472f,17.90122f,7.617528f,17.90122f,6.9974093f,18.26048f)
                curveTo(6.3772902f,18.61974f,5.996795f,19.283339f,6.0f,20.0f)
            }
}

public val LucideIcons.All.LuggageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Luggage: ImageVector
    @Composable get() = LuggageDefinition.asImageVector()
