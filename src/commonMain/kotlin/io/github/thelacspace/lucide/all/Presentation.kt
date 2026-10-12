package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Presentation") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,3.0)
                lineTo(22.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(21.0,14.0)
                curveTo(21.0,15.104569435119629,20.104570388793945,16.0,19.0,16.0)
                lineTo(5.0,16.0)
                curveTo(3.895430564880371,16.0,3.0,15.104569435119629,3.0,14.0)
                lineTo(3.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(12.0,16.0)
                lineTo(17.0,21.0)
            }
}

public val LucideIcons.All.PresentationDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Presentation: ImageVector
    @Composable get() = PresentationDefinition.asImageVector()
