package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Leaf") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 20f)
                arcToRelative(10f, 10f, 0f, false, false, 25.9f, 25.9f)
                arcToRelative(0f, 00f, -1.04f, false, true, 1f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                arcToRelative(5f, 5f, 0f, false, false, Cf, 7.613f)
            }
}

public val LucideIcons.All.LeafDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Leaf: ImageVector
    @Composable get() = LeafDefinition.asImageVector()
