package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LoaderPinwheel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                curveTo(21.98769f,14.752695f,19.752724f,16.97769f,17.0f,16.97769f)
                curveTo(14.247277f,16.97769f,12.01231f,14.752695f,12.0f,12.0f)
                curveTo(11.98769f,9.247305f,9.752723f,7.0223107f,7.0f,7.0223107f)
                curveTo(4.2472773f,7.0223107f,2.0123105f,9.247305f,2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,20.7f)
                curveTo(5.437254f,19.811144f,4.469547f,18.154068f,4.463306f,16.356236f)
                curveTo(4.457065f,14.558404f,5.4132457f,12.89465f,6.9697833f,11.994966f)
                curveTo(8.52632f,11.095282f,10.445267f,11.097202f,12.0f,12.000001f)
                curveTo(13.536817f,12.9027195f,15.439173f,12.914152f,16.986729f,12.029971f)
                curveTo(18.534285f,11.14579f,19.490465f,9.50116f,19.493206f,7.71883f)
                curveTo(19.495947f,5.9365005f,18.54483f,4.288937f,17.0f,3.4000006f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.3f)
                curveTo(8.536817f,2.397282f,10.439173f,2.3858488f,11.98673f,3.27003f)
                curveTo(13.534286f,4.154211f,14.490465f,5.7988415f,14.493206f,7.581171f)
                curveTo(14.495947f,9.363501f,13.544829f,11.011064f,12.0f,11.900001f)
                curveTo(10.455171f,12.788938f,9.504053f,14.436501f,9.506794f,16.21883f)
                curveTo(9.509535f,18.00116f,10.465715f,19.64579f,12.013271f,20.52997f)
                curveTo(13.560827f,21.414152f,15.463183f,21.402718f,17.0f,20.5f)
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

public val LucideIcons.All.LoaderPinwheelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LoaderPinwheel: ImageVector
    @Composable get() = LoaderPinwheelDefinition.asImageVector()
