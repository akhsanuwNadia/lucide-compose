package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CardSim") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(12.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.17199993133545,2.0)
                curveTo(14.70238971710205,2.0001132488250732,15.211014747619629,2.2109010219573975,15.586000442504883,2.5859999656677246)
                lineTo(19.41400146484375,6.414000034332275)
                curveTo(19.789098739624023,6.788985729217529,19.999887466430664,7.297610759735107,20.0,7.828000068664551)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(14.0,10.0)
                lineTo(16.0,10.0)
                lineTo(16.0,18.0)
                lineTo(14.0,18.0)
                lineTo(10.0,18.0)
                lineTo(8.0,18.0)
                lineTo(8.0,10.0)
                lineTo(10.0,10.0)
                close()
            }
}

public val LucideIcons.All.CardSimDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CardSim: ImageVector
    @Composable get() = CardSimDefinition.asImageVector()
