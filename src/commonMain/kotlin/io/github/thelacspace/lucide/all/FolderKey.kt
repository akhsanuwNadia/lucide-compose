package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(7.900000095367432,3.0)
                curveTo(8.579667091369629,2.9933364391326904,9.216197967529297,3.3323171138763428,9.59000015258789,3.9000000953674316)
                lineTo(10.40000057220459,5.100000381469727)
                curveTo(10.769923210144043,5.6617207527160645,11.397414207458496,5.999889850616455,12.070000648498535,6.000000476837158)
                lineTo(20.0,6.000000476837158)
                curveTo(21.104568481445312,6.000000476837158,22.0,6.895430564880371,22.0,8.0)
                lineTo(22.0,9.359999656677246)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,12.0)
                lineTo(19.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,14.0)
                lineTo(21.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,20.0)
                curveTo(16.996795654296875,20.71666145324707,17.377290725708008,21.380260467529297,17.99740982055664,21.739519119262695)
                curveTo(18.61752700805664,22.098779678344727,19.38247299194336,22.098779678344727,20.00259017944336,21.739519119262695)
                curveTo(20.622709274291992,21.380260467529297,21.003204345703125,20.71666145324707,21.0,20.0)
                curveTo(21.003204345703125,19.28333854675293,20.622709274291992,18.619739532470703,20.00259017944336,18.260480880737305)
                curveTo(19.38247299194336,17.901220321655273,18.61752700805664,17.901220321655273,17.99740982055664,18.260480880737305)
                curveTo(17.377290725708008,18.619739532470703,16.996795654296875,19.28333854675293,17.0,20.0)
            }
}

public val LucideIcons.All.FolderKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderKey: ImageVector
    @Composable get() = FolderKeyDefinition.asImageVector()
