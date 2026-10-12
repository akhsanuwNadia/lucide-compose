package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AirVent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,17.5)
                curveTo(18.937423706054688,18.203201293945312,19.26059913635254,19.46317481994629,18.77737045288086,20.530763626098633)
                curveTo(18.294143676757812,21.598352432250977,17.13420867919922,22.18701934814453,15.987244606018066,21.946752548217773)
                curveTo(14.840280532836914,21.70648765563965,14.014126777648926,20.70177459716797,14.0,19.530000686645508)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(4.0,12.0)
                curveTo(2.895430564880371,12.0,2.0,11.104569435119629,2.0,10.0)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(20.0,3.0)
                curveTo(21.104570388793945,3.0,22.0,3.895430564880371,22.0,5.0)
                lineTo(22.0,10.0)
                curveTo(22.0,11.104569435119629,21.104570388793945,12.0,20.0,12.0)
                lineTo(18.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(18.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.599999904632568,15.571999549865723)
                curveTo(5.951754093170166,16.207406997680664,5.812718391418457,17.199697494506836,6.2613677978515625,17.988798141479492)
                curveTo(6.710017204284668,18.77789878845215,7.633827209472656,19.1658992767334,8.51137924194336,18.93380355834961)
                curveTo(9.388931274414062,18.70170783996582,10.000129699707031,17.907726287841797,10.0,17.0)
                lineTo(10.0,12.0)
            }
}

public val LucideIcons.All.AirVentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AirVent: ImageVector
    @Composable get() = AirVentDefinition.asImageVector()
