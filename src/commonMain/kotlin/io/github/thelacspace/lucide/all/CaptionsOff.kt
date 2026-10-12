package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaptionsOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5f,5.0f)
                lineTo(19.0f,5.0f)
                curveTo(20.10457f,5.0f,21.0f,5.8954306f,21.0f,7.0f)
                lineTo(21.0f,15.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,11.0f)
                lineTo(16.5f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,19.0f)
                lineTo(5.0f,19.0f)
                curveTo(3.8954306f,19.0f,3.0f,18.10457f,3.0f,17.0f)
                lineTo(3.0f,7.0f)
                curveTo(3.0f,5.8954306f,3.8954306f,5.0f,5.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,11.0f)
                lineTo(11.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,15.0f)
                lineTo(9.5f,15.0f)
            }
}

public val LucideIcons.All.CaptionsOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaptionsOff: ImageVector
    @Composable get() = CaptionsOffDefinition.asImageVector()
