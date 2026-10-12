package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotebookTabs") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,6.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(6.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.0f)
                lineTo(6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,18.0f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(18.0f,2.0f)
                lineTo(20.0f,2.0f)
                lineTo(20.0f,22.0f)
                lineTo(18.0f,22.0f)
                lineTo(6.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(4.0f,2.0f)
                lineTo(6.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,2.0f)
                lineTo(15.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,7.0f)
                lineTo(20.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(20.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,17.0f)
                lineTo(20.0f,17.0f)
            }
}

public val LucideIcons.All.NotebookTabsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotebookTabs: ImageVector
    @Composable get() = NotebookTabsDefinition.asImageVector()
