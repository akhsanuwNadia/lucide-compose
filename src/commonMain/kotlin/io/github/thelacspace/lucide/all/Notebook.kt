package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Notebook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,6.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(6.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,18.0)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(18.0,2.0)
                lineTo(20.0,2.0)
                lineTo(20.0,22.0)
                lineTo(18.0,22.0)
                lineTo(6.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,2.0)
                lineTo(6.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,22.0)
            }
}

public val LucideIcons.All.NotebookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Notebook: ImageVector
    @Composable get() = NotebookDefinition.asImageVector()
