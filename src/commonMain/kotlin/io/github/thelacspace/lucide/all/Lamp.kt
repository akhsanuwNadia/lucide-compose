package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lamp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.077000141143799,10.614999771118164)
                curveTo(3.948240041732788,10.923661231994629,3.9823052883148193,11.27625846862793,4.167773723602295,11.554561614990234)
                curveTo(4.35324239730835,11.832864761352539,4.665558338165283,12.000027656555176,5.0,12.0)
                lineTo(19.0,12.0)
                curveTo(19.334442138671875,12.000027656555176,19.646757125854492,11.832864761352539,19.832225799560547,11.554561614990234)
                curveTo(20.0176944732666,11.27625846862793,20.051759719848633,10.923662185668945,19.92300033569336,10.614999771118164)
                lineTo(16.84600067138672,3.2309999465942383)
                curveTo(16.535554885864258,2.4856669902801514,15.807401657104492,2.000100612640381,15.0,2.0)
                lineTo(9.0,2.0)
                curveTo(8.192840576171875,1.9999327659606934,7.464756488800049,2.4850594997406006,7.154000282287598,3.2300000190734863)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,20.0)
                curveTo(8.0,18.895429611206055,8.895430564880371,18.0,10.0,18.0)
                lineTo(14.0,18.0)
                curveTo(15.104569435119629,18.0,16.0,18.895429611206055,16.0,20.0)
                lineTo(16.0,21.0)
                curveTo(16.0,21.552284240722656,15.552285194396973,22.0,15.0,22.0)
                lineTo(9.0,22.0)
                curveTo(8.447714805603027,22.0,8.0,21.552284240722656,8.0,21.0)
                close()
            }
}

public val LucideIcons.All.LampDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lamp: ImageVector
    @Composable get() = LampDefinition.asImageVector()
