package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreativeCommons") { strokeWidth ->
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
                moveTo(10.0f,9.3f)
                curveTo(8.746254f,8.726071f,7.2612934f,9.150346f,6.5f,10.3f)
                curveTo(5.8230615f,11.33225f,5.8230615f,12.667751f,6.5f,13.700001f)
                curveTo(7.2328296f,14.887873f,8.750231f,15.321416f,10.0f,14.700001f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,9.3f)
                curveTo(15.746254f,8.726071f,14.261293f,9.150346f,13.5f,10.3f)
                curveTo(12.823061f,11.33225f,12.823061f,12.667751f,13.5f,13.700001f)
                curveTo(14.23283f,14.887873f,15.750231f,15.321416f,17.0f,14.700001f)
            }
}

public val LucideIcons.All.CreativeCommonsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreativeCommons: ImageVector
    @Composable get() = CreativeCommonsDefinition.asImageVector()
