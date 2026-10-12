package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Antenna") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(7.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                lineTo(12.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(17.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,12.0)
                lineTo(22.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5,7.0)
                lineTo(19.5,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(12.0,22.0)
            }
}

public val LucideIcons.All.AntennaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Antenna: ImageVector
    @Composable get() = AntennaDefinition.asImageVector()
