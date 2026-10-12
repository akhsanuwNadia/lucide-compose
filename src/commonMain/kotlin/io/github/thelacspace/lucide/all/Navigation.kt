package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Navigation") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                lineTo(22.0,2.0)
                lineTo(13.0,21.0)
                lineTo(11.0,13.0)
                lineTo(3.0,11.0)
                close()
            }
}

public val LucideIcons.All.NavigationDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Navigation: ImageVector
    @Composable get() = NavigationDefinition.asImageVector()
