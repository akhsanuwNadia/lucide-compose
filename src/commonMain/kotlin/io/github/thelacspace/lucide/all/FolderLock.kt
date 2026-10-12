package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,17.0)
                lineTo(21.0,17.0)
                lineTo(22.0,17.0)
                lineTo(22.0,22.0)
                lineTo(21.0,22.0)
                lineTo(15.0,22.0)
                lineTo(14.0,22.0)
                lineTo(14.0,17.0)
                lineTo(15.0,17.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,20.0)
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
                lineTo(22.0,10.5)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,17.0)
                lineTo(20.0,15.0)
                curveTo(20.003204345703125,14.28333854675293,19.622709274291992,13.619739532470703,19.00259017944336,13.260479927062988)
                curveTo(18.38247299194336,12.90122127532959,17.61752700805664,12.90122127532959,16.99740982055664,13.260479927062988)
                curveTo(16.377290725708008,13.619739532470703,15.996794700622559,14.28333854675293,16.0,15.0)
                lineTo(16.0,17.0)
            }
}

public val LucideIcons.All.FolderLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderLock: ImageVector
    @Composable get() = FolderLockDefinition.asImageVector()
