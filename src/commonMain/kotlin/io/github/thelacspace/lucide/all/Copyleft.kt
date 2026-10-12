package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Copyleft") { strokeWidth ->
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
                moveTo(9.17f,14.83f)
                curveTo(10.732556f,16.39082f,13.264407f,16.38988f,14.825805f,14.827903f)
                curveTo(16.387203f,13.265925f,16.387203f,10.734075f,14.825805f,9.172097f)
                curveTo(13.264407f,7.6101203f,10.732556f,7.6091814f,9.17f,9.17f)
            }
}

public val LucideIcons.All.CopyleftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Copyleft: ImageVector
    @Composable get() = CopyleftDefinition.asImageVector()
