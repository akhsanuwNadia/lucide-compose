package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlugZap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.300000190734863,20.299999237060547)
                curveTo(6.750324726104736,20.751890182495117,7.36203670501709,21.005891799926758,8.0,21.005891799926758)
                curveTo(8.637964248657227,21.005891799926758,9.249676704406738,20.751890182495117,9.700000762939453,20.299999237060547)
                lineTo(12.0,18.0)
                lineTo(6.0,12.0)
                lineTo(3.700000047683716,14.300000190734863)
                curveTo(3.2481091022491455,14.750324249267578,2.994107246398926,15.36203670501709,2.994107246398926,16.0)
                curveTo(2.994107246398926,16.637964248657227,3.2481091022491455,17.249675750732422,3.700000047683716,17.700000762939453)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,22.0)
                lineTo(5.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,13.5)
                lineTo(10.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.5,16.5)
                lineTo(13.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,3.0)
                lineTo(14.0,7.0)
                lineTo(20.0,7.0)
                lineTo(16.0,11.0)
            }
}

public val LucideIcons.All.PlugZapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlugZap: ImageVector
    @Composable get() = PlugZapDefinition.asImageVector()
