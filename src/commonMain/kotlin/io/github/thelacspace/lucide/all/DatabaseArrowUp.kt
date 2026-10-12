package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,22.0f)
                lineTo(19.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.536f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,19.0f)
                lineTo(19.0f,16.0f)
                lineTo(16.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(3.0000398f,12.94042f,4.3230233f,13.826416f,6.573864f,14.393399f)
                curveTo(8.824705f,14.9603815f,11.742908f,15.142735f,14.457f,14.886f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(2.9997f,19.872393f,4.1386642f,20.701618f,6.1200686f,21.271574f)
                curveTo(8.101474f,21.841532f,10.729038f,22.095757f,13.318f,21.968f)
            }
}

public val LucideIcons.All.DatabaseArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseArrowUp: ImageVector
    @Composable get() = DatabaseArrowUpDefinition.asImageVector()
