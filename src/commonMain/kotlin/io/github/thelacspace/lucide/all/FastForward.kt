package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FastForward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                curveTo(12.00017261505127,5.191208362579346,12.487455368041992,4.462132453918457,13.23469066619873,4.152644634246826)
                curveTo(13.981926918029785,3.843156576156616,14.842011451721191,4.014184474945068,15.413999557495117,4.585999965667725)
                lineTo(21.413999557495117,10.586000442504883)
                curveTo(22.19476318359375,11.367000579833984,22.19476318359375,12.633000373840332,21.413999557495117,13.414000511169434)
                lineTo(15.413999557495117,19.41400146484375)
                curveTo(14.842010498046875,19.985816955566406,13.981925964355469,20.156845092773438,13.234689712524414,19.84735679626465)
                curveTo(12.487454414367676,19.53786849975586,12.00017261505127,18.808792114257812,12.0,18.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,6.0)
                curveTo(2.0001726150512695,5.191208362579346,2.487454891204834,4.462131977081299,3.2346909046173096,4.152644157409668)
                curveTo(3.981926679611206,3.843156099319458,4.842011451721191,4.01418399810791,5.414000034332275,4.585999965667725)
                lineTo(11.413999557495117,10.586000442504883)
                curveTo(12.19476318359375,11.367000579833984,12.19476318359375,12.633000373840332,11.413999557495117,13.414000511169434)
                lineTo(5.413999557495117,19.41400146484375)
                curveTo(4.842010974884033,19.985816955566406,3.9819259643554688,20.156845092773438,3.2346901893615723,19.84735679626465)
                curveTo(2.487454414367676,19.53786849975586,2.0001723766326904,18.808792114257812,2.0,18.0)
                close()
            }
}

public val LucideIcons.All.FastForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FastForward: ImageVector
    @Composable get() = FastForwardDefinition.asImageVector()
