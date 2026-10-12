package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Copyright") { strokeWidth ->
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
                moveTo(14.83f,14.83f)
                curveTo(13.267444f,16.39082f,10.735593f,16.38988f,9.174195f,14.827903f)
                curveTo(7.612797f,13.265925f,7.612797f,10.734075f,9.174195f,9.172097f)
                curveTo(10.735593f,7.6101203f,13.267444f,7.6091814f,14.83f,9.17f)
            }
}

public val LucideIcons.All.CopyrightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Copyright: ImageVector
    @Composable get() = CopyrightDefinition.asImageVector()
