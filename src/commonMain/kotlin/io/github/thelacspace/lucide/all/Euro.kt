package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Euro") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                lineTo(16.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(13.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,6.0f)
                curveTo(17.577066f,4.707642f,15.722211f,3.9942358f,13.8f,4.0f)
                curveTo(11.704737f,4.0263543f,9.705778f,4.884056f,8.242958f,6.384384f)
                curveTo(6.7801385f,7.8847117f,5.97331f,9.90474f,6.0f,12.0f)
                curveTo(6.0f,16.4f,9.5f,20.0f,13.8f,20.0f)
                curveTo(15.8f,20.0f,17.6f,19.2f,19.0f,18.0f)
            }
}

public val LucideIcons.All.EuroDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Euro: ImageVector
    @Composable get() = EuroDefinition.asImageVector()
