package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlantPot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,8.53600025177002)
                lineTo(14.0,6.0)
                curveTo(14.0,3.790860891342163,15.790861129760742,2.0,18.0,2.0)
                lineTo(19.5,2.0)
                curveTo(19.776142120361328,2.0,20.0,2.2238576412200928,20.0,2.5)
                lineTo(20.0,4.0)
                curveTo(20.0,6.209138870239258,18.209138870239258,8.0,16.0,8.0)
                curveTo(13.790861129760742,8.0,12.0,9.790861129760742,12.0,12.0)
                curveTo(10.484911918640137,13.136316299438477,8.457852363586426,13.319095611572266,6.763932228088379,12.472135543823242)
                curveTo(5.070012092590332,11.625175476074219,4.0,9.89385986328125,4.0,8.0)
                curveTo(5.515088081359863,6.863683700561523,7.542147636413574,6.680903911590576,9.236067771911621,7.5278639793396)
                curveTo(10.929987907409668,8.374824523925781,12.0,10.10614013671875,12.0,12.0)
                curveTo(12.0,14.0,13.0,15.0,13.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,17.0)
                lineTo(16.915000915527344,20.579999923706055)
                curveTo(16.659360885620117,21.423635482788086,15.881518363952637,22.000417709350586,15.0,22.0)
                lineTo(9.001999855041504,22.0)
                curveTo(8.121769905090332,21.99980354309082,7.345147132873535,21.424137115478516,7.0889997482299805,20.582000732421875)
                lineTo(6.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,17.0)
                lineTo(19.0,17.0)
            }
}

public val LucideIcons.All.PlantPotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlantPot: ImageVector
    @Composable get() = PlantPotDefinition.asImageVector()
