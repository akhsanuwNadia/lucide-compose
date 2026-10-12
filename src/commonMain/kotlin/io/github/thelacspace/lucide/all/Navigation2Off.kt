package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Navigation2Off") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.31f,9.31f)
                lineTo(5.0f,21.0f)
                lineTo(12.0f,17.0f)
                lineTo(19.0f,21.0f)
                lineTo(17.83f,17.83f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.53f,8.88f)
                lineTo(12.0f,2.0f)
                lineTo(10.83f,5.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.Navigation2OffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Navigation2Off: ImageVector
    @Composable get() = Navigation2OffDefinition.asImageVector()
