package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDown01") { strokeWidth ->
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
                moveTo(15.0,4.0)
                lineTo(19.0,4.0)
                lineTo(19.0,6.0)
                lineTo(19.0,8.0)
                lineTo(19.0,10.0)
                lineTo(15.0,10.0)
                lineTo(15.0,8.0)
                lineTo(15.0,6.0)
                lineTo(15.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,20.0)
                lineTo(17.0,14.0)
                lineTo(15.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,20.0)
                lineTo(19.0,20.0)
            }
}

public val LucideIcons.All.ArrowDown01Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDown01: ImageVector
    @Composable get() = ArrowDown01Definition.asImageVector()
