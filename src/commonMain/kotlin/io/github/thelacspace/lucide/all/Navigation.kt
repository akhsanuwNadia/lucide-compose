package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Navigation") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                lineTo(22.0f,2.0f)
                lineTo(13.0f,21.0f)
                lineTo(11.0f,13.0f)
                lineTo(3.0f,11.0f)
                close()
            }
}

public val LucideIcons.All.NavigationDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Navigation: ImageVector
    @Composable get() = NavigationDefinition.asImageVector()
