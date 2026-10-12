package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Leaf") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,20.0)
                curveTo(16.52284812927246,20.0,21.0,15.522847175598145,21.0,10.0)
                curveTo(21.001453399658203,7.535884380340576,20.651256561279297,5.084170341491699,19.959999084472656,2.7189998626708984)
                curveTo(19.853954315185547,2.3570525646209717,19.553285598754883,2.085559368133545,19.18242835998535,2.0168821811676025)
                curveTo(18.81157112121582,1.9482048749923706,18.433622360229492,2.0940277576446533,18.204999923706055,2.3939998149871826)
                curveTo(15.833000183105469,5.5,13.0,5.5,9.800000190734863,6.099999904632568)
                curveTo(6.211230754852295,6.713101387023926,3.691589117050171,9.974837303161621,4.004734992980957,13.6021089553833)
                curveTo(4.317880630493164,17.229381561279297,7.3592529296875,20.011030197143555,11.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                curveTo(1.9994901418685913,19.04676628112793,3.13641095161438,17.27206039428711,4.9110002517700195,16.45599937438965)
                curveTo(7.61299991607666,15.211999893188477,8.35099983215332,15.239999771118164,11.0,13.0)
            }
}

public val LucideIcons.All.LeafDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Leaf: ImageVector
    @Composable get() = LeafDefinition.asImageVector()
