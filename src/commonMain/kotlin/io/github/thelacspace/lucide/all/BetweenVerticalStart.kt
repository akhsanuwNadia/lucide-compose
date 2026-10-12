package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BetweenVerticalStart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                lineTo(9.0,8.0)
                lineTo(10.0,8.0)
                lineTo(10.0,21.0)
                lineTo(9.0,21.0)
                lineTo(4.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,8.0)
                lineTo(4.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,2.0)
                lineTo(12.0,5.0)
                lineTo(9.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,8.0)
                lineTo(20.0,8.0)
                lineTo(21.0,8.0)
                lineTo(21.0,21.0)
                lineTo(20.0,21.0)
                lineTo(15.0,21.0)
                lineTo(14.0,21.0)
                lineTo(14.0,8.0)
                lineTo(15.0,8.0)
                close()
            }
}

public val LucideIcons.All.BetweenVerticalStartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BetweenVerticalStart: ImageVector
    @Composable get() = BetweenVerticalStartDefinition.asImageVector()
