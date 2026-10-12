package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrafficCone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.05f,10.966f)
                curveTo(15.109673f,11.615408f,13.603476f,11.999925f,11.999999f,11.999925f)
                curveTo(10.3965225f,11.999925f,8.890326f,11.615408f,7.949999f,10.966f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.923f,14.049f)
                lineTo(21.403f,16.089f)
                curveTo(21.76627f,16.248404f,22.000965f,16.607471f,22.00118f,17.004173f)
                curveTo(22.001398f,17.400877f,21.767094f,17.7602f,21.404f,17.92f)
                lineTo(12.829999f,21.82f)
                curveTo(12.3027935f,22.060476f,11.697205f,22.060476f,11.169999f,21.82f)
                lineTo(2.5959988f,17.91f)
                curveTo(2.2334268f,17.75013f,1.9994527f,17.391253f,1.9994527f,16.994999f)
                curveTo(1.9994527f,16.598747f,2.2334268f,16.23987f,2.5959988f,16.08f)
                lineTo(7.079999f,14.04f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.949f,14.14f)
                curveTo(17.224926f,15.108215f,16.346363f,16.067972f,14.700437f,16.59637f)
                curveTo(13.05451f,17.12477f,10.943489f,17.12477f,9.297563f,16.59637f)
                curveTo(7.651635f,16.067972f,6.773073f,15.108215f,7.049f,14.14f)
                lineTo(10.063f,3.5f)
                curveTo(10.290288f,2.6159961f,11.087244f,1.998026f,12.0f,1.998026f)
                curveTo(12.912756f,1.998026f,13.709712f,2.6159961f,13.937f,3.5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.194f,6.57f)
                curveTo(10.887842f,7.1439476f,13.110159f,7.1439476f,14.804001f,6.57f)
            }
}

public val LucideIcons.All.TrafficConeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrafficCone: ImageVector
    @Composable get() = TrafficConeDefinition.asImageVector()
