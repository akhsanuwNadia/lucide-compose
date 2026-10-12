package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Podium") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,2.0)
                lineTo(11.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,15.0)
                curveTo(9.0,14.447714805603027,8.552285194396973,14.0,8.0,14.0)
                lineTo(4.0,14.0)
                curveTo(3.4477152824401855,14.0,3.0,14.447714805603027,3.0,15.0)
                lineTo(3.0,20.0)
                curveTo(3.0,20.552284240722656,3.4477152824401855,21.0,4.0,21.0)
                lineTo(20.0,21.0)
                curveTo(20.552284240722656,21.0,21.0,20.552284240722656,21.0,20.0)
                lineTo(21.0,17.0)
                curveTo(21.0,16.447715759277344,20.552284240722656,16.0,20.0,16.0)
                lineTo(16.0,16.0)
                curveTo(15.447714805603027,16.0,15.0,16.447715759277344,15.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                lineTo(9.0,11.0)
                curveTo(9.0,10.447714805603027,9.447714805603027,10.0,10.0,10.0)
                lineTo(14.0,10.0)
                curveTo(14.552285194396973,10.0,15.0,10.447714805603027,15.0,11.0)
                lineTo(15.0,21.0)
            }
}

public val LucideIcons.All.PodiumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Podium: ImageVector
    @Composable get() = PodiumDefinition.asImageVector()
