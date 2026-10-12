package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SavePen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.329999923706055,13.0)
                lineTo(8.0,13.0)
                curveTo(7.4477152824401855,13.0,7.0,13.447714805603027,7.0,14.0)
                lineTo(7.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.36299991607666,17.634000778198242)
                curveTo(14.12524700164795,17.87162208557129,13.951220512390137,18.165334701538086,13.857000350952148,18.488000869750977)
                lineTo(13.020000457763672,21.358001708984375)
                curveTo(12.968881607055664,21.533266067504883,13.017352104187012,21.72245979309082,13.146446228027344,21.85155487060547)
                curveTo(13.275541305541992,21.980649948120117,13.46473503112793,22.02912139892578,13.640000343322754,21.978002548217773)
                lineTo(16.510000228881836,21.141002655029297)
                curveTo(16.832666397094727,21.046781539916992,17.126379013061523,20.87275505065918,17.36400032043457,20.63500213623047)
                lineTo(21.37700080871582,16.62600326538086)
                curveTo(21.917621612548828,16.09019660949707,22.130231857299805,15.306082725524902,21.934326171875,14.57056999206543)
                curveTo(21.738420486450195,13.835057258605957,21.16394805908203,13.260583877563477,20.428434371948242,13.064678192138672)
                curveTo(19.692920684814453,12.868773460388184,18.9088077545166,13.08138370513916,18.373001098632812,13.622003555297852)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,3.0)
                lineTo(7.0,7.0)
                curveTo(7.0,7.5522847175598145,7.4477152824401855,8.0,8.0,8.0)
                lineTo(15.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(15.199999809265137,3.0)
                curveTo(15.727538108825684,3.007513999938965,16.23073959350586,3.2231712341308594,16.600000381469727,3.5999999046325684)
                lineTo(20.399999618530273,7.399999618530273)
                curveTo(20.77682876586914,7.769260406494141,20.99248504638672,8.2724609375,21.0,8.799999237060547)
                lineTo(21.0,9.09999942779541)
            }
}

public val LucideIcons.All.SavePenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SavePen: ImageVector
    @Composable get() = SavePenDefinition.asImageVector()
