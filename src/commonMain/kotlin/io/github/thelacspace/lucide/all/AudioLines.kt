package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AudioLines") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(2.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(6.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                lineTo(14.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,5.0)
                lineTo(18.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                lineTo(22.0,13.0)
            }
}

public val LucideIcons.All.AudioLinesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AudioLines: ImageVector
    @Composable get() = AudioLinesDefinition.asImageVector()
