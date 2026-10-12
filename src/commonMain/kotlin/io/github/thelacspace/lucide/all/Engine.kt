package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Engine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(16.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,3.0)
                lineTo(13.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(2.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,13.0)
                lineTo(6.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,16.0)
                curveTo(6.0,17.104570388793945,6.895430564880371,18.0,8.0,18.0)
                lineTo(9.0,18.0)
                curveTo(9.629514694213867,18.0,10.222290992736816,18.296388626098633,10.600000381469727,18.799999237060547)
                lineTo(10.90000057220459,19.19999885559082)
                curveTo(11.2777099609375,19.703609466552734,11.87048625946045,19.999998092651367,12.500000953674316,19.999998092651367)
                lineTo(14.76400089263916,19.999998092651367)
                curveTo(15.521693229675293,19.99997329711914,16.214313507080078,19.571779251098633,16.553001403808594,18.893997192382812)
                lineTo(18.22300148010254,15.552997589111328)
                curveTo(18.392425537109375,15.213946342468262,18.738975524902344,14.999821662902832,19.11800193786621,14.999998092651367)
                lineTo(21.0,14.999998092651367)
                curveTo(21.552284240722656,14.999998092651367,22.0,14.55228328704834,22.0,13.999998092651367)
                lineTo(22.0,9.999998092651367)
                curveTo(22.0,9.447712898254395,21.552284240722656,8.999998092651367,21.0,8.999998092651367)
                lineTo(17.5,8.999998092651367)
                curveTo(17.185243606567383,8.999998092651367,16.88885498046875,8.85180377960205,16.700000762939453,8.599998474121094)
                lineTo(15.80000114440918,7.399998664855957)
                curveTo(15.611145973205566,7.148192882537842,15.314757347106934,6.999999523162842,15.0,7.0)
                lineTo(11.0,7.0)
                curveTo(10.685242652893066,7.0,10.388854026794434,7.148194313049316,10.199999809265137,7.400000095367432)
                lineTo(9.300000190734863,8.600000381469727)
                curveTo(9.111145973205566,8.851805686950684,8.814757347106934,9.0,8.5,9.0)
                lineTo(7.0,9.0)
                curveTo(6.4477152824401855,9.0,6.0,9.447714805603027,6.0,10.0)
                close()
            }
}

public val LucideIcons.All.EngineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Engine: ImageVector
    @Composable get() = EngineDefinition.asImageVector()
