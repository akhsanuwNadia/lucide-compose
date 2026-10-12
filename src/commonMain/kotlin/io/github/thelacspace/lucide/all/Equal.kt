package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Equal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,9.0f)
                lineTo(19.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,15.0f)
                lineTo(19.0f,15.0f)
            }
}

public val LucideIcons.All.EqualDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Equal: ImageVector
    @Composable get() = EqualDefinition.asImageVector()
