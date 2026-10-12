package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mountain") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(12.0,11.0)
                lineTo(17.0,6.0)
                lineTo(22.0,21.0)
                lineTo(2.0,21.0)
                lineTo(8.0,3.0)
                close()
            }
}

public val LucideIcons.All.MountainDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mountain: ImageVector
    @Composable get() = MountainDefinition.asImageVector()
