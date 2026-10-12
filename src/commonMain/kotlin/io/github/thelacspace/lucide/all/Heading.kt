package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(18.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,20.0)
                lineTo(6.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,20.0)
                lineTo(18.0,4.0)
            }
}

public val LucideIcons.All.HeadingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading: ImageVector
    @Composable get() = HeadingDefinition.asImageVector()
