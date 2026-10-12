package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Beaker") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.5f,3.0f)
                lineTo(19.5f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,3.0f)
                lineTo(6.0f,19.0f)
                curveTo(6.0f,20.10457f,6.8954306f,21.0f,8.0f,21.0f)
                lineTo(16.0f,21.0f)
                curveTo(17.10457f,21.0f,18.0f,20.10457f,18.0f,19.0f)
                lineTo(18.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                lineTo(18.0f,14.0f)
            }
}

public val LucideIcons.All.BeakerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Beaker: ImageVector
    @Composable get() = BeakerDefinition.asImageVector()
