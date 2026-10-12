package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCcwClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.0,16.970561981201172,7.029437065124512,21.0,12.0,21.0)
                curveTo(16.970561981201172,21.0,21.0,16.970561981201172,21.0,12.0)
                curveTo(21.0,7.029437065124512,16.970561981201172,3.0,12.0,3.0)
                curveTo(9.483951568603516,3.009464979171753,7.068969249725342,3.9912235736846924,5.260000228881836,5.739999771118164)
                lineTo(3.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.0,8.0)
                lineTo(8.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,12.0)
                lineTo(16.0,14.0)
            }
}

public val LucideIcons.All.RotateCcwClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCcwClock: ImageVector
    @Composable get() = RotateCcwClockDefinition.asImageVector()
