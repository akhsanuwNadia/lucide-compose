package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCwClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,12.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,8.0)
                lineTo(21.0,8.0)
                lineTo(21.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(18.700000762939453,5.699999809265137)
                curveTo(16.89756965637207,3.9709718227386475,14.497654914855957,3.0038416385650635,12.0,3.0)
                curveTo(7.029437065124512,3.0,3.0,7.029437065124512,3.0,12.0)
                curveTo(3.0,16.970561981201172,7.029437065124512,21.0,12.0,21.0)
                curveTo(16.970561981201172,21.0,21.0,16.970561981201172,21.0,12.0)
            }
}

public val LucideIcons.All.RotateCwClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCwClock: ImageVector
    @Composable get() = RotateCwClockDefinition.asImageVector()
