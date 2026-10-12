package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorStairwell") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,14.0)
                curveTo(12.0,13.447714805603027,12.447714805603027,13.0,13.0,13.0)
                lineTo(19.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,17.0)
                lineTo(10.0,17.0)
                curveTo(9.447714805603027,17.0,9.0,17.447715759277344,9.0,18.0)
                lineTo(9.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,21.0)
                lineTo(19.0,5.0)
                curveTo(19.0,3.895430564880371,18.104570388793945,3.0,17.0,3.0)
                lineTo(7.0,3.0)
                curveTo(5.895430564880371,3.0,5.0,3.895430564880371,5.0,5.0)
                lineTo(5.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,9.0)
                lineTo(16.0,9.0)
                curveTo(15.447714805603027,9.0,15.0,9.447714805603027,15.0,10.0)
                lineTo(15.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,21.0)
                lineTo(2.0,21.0)
            }
}

public val LucideIcons.All.DoorStairwellDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorStairwell: ImageVector
    @Composable get() = DoorStairwellDefinition.asImageVector()
