package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZapOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.767999649047852,5.111000061035156)
                lineTo(13.4399995803833,2.440000057220459)
                curveTo(13.93570613861084,1.9453799724578857,14.707691192626953,1.8595603704452515,15.299924850463867,2.2332370281219482)
                curveTo(15.892158508300781,2.6069138050079346,16.147037506103516,3.3406455516815186,15.913999557495117,4.000999927520752)
                lineTo(14.280999183654785,8.625999450683594)
            }
            lucidePath(strokeWidth) {
                moveTo(18.888999938964844,13.232000350952148)
                lineTo(19.56100082397461,12.5600004196167)
                curveTo(19.98957061767578,12.130897521972656,20.117582321166992,11.485944747924805,19.88538360595703,10.925691604614258)
                curveTo(19.65318489074707,10.365437507629395,19.10646629333496,10.000128746032715,18.5,10.0)
                lineTo(15.656000137329102,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.940000057220459,7.940000057220459)
                lineTo(4.440000057220459,11.439000129699707)
                curveTo(4.010845184326172,11.867879867553711,3.882314920425415,12.513054847717285,4.1143479347229,13.073655128479004)
                curveTo(4.346380710601807,13.634255409240723,4.893277645111084,13.999870300292969,5.5,14.0)
                lineTo(9.501999855041504,14.0)
                curveTo(9.664079666137695,14.00020694732666,9.816003799438477,14.07896614074707,9.909588813781738,14.211297035217285)
                curveTo(10.003174781799316,14.343628883361816,10.026810646057129,14.513113975524902,9.972999572753906,14.666000366210938)
                lineTo(8.086000442504883,20.0)
                curveTo(7.852875709533691,20.66060447692871,8.108041763305664,21.39459991455078,8.700674057006836,21.768138885498047)
                curveTo(9.293307304382324,22.14167594909668,10.065573692321777,22.055273056030273,10.56100082397461,21.559999465942383)
                lineTo(16.06100082397461,16.059999465942383)
            }
}

public val LucideIcons.All.ZapOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZapOff: ImageVector
    @Composable get() = ZapOffDefinition.asImageVector()
