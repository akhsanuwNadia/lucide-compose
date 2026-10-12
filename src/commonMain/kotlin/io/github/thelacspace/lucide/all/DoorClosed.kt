package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorClosed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,21.0)
                lineTo(19.0,5.0)
                curveTo(19.0,3.895430564880371,18.104570388793945,3.0,17.0,3.0)
                lineTo(7.0,3.0)
                curveTo(5.895430564880371,3.0,5.0,3.895430564880371,5.0,5.0)
                lineTo(5.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                lineTo(22.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(9.010000228881836,12.0)
            }
}

public val LucideIcons.All.DoorClosedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorClosed: ImageVector
    @Composable get() = DoorClosedDefinition.asImageVector()
