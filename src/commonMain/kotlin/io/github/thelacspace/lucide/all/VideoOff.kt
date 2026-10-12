package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VideoOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.66f,6.0f)
                lineTo(14.0f,6.0f)
                curveTo(15.104569f,6.0f,16.0f,6.8954306f,16.0f,8.0f)
                lineTo(16.0f,10.5f)
                lineTo(21.248001f,7.4379997f)
                curveTo(21.402666f,7.347748f,21.593788f,7.3470993f,21.749063f,7.4363f)
                curveTo(21.904337f,7.5255f,22.000053f,7.690928f,22.0f,7.87f)
                lineTo(22.0f,16.066f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                curveTo(16.0f,17.10457f,15.104569f,18.0f,14.0f,18.0f)
                lineTo(4.0f,18.0f)
                curveTo(2.8954306f,18.0f,2.0f,17.10457f,2.0f,16.0f)
                lineTo(2.0f,8.0f)
                curveTo(2.0f,6.8954306f,2.8954306f,6.0f,4.0f,6.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.VideoOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VideoOff: ImageVector
    @Composable get() = VideoOffDefinition.asImageVector()
