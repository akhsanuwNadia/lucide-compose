package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RockingChair") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,13.0)
                lineTo(18.70800018310547,20.416000366210938)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                curveTo(8.333333015441895,23.0,15.666666984558105,23.0,21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,2.0)
                lineTo(6.210000038146973,11.633000373840332)
                curveTo(6.482606887817383,12.450039863586426,7.247682571411133,13.000782012939453,8.109000205993652,13.0)
                lineTo(18.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,13.0)
                lineTo(5.291999816894531,20.416000366210938)
            }
}

public val LucideIcons.All.RockingChairDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RockingChair: ImageVector
    @Composable get() = RockingChairDefinition.asImageVector()
