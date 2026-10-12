package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cigarette") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,12.0)
                lineTo(3.0,12.0)
                curveTo(2.4477152824401855,12.0,2.0,12.447714805603027,2.0,13.0)
                lineTo(2.0,15.0)
                curveTo(2.0,15.552285194396973,2.4477152824401855,16.0,3.0,16.0)
                lineTo(17.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                curveTo(18.0,5.5,16.0,5.5,16.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,16.0)
                curveTo(21.552284240722656,16.0,22.0,15.552285194396973,22.0,15.0)
                lineTo(22.0,13.0)
                curveTo(22.0,12.447714805603027,21.552284240722656,12.0,21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,8.0)
                curveTo(22.0,5.5,20.0,5.5,20.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                lineTo(7.0,16.0)
            }
}

public val LucideIcons.All.CigaretteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cigarette: ImageVector
    @Composable get() = CigaretteDefinition.asImageVector()
