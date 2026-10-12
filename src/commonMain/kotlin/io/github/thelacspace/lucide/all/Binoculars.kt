package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Binoculars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,7.0)
                lineTo(19.0,4.0)
                curveTo(19.0,3.4477152824401855,18.552284240722656,3.0,18.0,3.0)
                lineTo(16.0,3.0)
                curveTo(15.447714805603027,3.0,15.0,3.4477152824401855,15.0,4.0)
                lineTo(15.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,21.0)
                curveTo(21.104570388793945,21.0,22.0,20.104570388793945,22.0,19.0)
                lineTo(22.0,15.14900016784668)
                curveTo(22.0,13.758999824523926,20.0,12.187000274658203,20.0,10.319999694824219)
                lineTo(20.0,8.0)
                curveTo(20.0,7.4477152824401855,19.552284240722656,7.0,19.0,7.0)
                lineTo(15.0,7.0)
                curveTo(14.447714805603027,7.0,14.0,7.4477152824401855,14.0,8.0)
                lineTo(14.0,19.0)
                curveTo(14.0,20.104570388793945,14.895430564880371,21.0,16.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,16.0)
                lineTo(2.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,21.0)
                curveTo(2.895430564880371,21.0,2.0,20.104570388793945,2.0,19.0)
                lineTo(2.0,15.14900016784668)
                curveTo(2.0,13.758999824523926,4.0,12.187000274658203,4.0,10.319999694824219)
                lineTo(4.0,8.0)
                curveTo(4.0,7.4477152824401855,4.4477152824401855,7.0,5.0,7.0)
                lineTo(9.0,7.0)
                curveTo(9.552285194396973,7.0,10.0,7.4477152824401855,10.0,8.0)
                lineTo(10.0,19.0)
                curveTo(10.0,20.104570388793945,9.104569435119629,21.0,8.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,7.0)
                lineTo(9.0,4.0)
                curveTo(9.0,3.4477152824401855,8.552285194396973,3.0,8.0,3.0)
                lineTo(6.0,3.0)
                curveTo(5.4477152824401855,3.0,5.0,3.4477152824401855,5.0,4.0)
                lineTo(5.0,7.0)
            }
}

public val LucideIcons.All.BinocularsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Binoculars: ImageVector
    @Composable get() = BinocularsDefinition.asImageVector()
