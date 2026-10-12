package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeftRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(4.0,7.0)
                lineTo(8.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,7.0)
                lineTo(20.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,21.0)
                lineTo(20.0,17.0)
                lineTo(16.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,17.0)
                lineTo(4.0,17.0)
            }
}

public val LucideIcons.All.ArrowLeftRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeftRight: ImageVector
    @Composable get() = ArrowLeftRightDefinition.asImageVector()
