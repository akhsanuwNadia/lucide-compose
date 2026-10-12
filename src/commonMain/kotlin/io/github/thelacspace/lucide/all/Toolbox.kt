package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Toolbox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,6.0)
                lineTo(16.0,4.0)
                curveTo(16.0,2.895430564880371,15.104569435119629,2.0,14.0,2.0)
                lineTo(10.0,2.0)
                curveTo(8.895430564880371,2.0,8.0,2.895430564880371,8.0,4.0)
                lineTo(8.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,6.0)
                curveTo(17.5303897857666,6.000113487243652,18.03901481628418,6.210901260375977,18.413999557495117,6.585999965667725)
                lineTo(21.413999557495117,9.586000442504883)
                curveTo(21.789098739624023,9.960986137390137,21.99988555908203,10.469610214233398,22.0,11.0)
                lineTo(22.0,19.0)
                curveTo(22.0,20.104570388793945,21.104570388793945,21.0,20.0,21.0)
                lineTo(4.0,21.0)
                curveTo(2.895430564880371,21.0,2.0,20.104570388793945,2.0,19.0)
                lineTo(2.0,11.0)
                curveTo(2.0001134872436523,10.469610214233398,2.2109012603759766,9.960986137390137,2.5859999656677246,9.586000442504883)
                lineTo(5.585999965667725,6.586000442504883)
                curveTo(5.96098518371582,6.210901737213135,6.469610214233398,6.000113487243652,7.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(22.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(8.0,16.0)
            }
}

public val LucideIcons.All.ToolboxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Toolbox: ImageVector
    @Composable get() = ToolboxDefinition.asImageVector()
