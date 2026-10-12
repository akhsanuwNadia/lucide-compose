package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScreenShareOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,15.0)
                curveTo(2.0,16.104570388793945,2.895430564880371,17.0,4.0,17.0)
                lineTo(20.0,17.0)
                curveTo(21.104570388793945,17.0,22.0,16.104570388793945,22.0,15.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,3.0)
                lineTo(17.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(22.0,8.0)
            }
}

public val LucideIcons.All.ScreenShareOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScreenShareOff: ImageVector
    @Composable get() = ScreenShareOffDefinition.asImageVector()
