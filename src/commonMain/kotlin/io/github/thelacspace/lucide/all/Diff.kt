package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Diff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,10.0f)
                lineTo(19.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                lineTo(19.0f,21.0f)
            }
}

public val LucideIcons.All.DiffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Diff: ImageVector
    @Composable get() = DiffDefinition.asImageVector()
