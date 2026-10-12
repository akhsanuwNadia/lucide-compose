package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Play") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,5.0)
                curveTo(4.9997878074646,4.283710479736328,5.382652282714844,3.621997833251953,6.003750801086426,3.2651965618133545)
                curveTo(6.624849319458008,2.9083950519561768,7.389337539672852,2.910989999771118,8.007999420166016,3.2719998359680176)
                lineTo(20.0049991607666,10.270000457763672)
                curveTo(20.621143341064453,10.627519607543945,21.0006160736084,11.28577995300293,21.00123405456543,11.998137474060059)
                curveTo(21.00185203552246,12.710494995117188,20.62352180480957,13.369412422180176,20.007999420166016,13.72800064086914)
                lineTo(8.007999420166016,20.72800064086914)
                curveTo(7.389337539672852,21.08901023864746,6.624849319458008,21.09160614013672,6.003750801086426,20.734804153442383)
                curveTo(5.3826518058776855,20.378002166748047,4.9997878074646,19.716289520263672,5.0,19.0)
                close()
            }
}

public val LucideIcons.All.PlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Play: ImageVector
    @Composable get() = PlayDefinition.asImageVector()
