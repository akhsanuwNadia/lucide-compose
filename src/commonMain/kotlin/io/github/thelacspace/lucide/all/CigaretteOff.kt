package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CigaretteOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(3.0,12.0)
                curveTo(2.4477152824401855,12.0,2.0,12.447714805603027,2.0,13.0)
                lineTo(2.0,15.0)
                curveTo(2.0,15.552285194396973,2.4477152824401855,16.0,3.0,16.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                curveTo(18.0,5.5,16.0,5.5,16.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                curveTo(21.552284240722656,12.0,22.0,12.447714805603027,22.0,13.0)
                lineTo(22.0,15.0)
                curveTo(21.999990463256836,15.357256889343262,21.80939292907715,15.687372207641602,21.5,15.866000175476074)
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

public val LucideIcons.All.CigaretteOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CigaretteOff: ImageVector
    @Composable get() = CigaretteOffDefinition.asImageVector()
