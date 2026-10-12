package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dome") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,21.0)
                lineTo(10.0,18.0)
                curveTo(10.004923820495605,16.898921966552734,10.898910522460938,16.00892448425293,12.0,16.00892448425293)
                curveTo(13.101089477539062,16.00892448425293,13.995076179504395,16.898921966552734,14.0,18.0)
                lineTo(14.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(18.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,19.0)
                curveTo(22.0,20.104570388793945,21.104570388793945,21.0,20.0,21.0)
                lineTo(4.0,21.0)
                curveTo(2.895430564880371,21.0,2.0,20.104570388793945,2.0,19.0)
                lineTo(2.0,13.0)
                curveTo(2.0,12.447714805603027,2.4477152824401855,12.0,3.0,12.0)
                lineTo(21.0,12.0)
                curveTo(21.552284240722656,12.0,22.0,12.447714805603027,22.0,13.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                curveTo(4.0196967124938965,7.595687389373779,7.595643043518066,4.035696983337402,12.0,4.035696983337402)
                curveTo(16.404356002807617,4.035696983337402,19.980302810668945,7.595687389373779,20.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(6.0,21.0)
            }
}

public val LucideIcons.All.DomeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dome: ImageVector
    @Composable get() = DomeDefinition.asImageVector()
