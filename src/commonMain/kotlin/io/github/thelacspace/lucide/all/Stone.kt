package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Stone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.263999938964844,2.2049999237060547)
                curveTo(9.375106811523438,1.574743390083313,7.310273170471191,2.4298336505889893,6.420000076293945,4.210999965667725)
                lineTo(2.4200000762939453,12.211000442504883)
                curveTo(1.5178898572921753,14.015331268310547,2.1005070209503174,16.209041595458984,3.7790000438690186,17.328001022338867)
                lineTo(9.779000282287598,21.328001022338867)
                curveTo(11.122689247131348,22.223909378051758,12.873311996459961,22.223909378051758,14.217000961303711,21.328001022338867)
                lineTo(20.21700096130371,17.328001022338867)
                curveTo(21.717382431030273,16.327585220336914,22.362834930419922,14.446925163269043,21.793001174926758,12.736001014709473)
                lineTo(19.793001174926758,6.736001014709473)
                curveTo(19.39487075805664,5.541472911834717,18.457529067993164,4.604130268096924,17.26300048828125,4.206001281738281)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.989999771118164,22.0)
                lineTo(14.0,12.0)
                lineTo(21.82200050354004,15.184000015258789)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                lineTo(8.470000267028809,2.302000045776367)
            }
}

public val LucideIcons.All.StoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Stone: ImageVector
    @Composable get() = StoneDefinition.asImageVector()
