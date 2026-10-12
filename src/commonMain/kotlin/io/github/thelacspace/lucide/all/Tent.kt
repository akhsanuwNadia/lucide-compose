package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.5f,21.0f)
                lineTo(14.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.5f,21.0f)
                lineTo(10.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5f,21.0f)
                lineTo(12.0f,15.0f)
                lineTo(8.5f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(22.0f,21.0f)
            }
}

public val LucideIcons.All.TentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tent: ImageVector
    @Composable get() = TentDefinition.asImageVector()
