package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,11.0f)
                lineTo(12.0f,6.0f)
                lineTo(7.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,18.0f)
                lineTo(12.0f,13.0f)
                lineTo(7.0f,18.0f)
            }
}

public val LucideIcons.All.ChevronsUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsUp: ImageVector
    @Composable get() = ChevronsUpDefinition.asImageVector()
