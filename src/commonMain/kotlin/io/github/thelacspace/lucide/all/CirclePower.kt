package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CirclePower") { strokeWidth ->
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
                moveTo(12.0f,7.0f)
                lineTo(12.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.998f,9.003f)
                curveTo(6.45221f,11.066741f,6.7292705f,13.967531f,8.6377735f,15.701345f)
                curveTo(10.546276f,17.43516f,13.460267f,17.433338f,15.366601f,15.69714f)
                curveTo(17.272934f,13.960941f,17.54637f,11.059807f,15.998f,8.998f)
            }
}

public val LucideIcons.All.CirclePowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CirclePower: ImageVector
    @Composable get() = CirclePowerDefinition.asImageVector()
