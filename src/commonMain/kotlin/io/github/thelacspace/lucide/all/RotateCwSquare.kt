package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCwSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                lineTo(6.0,5.0)
                curveTo(4.895430564880371,5.0,4.0,5.895430564880371,4.0,7.0)
                lineTo(4.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,8.0)
                lineTo(12.0,5.0)
                lineTo(9.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(4.0,18.0)
                curveTo(4.0,19.104570388793945,4.895430564880371,20.0,6.0,20.0)
                lineTo(18.0,20.0)
                curveTo(19.104570388793945,20.0,20.0,19.104570388793945,20.0,18.0)
                lineTo(20.0,7.0)
                curveTo(20.0,5.895430564880371,19.104570388793945,5.0,18.0,5.0)
                lineTo(16.0,5.0)
            }
}

public val LucideIcons.All.RotateCwSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCwSquare: ImageVector
    @Composable get() = RotateCwSquareDefinition.asImageVector()
