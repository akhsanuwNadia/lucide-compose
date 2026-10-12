package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RepeatOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.656f,6.0f)
                lineTo(21.0f,6.0f)
                lineTo(17.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.898f,17.898f)
                curveTo(17.603481f,17.965816f,17.302225f,18.000034f,17.0f,18.0f)
                lineTo(3.0f,18.0f)
                lineTo(7.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,13.0f)
                lineTo(21.0f,14.0f)
                curveTo(21.00019f,14.3926325f,20.942574f,14.783154f,20.829f,15.159f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,6.0f)
                lineTo(17.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                lineTo(3.0f,10.0f)
                curveTo(2.9999518f,8.1367855f,4.286346f,6.520292f,6.102f,6.102f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                lineTo(3.0f,18.0f)
            }
}

public val LucideIcons.All.RepeatOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RepeatOff: ImageVector
    @Composable get() = RepeatOffDefinition.asImageVector()
