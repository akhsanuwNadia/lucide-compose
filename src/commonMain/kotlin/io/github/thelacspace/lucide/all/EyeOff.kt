package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EyeOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.732999801635742,5.076000213623047)
                curveTo(15.52013874053955,4.5055084228515625,20.101173400878906,7.193620681762695,21.937999725341797,11.651000022888184)
                curveTo(22.02134132385254,11.875515937805176,22.02134132385254,12.12248420715332,21.937999725341797,12.347000122070312)
                curveTo(21.570497512817383,13.237995147705078,21.084808349609375,14.075505256652832,20.493999481201172,14.836999893188477)
            }
            lucidePath(strokeWidth) {
                moveTo(14.083999633789062,14.157999992370605)
                curveTo(12.90686321258545,15.294919967651367,11.035743713378906,15.278661727905273,9.878540992736816,14.121459007263184)
                curveTo(8.721338272094727,12.964256286621094,8.705080032348633,11.09313678741455,9.841999053955078,9.916000366210938)
            }
            lucidePath(strokeWidth) {
                moveTo(17.479000091552734,17.499000549316406)
                curveTo(14.79490852355957,19.088947296142578,11.552508354187012,19.434478759765625,8.59363079071045,18.44588279724121)
                curveTo(5.634753704071045,17.457286834716797,3.2512667179107666,15.232081413269043,2.062000274658203,12.348000526428223)
                curveTo(1.9786596298217773,12.12348461151123,1.9786596298217773,11.876516342163086,2.062000274658203,11.652000427246094)
                curveTo(2.9486324787139893,9.501855850219727,4.508673191070557,7.69724702835083,6.508000373840332,6.509000301361084)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.EyeOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EyeOff: ImageVector
    @Composable get() = EyeOffDefinition.asImageVector()
