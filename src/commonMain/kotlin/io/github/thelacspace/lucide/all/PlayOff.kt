package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlayOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.21500015258789,4.559999942779541)
                lineTo(20.005001068115234,10.270000457763672)
                curveTo(20.621145248413086,10.627519607543945,21.00061798095703,11.28577995300293,21.001235961914062,11.998137474060059)
                curveTo(21.001853942871094,12.710494995117188,20.623523712158203,13.369412422180176,20.00800132751465,13.72800064086914)
                lineTo(19.615001678466797,13.958000183105469)
            }
            lucidePath(strokeWidth) {
                moveTo(16.04199981689453,16.04199981689453)
                lineTo(8.007999420166016,20.72800064086914)
                curveTo(7.389337539672852,21.08901023864746,6.624849319458008,21.09160614013672,6.003750801086426,20.734804153442383)
                curveTo(5.3826518058776855,20.378002166748047,4.9997878074646,19.716289520263672,5.0,19.0)
                lineTo(5.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.PlayOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlayOff: ImageVector
    @Composable get() = PlayOffDefinition.asImageVector()
