package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sprout") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,9.53600025177002)
                lineTo(14.0,7.0)
                curveTo(14.0,4.790861129760742,15.790861129760742,3.0,18.0,3.0)
                lineTo(19.5,3.0)
                curveTo(19.776142120361328,3.0,20.0,3.2238576412200928,20.0,3.5)
                lineTo(20.0,5.0)
                curveTo(20.0,7.209138870239258,18.209138870239258,9.0,16.0,9.0)
                curveTo(13.790861129760742,9.0,12.0,10.790861129760742,12.0,13.0)
                curveTo(12.0,15.0,13.0,16.0,13.0,18.0)
                curveTo(13.0,19.081851959228516,12.649110794067383,20.134519577026367,12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,9.0)
                curveTo(5.515088081359863,7.863683700561523,7.542147636413574,7.680903911590576,9.236067771911621,8.527864456176758)
                curveTo(10.929987907409668,9.374824523925781,12.0,11.10614013671875,12.0,13.0)
                curveTo(10.484911918640137,14.136316299438477,8.457852363586426,14.319095611572266,6.763932228088379,13.472135543823242)
                curveTo(5.070012092590332,12.625175476074219,4.0,10.89385986328125,4.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                lineTo(19.0,21.0)
            }
}

public val LucideIcons.All.SproutDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sprout: ImageVector
    @Composable get() = SproutDefinition.asImageVector()
