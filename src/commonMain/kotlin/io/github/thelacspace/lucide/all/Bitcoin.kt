package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bitcoin") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.767000198364258,19.089000701904297)
                curveTo(16.69099998474121,19.957000732421875,17.906999588012695,13.064001083374023,12.982999801635742,12.195000648498535)
                moveTo(11.767000198364258,19.089000701904297)
                lineTo(5.860000133514404,18.047000885009766)
                moveTo(11.767999649047852,19.089000701904297)
                lineTo(11.420999526977539,21.05900001525879)
                moveTo(12.983999252319336,12.194999694824219)
                curveTo(17.90799903869629,13.064000129699707,19.123998641967773,6.169999599456787,14.198999404907227,5.301999568939209)
                moveTo(12.983999252319336,12.194999694824219)
                lineTo(9.043998718261719,11.500999450683594)
                moveTo(14.198999404907227,5.300999641418457)
                lineTo(8.289999961853027,4.260000228881836)
                moveTo(14.197999954223633,5.302000045776367)
                lineTo(14.545999526977539,3.3320000171661377)
                moveTo(7.480000019073486,20.36400032043457)
                lineTo(10.605999946594238,2.6370010375976562)
            }
}

public val LucideIcons.All.BitcoinDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bitcoin: ImageVector
    @Composable get() = BitcoinDefinition.asImageVector()
