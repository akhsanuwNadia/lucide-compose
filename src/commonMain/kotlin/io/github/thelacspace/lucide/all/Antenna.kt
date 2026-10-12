package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Antenna") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(7.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                lineTo(12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(17.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,12.0f)
                lineTo(22.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f,7.0f)
                lineTo(19.5f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(12.0f,22.0f)
            }
}

public val LucideIcons.All.AntennaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Antenna: ImageVector
    @Composable get() = AntennaDefinition.asImageVector()
