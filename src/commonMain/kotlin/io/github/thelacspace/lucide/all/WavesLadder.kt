package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesLadder") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,5.0f)
                curveTo(17.89543f,5.0f,17.0f,5.8954306f,17.0f,7.0f)
                lineTo(17.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,18.0f)
                curveTo(2.6f,18.5f,3.2f,19.0f,4.5f,19.0f)
                curveTo(7.0f,19.0f,7.0f,17.0f,9.5f,17.0f)
                curveTo(12.1f,17.0f,11.9f,19.0f,14.5f,19.0f)
                curveTo(17.0f,19.0f,17.0f,17.0f,19.5f,17.0f)
                curveTo(20.8f,17.0f,21.4f,17.5f,22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,13.0f)
                lineTo(17.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,9.0f)
                lineTo(17.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                curveTo(7.8954306f,5.0f,7.0f,5.8954306f,7.0f,7.0f)
                lineTo(7.0f,18.0f)
            }
}

public val LucideIcons.All.WavesLadderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesLadder: ImageVector
    @Composable get() = WavesLadderDefinition.asImageVector()
