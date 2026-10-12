package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotepadText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(8.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,4.0)
                lineTo(18.0,4.0)
                lineTo(20.0,4.0)
                lineTo(20.0,22.0)
                lineTo(18.0,22.0)
                lineTo(6.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,4.0)
                lineTo(6.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.0)
                lineTo(14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(13.0,18.0)
            }
}

public val LucideIcons.All.NotepadTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotepadText: ImageVector
    @Composable get() = NotepadTextDefinition.asImageVector()
