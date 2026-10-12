package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayersArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,17.00200080871582)
                curveTo(1.9990335702896118,17.3925724029541,2.225545883178711,17.747961044311523,2.5799999237060547,17.91200065612793)
                lineTo(11.180000305175781,21.82200050354004)
                curveTo(11.70437240600586,22.059446334838867,12.305627822875977,22.059446334838867,12.829999923706055,21.82200050354004)
                lineTo(21.40999984741211,17.922000885009766)
                curveTo(21.771677017211914,17.759435653686523,22.003131866455078,17.398521423339844,22.0,17.00200080871582)
            }
            lucidePath(strokeWidth) {
                moveTo(7.673999786376953,8.77400016784668)
                lineTo(2.5799999237060547,11.09000015258789)
                curveTo(2.2222509384155273,11.251951217651367,1.9924057722091675,11.608301162719727,1.9924057722091675,12.00100040435791)
                curveTo(1.9924057722091675,12.393699645996094,2.2222509384155273,12.750049591064453,2.5799999237060547,12.91200065612793)
                lineTo(11.180000305175781,16.82200050354004)
                curveTo(11.70437240600586,17.059446334838867,12.305627822875977,17.059446334838867,12.829999923706055,16.82200050354004)
                lineTo(21.40999984741211,12.922000885009766)
                curveTo(21.771677017211914,12.759434700012207,22.003131866455078,12.398521423339844,22.0,12.00200080871582)
                curveTo(22.003929138183594,11.604757308959961,21.77234649658203,11.24285888671875,21.40999984741211,11.080000877380371)
                lineTo(16.332000732421875,8.772001266479492)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,5.0)
                lineTo(12.0,2.0)
                lineTo(15.0,5.0)
            }
}

public val LucideIcons.All.LayersArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayersArrowUp: ImageVector
    @Composable get() = LayersArrowUpDefinition.asImageVector()
