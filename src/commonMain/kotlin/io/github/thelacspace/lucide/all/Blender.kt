package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Blender") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                curveTo(7.043712615966797,13.999805450439453,6.221085071563721,14.676597595214844,6.036999702453613,15.614999771118164)
                lineTo(5.0189995765686035,20.807998657226562)
                curveTo(4.9616312980651855,21.101228713989258,5.038390159606934,21.40475082397461,5.22825813293457,21.63545799255371)
                curveTo(5.418126106262207,21.86616325378418,5.701210021972656,21.999881744384766,6.0,22.0)
                lineTo(18.0,22.0)
                curveTo(18.298789978027344,21.999881744384766,18.581872940063477,21.86616325378418,18.77174186706543,21.63545799255371)
                curveTo(18.96160888671875,21.404752731323242,19.038368225097656,21.10123062133789,18.981000900268555,20.808000564575195)
                lineTo(17.963001251220703,15.61500072479248)
                curveTo(17.778915405273438,14.676597595214844,16.956287384033203,13.999805450439453,16.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,2.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.005999565124512,14.0)
                lineTo(7.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.565000057220459,8.786999702453613)
                curveTo(9.084470748901367,9.24311351776123,10.730237007141113,8.951069831848145,12.0,8.0)
                curveTo(13.306356430053711,7.020427227020264,15.008719444274902,6.740433216094971,16.559999465942383,7.25)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,2.0)
                lineTo(5.0,2.0)
                curveTo(3.895430564880371,2.0,3.0,2.895430564880371,3.0,4.0)
                lineTo(3.0,9.0)
                curveTo(3.00274658203125,9.575718879699707,3.2534592151641846,10.122330665588379,3.687999963760376,10.5)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.010000228881836,18.0)
            }
}

public val LucideIcons.All.BlenderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Blender: ImageVector
    @Composable get() = BlenderDefinition.asImageVector()
