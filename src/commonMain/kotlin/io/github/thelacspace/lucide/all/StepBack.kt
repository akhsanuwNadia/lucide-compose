package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StepBack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.970999717712402,4.284999847412109)
                curveTo(14.588863372802734,3.9142770767211914,15.358380317687988,3.9045677185058594,15.98540210723877,4.259582996368408)
                curveTo(16.612422943115234,4.614598274230957,17.00000762939453,5.279450416564941,17.0,6.0)
                lineTo(17.0,18.0)
                curveTo(17.00000762939453,18.720548629760742,16.612422943115234,19.38540267944336,15.98540210723877,19.74041748046875)
                curveTo(15.358380317687988,20.09543228149414,14.588863372802734,20.085721969604492,13.970999717712402,19.71500015258789)
                lineTo(3.9739999771118164,13.717000007629395)
                curveTo(3.3703134059906006,13.356314659118652,3.000413179397583,12.705079078674316,2.999798536300659,12.001850128173828)
                curveTo(2.9991836547851562,11.29862117767334,3.3679447174072266,10.646739959716797,3.9709999561309814,10.28499984741211)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,20.0)
                lineTo(21.0,4.0)
            }
}

public val LucideIcons.All.StepBackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StepBack: ImageVector
    @Composable get() = StepBackDefinition.asImageVector()
