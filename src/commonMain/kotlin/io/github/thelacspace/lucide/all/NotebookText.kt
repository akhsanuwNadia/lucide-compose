package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotebookText") { strokeWidth ->
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
                moveTo(9.5,8.0)
                lineTo(14.5,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,12.0)
                lineTo(16.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,16.0)
                lineTo(14.0,16.0)
            }
}

public val LucideIcons.All.NotebookTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotebookText: ImageVector
    @Composable get() = NotebookTextDefinition.asImageVector()
