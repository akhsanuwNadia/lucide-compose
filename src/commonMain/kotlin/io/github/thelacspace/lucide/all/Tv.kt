package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tv") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,2.0)
                lineTo(12.0,7.0)
                lineTo(7.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,7.0)
                lineTo(20.0,7.0)
                lineTo(22.0,7.0)
                lineTo(22.0,22.0)
                lineTo(20.0,22.0)
                lineTo(4.0,22.0)
                lineTo(2.0,22.0)
                lineTo(2.0,7.0)
                lineTo(4.0,7.0)
                close()
            }
}

public val LucideIcons.All.TvDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tv: ImageVector
    @Composable get() = TvDefinition.asImageVector()
