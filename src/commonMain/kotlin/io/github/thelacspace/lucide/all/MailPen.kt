package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.36299991607666,17.634000778198242)
                curveTo(15.12524700164795,17.87162208557129,14.951220512390137,18.165334701538086,14.857000350952148,18.488000869750977)
                lineTo(14.020000457763672,21.358001708984375)
                curveTo(13.968881607055664,21.533266067504883,14.017352104187012,21.72245979309082,14.146446228027344,21.85155487060547)
                curveTo(14.275541305541992,21.980649948120117,14.46473503112793,22.02912139892578,14.640000343322754,21.978002548217773)
                lineTo(17.510000228881836,21.141002655029297)
                curveTo(17.832666397094727,21.046781539916992,18.126379013061523,20.87275505065918,18.36400032043457,20.63500213623047)
                lineTo(21.37700080871582,17.626001358032227)
                curveTo(21.917621612548828,17.090194702148438,22.130231857299805,16.306081771850586,21.934326171875,15.570568084716797)
                curveTo(21.738420486450195,14.835055351257324,21.16394805908203,14.260581970214844,20.428434371948242,14.064676284790039)
                curveTo(19.692920684814453,13.86877155303955,18.9088077545166,14.081381797790527,18.373001098632812,14.622001647949219)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.380000114440918)
                lineTo(22.0,6.0)
                curveTo(22.0,4.895430564880371,21.104570388793945,4.0,20.0,4.0)
                lineTo(4.0,4.0)
                curveTo(2.895430564880371,4.0,2.0,4.895430564880371,2.0,6.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.104570388793945,2.895430564880371,20.0,4.0,20.0)
                lineTo(10.25,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,7.0)
                lineTo(13.008999824523926,12.72700023651123)
                curveTo(12.387914657592773,13.087739944458008,11.621085166931152,13.087739944458008,11.0,12.72700023651123)
                lineTo(2.0,7.0)
            }
}

public val LucideIcons.All.MailPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailPen: ImageVector
    @Composable get() = MailPenDefinition.asImageVector()
