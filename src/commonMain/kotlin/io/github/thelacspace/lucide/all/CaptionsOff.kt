package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaptionsOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5,5.0)
                lineTo(19.0,5.0)
                curveTo(20.104570388793945,5.0,21.0,5.895430564880371,21.0,7.0)
                lineTo(21.0,15.5)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,11.0)
                lineTo(16.5,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,19.0)
                lineTo(5.0,19.0)
                curveTo(3.895430564880371,19.0,3.0,18.104570388793945,3.0,17.0)
                lineTo(3.0,7.0)
                curveTo(3.0,5.895430564880371,3.895430564880371,5.0,5.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,11.0)
                lineTo(11.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,15.0)
                lineTo(9.5,15.0)
            }
}

public val LucideIcons.All.CaptionsOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaptionsOff: ImageVector
    @Composable get() = CaptionsOffDefinition.asImageVector()
