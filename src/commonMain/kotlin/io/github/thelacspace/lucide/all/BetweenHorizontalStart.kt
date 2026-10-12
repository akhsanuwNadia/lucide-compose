package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BetweenHorizontalStart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,3.0)
                lineTo(20.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,10.0)
                lineTo(20.0,10.0)
                lineTo(9.0,10.0)
                lineTo(8.0,10.0)
                lineTo(8.0,3.0)
                lineTo(9.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                lineTo(5.0,12.0)
                lineTo(2.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,14.0)
                lineTo(20.0,14.0)
                lineTo(21.0,14.0)
                lineTo(21.0,21.0)
                lineTo(20.0,21.0)
                lineTo(9.0,21.0)
                lineTo(8.0,21.0)
                lineTo(8.0,14.0)
                lineTo(9.0,14.0)
                close()
            }
}

public val LucideIcons.All.BetweenHorizontalStartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BetweenHorizontalStart: ImageVector
    @Composable get() = BetweenHorizontalStartDefinition.asImageVector()
