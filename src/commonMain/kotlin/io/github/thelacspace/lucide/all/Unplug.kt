package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Unplug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,5.0f)
                lineTo(22.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(5.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.3f,20.3f)
                curveTo(6.7503247f,20.75189f,7.3620367f,21.005892f,8.0f,21.005892f)
                curveTo(8.637964f,21.005892f,9.249677f,20.75189f,9.700001f,20.3f)
                lineTo(12.0f,18.0f)
                lineTo(6.0f,12.0f)
                lineTo(3.7f,14.3f)
                curveTo(3.248109f,14.750324f,2.9941072f,15.362037f,2.9941072f,16.0f)
                curveTo(2.9941072f,16.637964f,3.248109f,17.249676f,3.7f,17.7f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,13.5f)
                lineTo(10.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.5f,16.5f)
                lineTo(13.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(18.0f,12.0f)
                lineTo(20.3f,9.7f)
                curveTo(20.75189f,9.249676f,21.005892f,8.637963f,21.005892f,8.0f)
                curveTo(21.005892f,7.362036f,20.75189f,6.7503242f,20.3f,6.2999997f)
                lineTo(17.699999f,3.6999998f)
                curveTo(17.249674f,3.248109f,16.637962f,2.9941075f,15.999999f,2.9941075f)
                curveTo(15.362036f,2.9941075f,14.750323f,3.248109f,14.299999f,3.6999998f)
                close()
            }
}

public val LucideIcons.All.UnplugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Unplug: ImageVector
    @Composable get() = UnplugDefinition.asImageVector()
