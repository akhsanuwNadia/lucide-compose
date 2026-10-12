package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Disc") { strokeWidth ->
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
                moveTo(10.0f,12.0f)
                curveTo(9.996795f,12.716661f,10.377291f,13.38026f,10.997409f,13.73952f)
                curveTo(11.617528f,14.098779f,12.382472f,14.098779f,13.002591f,13.73952f)
                curveTo(13.622709f,13.38026f,14.003205f,12.716661f,14.0f,12.0f)
                curveTo(14.003205f,11.283339f,13.622709f,10.61974f,13.002591f,10.26048f)
                curveTo(12.382472f,9.901221f,11.617528f,9.901221f,10.997409f,10.26048f)
                curveTo(10.377291f,10.61974f,9.996795f,11.283339f,10.0f,12.0f)
            }
}

public val LucideIcons.All.DiscDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Disc: ImageVector
    @Composable get() = DiscDefinition.asImageVector()
