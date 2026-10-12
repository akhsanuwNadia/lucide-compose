package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,11.0)
                lineTo(10.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,11.0)
                lineTo(14.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,6.0)
                lineTo(19.0,20.0)
                curveTo(19.0,21.104570388793945,18.104570388793945,22.0,17.0,22.0)
                lineTo(7.0,22.0)
                curveTo(5.895430564880371,22.0,5.0,21.104570388793945,5.0,20.0)
                lineTo(5.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,6.0)
                lineTo(21.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                lineTo(8.0,4.0)
                curveTo(8.0,2.895430564880371,8.895430564880371,2.0,10.0,2.0)
                lineTo(14.0,2.0)
                curveTo(15.104569435119629,2.0,16.0,2.895430564880371,16.0,4.0)
                lineTo(16.0,6.0)
            }
}

public val LucideIcons.All.TrashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trash: ImageVector
    @Composable get() = TrashDefinition.asImageVector()
