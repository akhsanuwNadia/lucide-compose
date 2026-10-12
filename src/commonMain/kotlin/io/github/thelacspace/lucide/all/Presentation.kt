package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Presentation") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,3.0f)
                lineTo(22.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(21.0f,14.0f)
                curveTo(21.0f,15.104569f,20.10457f,16.0f,19.0f,16.0f)
                lineTo(5.0f,16.0f)
                curveTo(3.8954306f,16.0f,3.0f,15.104569f,3.0f,14.0f)
                lineTo(3.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(12.0f,16.0f)
                lineTo(17.0f,21.0f)
            }
}

public val LucideIcons.All.PresentationDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Presentation: ImageVector
    @Composable get() = PresentationDefinition.asImageVector()
