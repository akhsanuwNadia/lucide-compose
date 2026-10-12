package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampDesk") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.293000221252441,2.2929999828338623)
                curveTo(10.683500289916992,1.9026176929473877,11.316500663757324,1.9026176929473877,11.707000732421875,2.2929999828338623)
                lineTo(14.207000732421875,4.793000221252441)
                lineTo(20.201000213623047,6.020000457763672)
                curveTo(20.56150245666504,6.093908309936523,20.852279663085938,6.359843730926514,20.958003997802734,6.712328910827637)
                curveTo(21.063730239868164,7.06481409072876,20.967313766479492,7.446884632110596,20.707000732421875,7.707000732421875)
                lineTo(13.707000732421875,14.707000732421875)
                curveTo(13.446885108947754,14.967314720153809,13.064814567565918,15.063729286193848,12.712328910827637,14.95800495147705)
                curveTo(12.359844207763672,14.852280616760254,12.093908309936523,14.561502456665039,12.020000457763672,14.201001167297363)
                lineTo(10.793000221252441,8.207000732421875)
                lineTo(8.293000221252441,5.707000732421875)
                curveTo(7.902618408203125,5.316500663757324,7.902618408203125,4.68350076675415,8.293000221252441,4.2930006980896)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.206999778747559,4.793000221252441)
                lineTo(10.792999267578125,8.207000732421875)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,20.0)
                curveTo(3.0,18.895429611206055,3.895430564880371,18.0,5.0,18.0)
                lineTo(9.0,18.0)
                curveTo(10.104569435119629,18.0,11.0,18.895429611206055,11.0,20.0)
                lineTo(11.0,21.0)
                curveTo(11.0,21.552284240722656,10.552285194396973,22.0,10.0,22.0)
                lineTo(4.0,22.0)
                curveTo(3.4477152824401855,22.0,3.0,21.552284240722656,3.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.086000442504883,6.5)
                lineTo(4.293000221252441,11.293000221252441)
                curveTo(3.9838175773620605,11.601784706115723,3.9109292030334473,12.075560569763184,4.113000392913818,12.463000297546387)
                lineTo(7.0,18.0)
            }
}

public val LucideIcons.All.LampDeskDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampDesk: ImageVector
    @Composable get() = LampDeskDefinition.asImageVector()
