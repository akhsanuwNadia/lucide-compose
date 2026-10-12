package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardPenLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(15.0,2.0)
                lineTo(16.0,2.0)
                lineTo(16.0,6.0)
                lineTo(15.0,6.0)
                lineTo(9.0,6.0)
                lineTo(8.0,6.0)
                lineTo(8.0,2.0)
                lineTo(9.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,4.0)
                lineTo(6.0,4.0)
                curveTo(4.895430564880371,4.0,4.0,4.895430564880371,4.0,6.0)
                lineTo(4.0,20.0)
                curveTo(4.0,21.104570388793945,4.895430564880371,22.0,6.0,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,19.5)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,4.0)
                lineTo(18.0,4.0)
                curveTo(18.71379852294922,4.000732421875,19.37310028076172,4.381832122802734,19.729999542236328,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(9.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.378000259399414,12.62600040435791)
                curveTo(22.20121192932129,11.795392990112305,22.19821548461914,10.455620765686035,21.37129783630371,9.628703117370605)
                curveTo(20.54438018798828,8.80178451538086,19.204608917236328,8.798789024353027,18.374000549316406,9.622000694274902)
                lineTo(14.36400032043457,13.634000778198242)
                curveTo(14.12624740600586,13.871623039245605,13.952220916748047,14.165335655212402,13.858000755310059,14.488000869750977)
                lineTo(13.021000862121582,17.358001708984375)
                curveTo(12.969882011413574,17.533266067504883,13.018352508544922,17.72245979309082,13.147446632385254,17.85155487060547)
                curveTo(13.276541709899902,17.980649948120117,13.46573543548584,18.02912139892578,13.641000747680664,17.978002548217773)
                lineTo(16.511001586914062,17.141002655029297)
                curveTo(16.833667755126953,17.046781539916992,17.12738037109375,16.87275505065918,17.365001678466797,16.63500213623047)
                close()
            }
}

public val LucideIcons.All.ClipboardPenLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardPenLine: ImageVector
    @Composable get() = ClipboardPenLineDefinition.asImageVector()
