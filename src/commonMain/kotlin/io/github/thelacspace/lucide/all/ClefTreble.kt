package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClefTreble") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.586f, 21.414f)
                arcToRelative(2f, 2f, 0f, false, false, 3.378f, -1.791f)
                lineTo(11.036f, 4.377f)
                arcToRelative(2f, 2f, 0f, true, true, 3.378f, 1.037f)
                curveTo(12.414f, 7.414f, 7f, 8f, 7f, 13f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, 5f)
                arcToRelative(5f, 4f, 0f, false, false, 5f, -4f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                arcToRelative(3f, 2f, 0f, false, false, -3f, 2f)
            }
}

public val LucideIcons.All.ClefTrebleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClefTreble: ImageVector
    @Composable get() = ClefTrebleDefinition.asImageVector()
