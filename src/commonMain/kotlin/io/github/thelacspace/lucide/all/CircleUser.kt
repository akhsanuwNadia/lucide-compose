package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleUser") { strokeWidth ->
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
                moveTo(9.0f,10.0f)
                curveTo(8.995193f,11.074993f,9.565935f,12.070391f,10.496114f,12.60928f)
                curveTo(11.426291f,13.148169f,12.573709f,13.148169f,13.503886f,12.60928f)
                curveTo(14.434065f,12.070391f,15.004807f,11.074993f,15.0f,10.0f)
                curveTo(15.004807f,8.925007f,14.434065f,7.9296093f,13.503886f,7.3907204f)
                curveTo(12.573709f,6.8518314f,11.426291f,6.8518314f,10.496114f,7.3907204f)
                curveTo(9.565935f,7.9296093f,8.995193f,8.925007f,9.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,20.662f)
                lineTo(7.0f,19.0f)
                curveTo(7.0f,17.89543f,7.8954306f,17.0f,9.0f,17.0f)
                lineTo(15.0f,17.0f)
                curveTo(16.10457f,17.0f,17.0f,17.89543f,17.0f,19.0f)
                lineTo(17.0f,20.662f)
            }
}

public val LucideIcons.All.CircleUserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleUser: ImageVector
    @Composable get() = CircleUserDefinition.asImageVector()
