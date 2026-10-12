package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(19.0,21.0)
                curveTo(20.104570388793945,21.0,21.0,20.104570388793945,21.0,19.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.375,2.625)
                curveTo(19.20450210571289,1.8028844594955444,20.542490005493164,1.80587637424469,21.36830711364746,2.631693124771118)
                curveTo(22.194124221801758,3.457509994506836,22.197114944458008,4.795498371124268,21.375,5.625)
                lineTo(12.362000465393066,14.638999938964844)
                curveTo(12.124549865722656,14.876246452331543,11.831206321716309,15.04991340637207,11.509000778198242,15.144000053405762)
                lineTo(8.636000633239746,15.984000205993652)
                curveTo(8.460735321044922,16.035120010375977,8.2715425491333,15.986648559570312,8.142447471618652,15.857553482055664)
                curveTo(8.013352394104004,15.728458404541016,7.964881896972656,15.539265632629395,8.016000747680664,15.36400032043457)
                lineTo(8.856000900268555,12.491000175476074)
                curveTo(8.95052719116211,12.169051170349121,9.124534606933594,11.876057624816895,9.362000465393066,11.638999938964844)
                close()
            }
}

public val LucideIcons.All.SquarePenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePen: ImageVector
    @Composable get() = SquarePenDefinition.asImageVector()
