package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drill") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,18.0)
                curveTo(10.552285194396973,18.0,11.0,18.447715759277344,11.0,19.0)
                lineTo(11.0,21.0)
                curveTo(11.0,21.552284240722656,10.552285194396973,22.0,10.0,22.0)
                lineTo(5.0,22.0)
                curveTo(3.3431458473205566,22.0,2.0,20.6568546295166,2.0,19.0)
                curveTo(2.0,18.447715759277344,2.4477152824401855,18.0,3.0,18.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,10.0)
                lineTo(4.0,10.0)
                curveTo(2.895430564880371,10.0,2.0,9.104569435119629,2.0,8.0)
                lineTo(2.0,4.0)
                curveTo(2.0,2.895430564880371,2.895430564880371,2.0,4.0,2.0)
                lineTo(13.0,2.0)
                curveTo(13.552285194396973,2.0,14.0,2.4477152824401855,14.0,3.0)
                lineTo(14.0,9.0)
                curveTo(14.0,9.552285194396973,13.552285194396973,10.0,13.0,10.0)
                lineTo(12.1899995803833,13.242000579833984)
                curveTo(12.07892894744873,13.687329292297363,11.678970336914062,13.999874114990234,11.219999313354492,14.000000953674316)
                lineTo(8.0,14.000000953674316)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                lineTo(17.0,4.0)
                curveTo(17.552284240722656,4.0,18.0,4.4477152824401855,18.0,5.0)
                lineTo(18.0,7.0)
                curveTo(18.0,7.5522847175598145,17.552284240722656,8.0,17.0,8.0)
                lineTo(14.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,6.0)
                lineTo(22.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                lineTo(3.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,18.0)
                lineTo(9.0,10.0)
            }
}

public val LucideIcons.All.DrillDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drill: ImageVector
    @Composable get() = DrillDefinition.asImageVector()
