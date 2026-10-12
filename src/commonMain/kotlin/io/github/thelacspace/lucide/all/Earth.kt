package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Earth") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.54f,15.0f)
                lineTo(17.0f,15.0f)
                curveTo(15.895431f,15.0f,15.0f,15.895431f,15.0f,17.0f)
                lineTo(15.0f,21.54f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.34f)
                lineTo(7.0f,5.0f)
                curveTo(7.0f,6.656854f,8.343145f,8.0f,10.0f,8.0f)
                curveTo(11.104569f,8.0f,12.0f,8.895431f,12.0f,10.0f)
                curveTo(12.0f,11.1f,12.9f,12.0f,14.0f,12.0f)
                curveTo(15.104569f,12.0f,16.0f,11.104569f,16.0f,10.0f)
                curveTo(16.0f,8.9f,16.9f,8.0f,18.0f,8.0f)
                lineTo(21.17f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,21.95f)
                lineTo(11.0f,18.0f)
                curveTo(11.0f,16.89543f,10.104569f,16.0f,9.0f,16.0f)
                curveTo(7.8954306f,16.0f,7.0f,15.104569f,7.0f,14.0f)
                lineTo(7.0f,13.0f)
                curveTo(7.0f,11.895431f,6.1045694f,11.0f,5.0f,11.0f)
                lineTo(2.05f,11.0f)
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

public val LucideIcons.All.EarthDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Earth: ImageVector
    @Composable get() = EarthDefinition.asImageVector()
