package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BetweenVerticalEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(9.0,3.0)
                lineTo(10.0,3.0)
                lineTo(10.0,16.0)
                lineTo(9.0,16.0)
                lineTo(4.0,16.0)
                lineTo(3.0,16.0)
                lineTo(3.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,22.0)
                lineTo(12.0,19.0)
                lineTo(15.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,3.0)
                lineTo(20.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,16.0)
                lineTo(20.0,16.0)
                lineTo(15.0,16.0)
                lineTo(14.0,16.0)
                lineTo(14.0,3.0)
                lineTo(15.0,3.0)
                close()
            }
}

public val LucideIcons.All.BetweenVerticalEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BetweenVerticalEnd: ImageVector
    @Composable get() = BetweenVerticalEndDefinition.asImageVector()
