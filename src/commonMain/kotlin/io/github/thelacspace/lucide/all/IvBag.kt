package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IvBag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,20.0)
                curveTo(12.0,21.104570388793945,12.895430564880371,22.0,14.0,22.0)
                lineTo(20.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,11.0)
                curveTo(6.720000267028809,11.5,7.440000057220459,12.0,9.0,12.0)
                curveTo(12.0,12.0,12.0,10.0,15.0,10.0)
                curveTo(16.559999465942383,10.0,17.280000686645508,10.5,18.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.293000221252441,3.0)
                curveTo(9.746000289916992,3.0,10.180000305175781,2.819999933242798,10.5,2.5)
                curveTo(10.819999694824219,2.180000066757202,11.253999710083008,2.0,11.706999778747559,2.0)
                lineTo(12.293000221252441,2.0)
                curveTo(12.746000289916992,2.0,13.180000305175781,2.180000066757202,13.5,2.5)
                curveTo(13.819999694824219,2.819999933242798,14.253999710083008,3.0,14.706999778747559,3.0)
                lineTo(16.0,3.0)
                curveTo(17.104570388793945,3.0,18.0,3.895430564880371,18.0,5.0)
                lineTo(18.0,16.0)
                curveTo(18.0,17.104570388793945,17.104570388793945,18.0,16.0,18.0)
                lineTo(8.0,18.0)
                curveTo(6.895430564880371,18.0,6.0,17.104570388793945,6.0,16.0)
                lineTo(6.0,5.0)
                curveTo(6.0,3.895430564880371,6.895430564880371,3.0,8.0,3.0)
                close()
            }
}

public val LucideIcons.All.IvBagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IvBag: ImageVector
    @Composable get() = IvBagDefinition.asImageVector()
