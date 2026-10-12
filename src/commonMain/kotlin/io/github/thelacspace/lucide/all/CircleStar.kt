package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleStar") { strokeWidth ->
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
                moveTo(11.051f,7.616f)
                curveTo(11.186602f,7.200042f,11.576857f,6.9205246f,12.014325f,6.9260244f)
                curveTo(12.451794f,6.9315243f,12.834898f,7.2207646f,12.96f,7.6400003f)
                lineTo(13.6970005f,9.092f)
                curveTo(13.842494f,9.378342f,14.116672f,9.577372f,14.434f,9.627f)
                lineTo(16.068f,9.882999f)
                curveTo(16.499565f,9.8846855f,16.88136f,10.163041f,17.014967f,10.573406f)
                curveTo(17.148573f,10.98377f,17.003847f,11.433553f,16.656f,11.688999f)
                lineTo(15.484f,12.856999f)
                curveTo(15.256374f,13.083624f,15.1514635f,13.405796f,15.202001f,13.723f)
                lineTo(15.461f,15.3359995f)
                curveTo(15.607287f,15.751066f,15.465022f,16.212982f,15.110561f,16.473824f)
                curveTo(14.756102f,16.734667f,14.272777f,16.733114f,13.92f,16.47f)
                lineTo(12.455f,15.719999f)
                curveTo(12.168696f,15.573306f,11.829304f,15.573306f,11.543f,15.719999f)
                lineTo(10.078f,16.47f)
                curveTo(9.725301f,16.730888f,9.243745f,16.731436f,8.890455f,16.471346f)
                curveTo(8.537166f,16.211258f,8.394649f,15.751272f,8.539f,15.336999f)
                lineTo(8.797f,13.723999f)
                curveTo(8.847874f,13.406467f,8.742937f,13.083845f,8.515f,12.856999f)
                lineTo(7.359f,11.705f)
                curveTo(6.999102f,11.455664f,6.8432527f,11.001198f,6.9743943f,10.583469f)
                curveTo(7.1055365f,10.165741f,7.493171f,9.881897f,7.931f,9.882999f)
                lineTo(9.564f,9.627f)
                curveTo(9.881329f,9.577372f,10.155506f,9.378342f,10.301001f,9.092f)
                close()
            }
}

public val LucideIcons.All.CircleStarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleStar: ImageVector
    @Composable get() = CircleStarDefinition.asImageVector()
