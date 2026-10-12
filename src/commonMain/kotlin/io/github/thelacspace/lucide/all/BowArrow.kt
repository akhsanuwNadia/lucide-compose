package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BowArrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.575000762939453,11.081999778747559)
                curveTo(19.998924255371094,13.86694049835205,20.371009826660156,17.07190704345703,19.623001098632812,20.10900115966797)
                curveTo(19.525684356689453,20.50772476196289,19.226560592651367,20.82630157470703,18.834749221801758,20.94851303100586)
                curveTo(18.44293975830078,21.070722579956055,18.0157413482666,20.978694915771484,17.709001541137695,20.70600128173828)
                lineTo(14.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                lineTo(3.2899999618530273,6.289999961853027)
                curveTo(3.0193369388580322,5.9828081130981445,2.928938388824463,5.556483268737793,3.051640272140503,5.165881633758545)
                curveTo(3.174342393875122,4.775280475616455,3.492292642593384,4.477232456207275,3.8899998664855957,4.380000114440918)
                curveTo(6.928275108337402,3.6318578720092773,10.134453773498535,4.004669666290283,12.920000076293945,5.430000305175781)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,14.0)
                curveTo(6.547128677368164,13.99924373626709,6.112674236297607,14.179217338562012,5.793000221252441,14.5)
                lineTo(3.147000312805176,17.145999908447266)
                curveTo(3.0037529468536377,17.28888511657715,2.9607365131378174,17.504016876220703,3.038025379180908,17.69099998474121)
                curveTo(3.115314483642578,17.87798309326172,3.297673225402832,17.999956130981445,3.5,18.0)
                lineTo(5.0,18.0)
                curveTo(5.5522847175598145,18.0,6.0,18.447715759277344,6.0,19.0)
                lineTo(6.0,20.5)
                curveTo(5.999637603759766,20.7025089263916,6.121462821960449,20.885238647460938,6.308536529541016,20.962783813476562)
                curveTo(6.49561071395874,21.04033088684082,6.7109856605529785,20.997377395629883,6.854000091552734,20.854000091552734)
                lineTo(9.5,18.207000732421875)
                curveTo(9.820783615112305,17.887327194213867,10.00075626373291,17.452871322631836,10.0,17.0)
                lineTo(10.0,15.0)
                curveTo(10.0,14.447714805603027,9.552285194396973,14.0,9.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.706999778747559,14.293000221252441)
                lineTo(21.0,3.0)
            }
}

public val LucideIcons.All.BowArrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BowArrow: ImageVector
    @Composable get() = BowArrowDefinition.asImageVector()
