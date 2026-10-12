package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownWideNarrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,16.0)
                lineTo(7.0,20.0)
                lineTo(11.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,20.0)
                lineTo(7.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,4.0)
                lineTo(21.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,8.0)
                lineTo(18.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,12.0)
                lineTo(15.0,12.0)
            }
}

public val LucideIcons.All.ArrowDownWideNarrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownWideNarrow: ImageVector
    @Composable get() = ArrowDownWideNarrowDefinition.asImageVector()
