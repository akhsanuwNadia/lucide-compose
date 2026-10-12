package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,19.0f)
                lineTo(19.0f,22.0f)
                lineTo(22.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,16.0f)
                lineTo(19.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.536f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(3.0002372f,12.985273f,4.4518414f,13.9077015f,6.88356f,14.467823f)
                curveTo(9.315278f,15.027945f,12.417085f,15.154348f,15.182f,14.806f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(2.9997f,19.872393f,4.1386642f,20.701618f,6.1200686f,21.271574f)
                curveTo(8.101474f,21.841532f,10.729038f,22.095757f,13.318f,21.968f)
            }
}

public val LucideIcons.All.DatabaseArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseArrowDown: ImageVector
    @Composable get() = DatabaseArrowDownDefinition.asImageVector()
