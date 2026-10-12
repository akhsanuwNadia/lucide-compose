package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shuffle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,14.0)
                lineTo(22.0,18.0)
                lineTo(18.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,2.0)
                lineTo(22.0,6.0)
                lineTo(18.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,18.0)
                lineTo(3.9730000495910645,18.0)
                curveTo(5.2852654457092285,18.008962631225586,6.518460273742676,17.373680114746094,7.2729997634887695,16.299999237060547)
                lineTo(12.726999282836914,7.69999885559082)
                curveTo(13.481538772583008,6.626318454742432,14.714733123779297,5.9910359382629395,16.02699851989746,5.999999046325684)
                lineTo(22.0,5.999999046325684)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,6.0)
                lineTo(3.9720001220703125,6.0)
                curveTo(5.4926276206970215,5.989417552947998,6.88773775100708,6.841984748840332,7.572000026702881,8.199999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,18.0)
                lineTo(15.958999633789062,18.0)
                curveTo(14.628029823303223,17.986425399780273,13.39100170135498,17.311683654785156,12.6589994430542,16.200000762939453)
                lineTo(12.299999237060547,15.750000953674316)
            }
}

public val LucideIcons.All.ShuffleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shuffle: ImageVector
    @Composable get() = ShuffleDefinition.asImageVector()
