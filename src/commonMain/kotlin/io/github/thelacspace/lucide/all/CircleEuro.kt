package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleEuro") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,9.4f)
                curveTo(13.911466f,8.127362f,12.145381f,7.667536f,10.574432f,8.247737f)
                curveTo(9.003485f,8.827938f,7.9602633f,10.325332f,7.9602633f,12.0f)
                curveTo(7.9602633f,13.674667f,9.003485f,15.172061f,10.574432f,15.752262f)
                curveTo(12.145381f,16.332464f,13.911466f,15.872637f,15.0f,14.599999f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9839749f,15.583309f,3.8864517f,18.901302f,6.987046f,20.6976f)
                curveTo(10.08764f,22.493896f,13.91236f,22.493896f,17.012955f,20.6976f)
                curveTo(20.113548f,18.901302f,22.016026f,15.583309f,22.0f,12.0f)
                curveTo(22.016026f,8.416691f,20.113548f,5.0986977f,17.012955f,3.302401f)
                curveTo(13.91236f,1.5061044f,10.08764f,1.5061044f,6.987046f,3.302401f)
                curveTo(3.8864517f,5.0986977f,1.9839749f,8.416691f,2.0f,12.0f)
            }
}

public val LucideIcons.All.CircleEuroDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleEuro: ImageVector
    @Composable get() = CircleEuroDefinition.asImageVector()
