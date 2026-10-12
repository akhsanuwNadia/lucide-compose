package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hammer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                lineTo(5.626999855041504,21.373001098632812)
                curveTo(4.797496795654297,22.195392608642578,3.459285259246826,22.192623138427734,2.633193016052246,21.366806030273438)
                curveTo(1.8071010112762451,20.54098892211914,1.8038856983184814,19.202777862548828,2.625999927520752,18.373001098632812)
                lineTo(12.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,15.0)
                lineTo(22.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5,11.5)
                lineTo(19.586000442504883,9.586000442504883)
                curveTo(19.210901260375977,9.211014747619629,19.000112533569336,8.70238971710205,19.0,8.17199993133545)
                lineTo(19.0,7.828000068664551)
                curveTo(18.999887466430664,7.297610282897949,18.789098739624023,6.788985252380371,18.413999557495117,6.414000034332275)
                lineTo(16.756999969482422,4.756999969482422)
                curveTo(15.632124900817871,3.6323153972625732,14.10667896270752,3.0003397464752197,12.515999794006348,3.0)
                lineTo(9.0,3.0)
                lineTo(10.243000030517578,4.243000030517578)
                curveTo(11.367929458618164,5.368120193481445,11.99992561340332,6.893974304199219,12.0,8.484999656677246)
                lineTo(12.0,10.0)
                lineTo(14.0,12.0)
                lineTo(15.17199993133545,12.0)
                curveTo(15.70238971710205,12.000113487243652,16.211015701293945,12.210901260375977,16.586000442504883,12.586000442504883)
                lineTo(18.5,14.5)
            }
}

public val LucideIcons.All.HammerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hammer: ImageVector
    @Composable get() = HammerDefinition.asImageVector()
