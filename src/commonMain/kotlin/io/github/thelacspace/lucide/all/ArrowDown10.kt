package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDown10") { strokeWidth ->
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
                moveTo(17.0,10.0)
                lineTo(17.0,4.0)
                lineTo(15.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,10.0)
                lineTo(19.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,14.0)
                lineTo(19.0,14.0)
                lineTo(19.0,16.0)
                lineTo(19.0,18.0)
                lineTo(19.0,20.0)
                lineTo(15.0,20.0)
                lineTo(15.0,18.0)
                lineTo(15.0,16.0)
                lineTo(15.0,14.0)
                close()
            }
}

public val LucideIcons.All.ArrowDown10Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDown10: ImageVector
    @Composable get() = ArrowDown10Definition.asImageVector()
