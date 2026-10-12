package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpNarrowWide") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,8.0f)
                lineTo(7.0f,4.0f)
                lineTo(11.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,4.0f)
                lineTo(7.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                lineTo(15.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,16.0f)
                lineTo(18.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,20.0f)
                lineTo(21.0f,20.0f)
            }
}

public val LucideIcons.All.ArrowUpNarrowWideDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpNarrowWide: ImageVector
    @Composable get() = ArrowUpNarrowWideDefinition.asImageVector()
