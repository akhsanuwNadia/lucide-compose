package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Logs") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(4.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                lineTo(4.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,5.0)
                lineTo(9.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(9.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,19.0)
                lineTo(9.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,5.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,19.0)
                lineTo(21.0,19.0)
            }
}

public val LucideIcons.All.LogsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Logs: ImageVector
    @Composable get() = LogsDefinition.asImageVector()
