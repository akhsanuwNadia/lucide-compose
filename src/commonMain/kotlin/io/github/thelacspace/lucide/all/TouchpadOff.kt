package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TouchpadOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.6560001373291,14.0)
                lineTo(22.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(14.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,6.0)
                curveTo(2.0,4.895430564880371,2.895430564880371,4.0,4.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.656000137329102,4.0)
                lineTo(20.0,4.0)
                curveTo(21.104570388793945,4.0,22.0,4.895430564880371,22.0,6.0)
                lineTo(22.0,16.3439998626709)
            }
}

public val LucideIcons.All.TouchpadOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TouchpadOff: ImageVector
    @Composable get() = TouchpadOffDefinition.asImageVector()
