package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Compass") { strokeWidth ->
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
                moveTo(16.24f,7.76f)
                lineTo(14.436f,13.171f)
                curveTo(14.236936f,13.768264f,13.768264f,14.236936f,13.171f,14.436f)
                lineTo(7.76f,16.24f)
                lineTo(9.564f,10.829f)
                curveTo(9.763064f,10.231736f,10.231736f,9.763064f,10.829f,9.564f)
                close()
            }
}

public val LucideIcons.All.CompassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Compass: ImageVector
    @Composable get() = CompassDefinition.asImageVector()
