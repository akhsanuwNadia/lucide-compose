package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AudioLinesOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(10.0,4.349999904632568)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,14.0)
                lineTo(14.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                lineTo(14.0,8.350000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,5.0)
                lineTo(18.0,12.350000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(2.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                lineTo(22.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(6.0,17.0)
            }
}

public val LucideIcons.All.AudioLinesOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AudioLinesOff: ImageVector
    @Composable get() = AudioLinesOffDefinition.asImageVector()
