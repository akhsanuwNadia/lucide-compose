package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tv") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,2.0f)
                lineTo(12.0f,7.0f)
                lineTo(7.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,7.0f)
                lineTo(20.0f,7.0f)
                lineTo(22.0f,7.0f)
                lineTo(22.0f,22.0f)
                lineTo(20.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(2.0f,22.0f)
                lineTo(2.0f,7.0f)
                lineTo(4.0f,7.0f)
                close()
            }
}

public val LucideIcons.All.TvDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tv: ImageVector
    @Composable get() = TvDefinition.asImageVector()
