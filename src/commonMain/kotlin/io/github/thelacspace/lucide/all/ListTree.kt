package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListTree") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,5.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,19.0)
                lineTo(21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,10.0)
                curveTo(3.0,11.104569435119629,3.895430564880371,12.0,5.0,12.0)
                lineTo(8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,17.0)
                curveTo(3.0,18.104570388793945,3.895430564880371,19.0,5.0,19.0)
                lineTo(8.0,19.0)
            }
}

public val LucideIcons.All.ListTreeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListTree: ImageVector
    @Composable get() = ListTreeDefinition.asImageVector()
