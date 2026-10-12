package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowRightLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                lineTo(20.0f,7.0f)
                lineTo(16.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,7.0f)
                lineTo(4.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(4.0f,17.0f)
                lineTo(8.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,17.0f)
                lineTo(20.0f,17.0f)
            }
}

public val LucideIcons.All.ArrowRightLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowRightLeft: ImageVector
    @Composable get() = ArrowRightLeftDefinition.asImageVector()
