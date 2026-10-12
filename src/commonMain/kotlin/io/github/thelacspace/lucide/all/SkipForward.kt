package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SkipForward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,4.0)
                lineTo(21.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0289998054504395,4.284999847412109)
                curveTo(5.411135673522949,3.9142773151397705,4.6416192054748535,3.9045679569244385,4.014598369598389,4.259583473205566)
                curveTo(3.3875772953033447,4.614598751068115,2.999993085861206,5.2794508934021,3.0,6.0)
                lineTo(3.0,18.0)
                curveTo(2.999992847442627,18.720548629760742,3.3875770568847656,19.38540267944336,4.014598369598389,19.74041748046875)
                curveTo(4.641619682312012,20.09543228149414,5.411136150360107,20.085721969604492,6.029000282287598,19.71500015258789)
                lineTo(16.0260009765625,13.717000007629395)
                curveTo(16.629688262939453,13.356314659118652,16.999588012695312,12.705079078674316,17.000202178955078,12.001850128173828)
                curveTo(17.000818252563477,11.29862117767334,16.632057189941406,10.646739959716797,16.029001235961914,10.28499984741211)
                close()
            }
}

public val LucideIcons.All.SkipForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SkipForward: ImageVector
    @Composable get() = SkipForwardDefinition.asImageVector()
