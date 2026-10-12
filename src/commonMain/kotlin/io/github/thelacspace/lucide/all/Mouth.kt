package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mouth") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                arcToRelative(50.5f, 50.5f, 0f, false, false, 1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.457f, 11.159f)
                arcToRelative(1f, 1f, 0f, false, false, 1.369f, 11.59f)
                arcToRelative(11.59f, 0f, 0019.7f, false, true, 1f, 0f)
            }
}

public val LucideIcons.All.MouthDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mouth: ImageVector
    @Composable get() = MouthDefinition.asImageVector()
