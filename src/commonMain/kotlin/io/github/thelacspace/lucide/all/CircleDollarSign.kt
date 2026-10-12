package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleDollarSign") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9839749f,15.583309f,3.8864517f,18.901302f,6.987046f,20.6976f)
                curveTo(10.08764f,22.493896f,13.91236f,22.493896f,17.012955f,20.6976f)
                curveTo(20.113548f,18.901302f,22.016026f,15.583309f,22.0f,12.0f)
                curveTo(22.016026f,8.416691f,20.113548f,5.0986977f,17.012955f,3.302401f)
                curveTo(13.91236f,1.5061044f,10.08764f,1.5061044f,6.987046f,3.302401f)
                curveTo(3.8864517f,5.0986977f,1.9839749f,8.416691f,2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,8.0f)
                lineTo(10.0f,8.0f)
                curveTo(9.283339f,7.996795f,8.61974f,8.377291f,8.26048f,8.997409f)
                curveTo(7.901221f,9.617528f,7.901221f,10.382472f,8.26048f,11.002591f)
                curveTo(8.61974f,11.622709f,9.283339f,12.003205f,10.0f,12.0f)
                lineTo(14.0f,12.0f)
                curveTo(14.716661f,11.996795f,15.38026f,12.377291f,15.73952f,12.997409f)
                curveTo(16.09878f,13.617528f,16.09878f,14.382472f,15.73952f,15.002591f)
                curveTo(15.38026f,15.622709f,14.716661f,16.003204f,14.0f,16.0f)
                lineTo(8.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,6.0f)
            }
}

public val LucideIcons.All.CircleDollarSignDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleDollarSign: ImageVector
    @Composable get() = CircleDollarSignDefinition.asImageVector()
