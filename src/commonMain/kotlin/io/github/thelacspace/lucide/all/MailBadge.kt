package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailBadge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,7.7f)
                lineTo(22.0f,6.0f)
                curveTo(22.0f,4.8954306f,21.10457f,4.0f,20.0f,4.0f)
                lineTo(4.0f,4.0f)
                curveTo(2.8954306f,4.0f,2.0f,4.8954306f,2.0f,6.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.10457f,2.8954306f,20.0f,4.0f,20.0f)
                lineTo(12.25f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.996f)
                curveTo(11.635684f,12.996004f,11.278729f,12.893423f,10.97f,12.700001f)
                lineTo(2.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.69f,16.479f)
                lineTo(21.98f,21.359001f)
                curveTo(22.035898f,21.54889f,21.97451f,21.753878f,21.823444f,21.881786f)
                curveTo(21.672377f,22.009697f,21.460072f,22.036444f,21.282f,21.95f)
                lineTo(19.439f,21.101002f)
                curveTo(19.161552f,20.965641f,18.83714f,20.96601f,18.56f,21.102001f)
                lineTo(16.713999f,21.952002f)
                curveTo(16.536053f,22.035337f,16.325794f,22.006721f,16.176592f,21.878864f)
                curveTo(16.027388f,21.751005f,15.966905f,21.547611f,16.022f,21.359001f)
                lineTo(17.312f,16.479f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                curveTo(15.995193f,15.074993f,16.565935f,16.07039f,17.496113f,16.60928f)
                curveTo(18.426292f,17.148169f,19.573708f,17.148169f,20.503887f,16.60928f)
                curveTo(21.434065f,16.07039f,22.004808f,15.074993f,22.0f,14.0f)
                curveTo(22.004808f,12.925007f,21.434065f,11.929609f,20.503887f,11.39072f)
                curveTo(19.573708f,10.851831f,18.426292f,10.851831f,17.496113f,11.39072f)
                curveTo(16.565935f,11.929609f,15.995193f,12.925007f,16.0f,14.0f)
            }
}

public val LucideIcons.All.MailBadgeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailBadge: ImageVector
    @Composable get() = MailBadgeDefinition.asImageVector()
