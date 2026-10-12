package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CannabisOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,18.0f)
                curveTo(13.5f,19.5f,15.5f,21.0f,18.0f,21.0f)
                curveTo(18.0f,19.5f,17.5f,17.5f,16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.988f,8.327f)
                curveTo(13.902f,6.054f,13.365f,3.82f,12.0f,2.0f)
                curveTo(11.352356f,2.8746688f,10.863269f,3.8562288f,10.555f,4.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.375f,11.725f)
                curveTo(18.882f,10.53f,21.0f,7.841f,21.0f,6.0f)
                curveTo(18.676f,6.0f,15.92f,7.296f,14.337999f,8.684f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.024f,15.378f)
                curveTo(21.353632f,15.263392f,21.679163f,15.137316f,22.0f,15.0f)
                curveTo(21.574f,13.721f,19.33f,12.443f,17.75f,12.093f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.995f,6.992f)
                curveTo(5.714f,6.4f,4.29f,6.0f,3.0f,6.0f)
                curveTo(3.0f,8.0f,5.5f,11.0f,7.0f,12.0f)
                curveTo(5.5f,12.0f,2.5f,13.5f,2.0f,15.0f)
                curveTo(5.5f,16.5f,8.0f,16.0f,8.0f,16.0f)
                curveTo(6.5f,17.5f,6.0f,19.5f,6.0f,21.0f)
                curveTo(8.5f,21.0f,10.5f,19.5f,12.0f,18.0f)
            }
}

public val LucideIcons.All.CannabisOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CannabisOff: ImageVector
    @Composable get() = CannabisOffDefinition.asImageVector()
