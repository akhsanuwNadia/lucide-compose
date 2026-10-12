package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleParking") { strokeWidth ->
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
                moveTo(9.0f,17.0f)
                lineTo(9.0f,7.0f)
                lineTo(13.0f,7.0f)
                curveTo(14.651617f,7.007386f,15.986613f,8.348366f,15.986613f,10.0f)
                curveTo(15.986613f,11.651634f,14.651617f,12.992614f,13.0f,13.0f)
                lineTo(9.0f,13.0f)
            }
}

public val LucideIcons.All.CircleParkingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleParking: ImageVector
    @Composable get() = CircleParkingDefinition.asImageVector()
