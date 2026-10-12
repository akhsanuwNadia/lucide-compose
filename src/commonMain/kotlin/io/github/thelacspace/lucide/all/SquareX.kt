package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.0)
                lineTo(9.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                lineTo(15.0,15.0)
            }
}

public val LucideIcons.All.SquareXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareX: ImageVector
    @Composable get() = SquareXDefinition.asImageVector()
