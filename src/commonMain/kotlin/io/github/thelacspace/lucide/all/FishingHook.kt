package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishingHook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.586f,11.414f)
                lineTo(11.656f,17.344f)
                curveTo(9.443995f,19.536308f,5.876027f,19.52833f,3.6738486f,17.32615f)
                curveTo(1.4716704f,15.123973f,1.4636922f,11.556005f,3.6560001f,9.344f)
                lineTo(6.793f,6.207f)
                curveTo(6.9952035f,6.0047355f,7.2993503f,5.944218f,7.5635777f,6.0536747f)
                curveTo(7.8278055f,6.163131f,8.000061f,6.420998f,8.0f,6.707f)
                lineTo(8.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.414f,8.586f)
                lineTo(22.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,10.0f)
                curveTo(16.996796f,10.716661f,17.37729f,11.38026f,17.99741f,11.73952f)
                curveTo(18.617527f,12.098779f,19.382473f,12.098779f,20.00259f,11.73952f)
                curveTo(20.62271f,11.38026f,21.003204f,10.716661f,21.0f,10.0f)
                curveTo(21.003204f,9.283339f,20.62271f,8.61974f,20.00259f,8.26048f)
                curveTo(19.382473f,7.901221f,18.617527f,7.901221f,17.99741f,8.26048f)
                curveTo(17.37729f,8.61974f,16.996796f,9.283339f,17.0f,10.0f)
            }
}

public val LucideIcons.All.FishingHookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishingHook: ImageVector
    @Composable get() = FishingHookDefinition.asImageVector()
