package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TagPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,13.0)
                lineTo(22.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,6.5)
                lineTo(12.586000442504883,2.5859999656677246)
                curveTo(12.211014747619629,2.2109010219573975,11.70238971710205,2.0001132488250732,11.17199993133545,2.0)
                lineTo(4.0,2.0)
                curveTo(2.895430564880371,2.0,2.0,2.895430564880371,2.0,4.0)
                lineTo(2.0,11.17199993133545)
                curveTo(2.0001132488250732,11.70238971710205,2.2109010219573975,12.211014747619629,2.5859999656677246,12.586000442504883)
                lineTo(11.290000915527344,21.290000915527344)
                curveTo(12.236154556274414,22.230180740356445,13.763847351074219,22.230180740356445,14.710000991821289,21.290000915527344)
                lineTo(16.5,19.5)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,10.0)
                lineTo(19.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,7.5)
                curveTo(6.999198913574219,7.679165363311768,7.094322681427002,7.845065116882324,7.24935245513916,7.934879779815674)
                curveTo(7.40438175201416,8.024694442749023,7.59561824798584,8.024694442749023,7.75064754486084,7.934879779815674)
                curveTo(7.905677318572998,7.845065116882324,8.000801086425781,7.679165363311768,8.0,7.5)
                curveTo(8.000801086425781,7.320834636688232,7.905677318572998,7.154934883117676,7.75064754486084,7.065120220184326)
                curveTo(7.59561824798584,6.975305080413818,7.40438175201416,6.975305080413818,7.24935245513916,7.065120220184326)
                curveTo(7.094322681427002,7.154934883117676,6.999198913574219,7.320834636688232,7.0,7.5)
            }
}

public val LucideIcons.All.TagPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TagPlus: ImageVector
    @Composable get() = TagPlusDefinition.asImageVector()
