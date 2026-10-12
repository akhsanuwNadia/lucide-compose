package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Church") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,9.0)
                lineTo(14.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,21.0)
                lineTo(14.0,18.0)
                curveTo(13.995076179504395,16.898921966552734,13.101089477539062,16.00892448425293,12.0,16.00892448425293)
                curveTo(10.898910522460938,16.00892448425293,10.004923820495605,16.898921966552734,10.0,18.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,9.0)
                lineTo(21.520000457763672,11.147000312805176)
                curveTo(21.818029403686523,11.328434944152832,21.999942779541016,11.652088165283203,22.0,12.00100040435791)
                lineTo(22.0,19.0)
                curveTo(22.0,20.104570388793945,21.104570388793945,21.0,20.0,21.0)
                lineTo(4.0,21.0)
                curveTo(2.895430564880371,21.0,2.0,20.104570388793945,2.0,19.0)
                lineTo(2.0,12.000999450683594)
                curveTo(2.0000579357147217,11.652087211608887,2.1819710731506348,11.328433990478516,2.4800000190734863,11.14699935913086)
                lineTo(6.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,21.0)
                lineTo(6.0,7.0)
                curveTo(5.9998250007629395,6.69570255279541,6.138214111328125,6.407881736755371,6.375999927520752,6.2179999351501465)
                lineTo(11.375999450683594,2.2189998626708984)
                curveTo(11.741378784179688,1.9273253679275513,12.260087013244629,1.9277406930923462,12.624999046325684,2.2199997901916504)
                lineTo(17.625,6.21999979019165)
                curveTo(17.86186408996582,6.409642219543457,17.99981117248535,6.696572303771973,18.0,7.0)
                lineTo(18.0,21.0)
            }
}

public val LucideIcons.All.ChurchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Church: ImageVector
    @Composable get() = ChurchDefinition.asImageVector()
