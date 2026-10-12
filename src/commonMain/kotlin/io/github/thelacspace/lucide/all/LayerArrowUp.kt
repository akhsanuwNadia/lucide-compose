package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayerArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.673999786376953,10.77400016784668)
                lineTo(2.5799999237060547,13.09000015258789)
                curveTo(2.2222509384155273,13.251951217651367,1.9924057722091675,13.608301162719727,1.9924057722091675,14.00100040435791)
                curveTo(1.9924057722091675,14.393699645996094,2.2222509384155273,14.750049591064453,2.5799999237060547,14.91200065612793)
                lineTo(11.180000305175781,18.82200050354004)
                curveTo(11.70437240600586,19.059446334838867,12.305627822875977,19.059446334838867,12.829999923706055,18.82200050354004)
                lineTo(21.40999984741211,14.922000885009766)
                curveTo(21.771677017211914,14.759434700012207,22.003131866455078,14.398521423339844,22.0,14.00200080871582)
                curveTo(22.003929138183594,13.604757308959961,21.77234649658203,13.24285888671875,21.40999984741211,13.080000877380371)
                lineTo(16.332000732421875,10.772001266479492)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,7.0)
                lineTo(12.0,4.0)
                lineTo(15.0,7.0)
            }
}

public val LucideIcons.All.LayerArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayerArrowUp: ImageVector
    @Composable get() = LayerArrowUpDefinition.asImageVector()
