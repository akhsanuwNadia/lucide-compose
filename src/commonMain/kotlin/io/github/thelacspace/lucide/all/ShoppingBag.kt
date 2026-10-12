package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShoppingBag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,10.0)
                curveTo(15.990151405334473,12.202156066894531,14.202178001403809,13.98215103149414,12.0,13.98215103149414)
                curveTo(9.797821998596191,13.98215103149414,8.009848594665527,12.202156066894531,8.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.1029999256134033,6.033999919891357)
                lineTo(20.897001266479492,6.033999919891357)
            }
            lucidePath(strokeWidth) {
                moveTo(3.4000000953674316,5.4670000076293945)
                curveTo(3.1403558254241943,5.813192367553711,3.0,6.234259605407715,3.0,6.666999816894531)
                lineTo(3.0,20.0)
                curveTo(3.0,21.104570388793945,3.895430564880371,22.0,5.0,22.0)
                lineTo(19.0,22.0)
                curveTo(20.104570388793945,22.0,21.0,21.104570388793945,21.0,20.0)
                lineTo(21.0,6.666999816894531)
                curveTo(21.0,6.234259605407715,20.859643936157227,5.813192367553711,20.600000381469727,5.4670000076293945)
                lineTo(18.600000381469727,2.799999952316284)
                curveTo(18.222291946411133,2.2963881492614746,17.629514694213867,1.9999998807907104,17.0,2.0)
                lineTo(7.0,2.0)
                curveTo(6.370485305786133,2.0,5.777709007263184,2.2963883876800537,5.400000095367432,2.799999952316284)
                close()
            }
}

public val LucideIcons.All.ShoppingBagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShoppingBag: ImageVector
    @Composable get() = ShoppingBagDefinition.asImageVector()
