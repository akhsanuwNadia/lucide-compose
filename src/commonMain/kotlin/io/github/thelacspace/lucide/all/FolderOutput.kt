package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderOutput") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,7.5)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(7.900000095367432,3.0)
                curveTo(8.579667091369629,2.9933364391326904,9.216197967529297,3.3323171138763428,9.59000015258789,3.9000000953674316)
                lineTo(10.40000057220459,5.100000381469727)
                curveTo(10.769923210144043,5.6617207527160645,11.397414207458496,5.999889850616455,12.070000648498535,6.000000476837158)
                lineTo(20.0,6.000000476837158)
                curveTo(21.104568481445312,6.000000476837158,22.0,6.895430564880371,22.0,8.0)
                lineTo(22.0,18.0)
                curveTo(22.0,19.104570388793945,21.104570388793945,20.0,20.0,20.0)
                lineTo(4.0,20.0)
                curveTo(3.064467191696167,20.02960205078125,2.233532190322876,19.406400680541992,2.0,18.5)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,13.0)
                lineTo(12.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                lineTo(2.0,13.0)
                lineTo(5.0,16.0)
            }
}

public val LucideIcons.All.FolderOutputDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderOutput: ImageVector
    @Composable get() = FolderOutputDefinition.asImageVector()
