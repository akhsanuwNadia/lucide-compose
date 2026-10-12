package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StepForward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.029000282287598,4.284999847412109)
                curveTo(9.411136627197266,3.9142770767211914,8.641619682312012,3.9045677185058594,8.01459789276123,4.259582996368408)
                curveTo(7.387577056884766,4.614598274230957,6.999992847442627,5.279450416564941,7.0,6.0)
                lineTo(7.0,18.0)
                curveTo(6.999992847442627,18.720548629760742,7.387577056884766,19.38540267944336,8.01459789276123,19.74041748046875)
                curveTo(8.641619682312012,20.09543228149414,9.411136627197266,20.085721969604492,10.029000282287598,19.71500015258789)
                lineTo(20.0260009765625,13.717000007629395)
                curveTo(20.629688262939453,13.356314659118652,20.999588012695312,12.705079078674316,21.000202178955078,12.001850128173828)
                curveTo(21.000818252563477,11.29862117767334,20.632057189941406,10.646739959716797,20.029001235961914,10.28499984741211)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,4.0)
                lineTo(3.0,20.0)
            }
}

public val LucideIcons.All.StepForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StepForward: ImageVector
    @Composable get() = StepForwardDefinition.asImageVector()
