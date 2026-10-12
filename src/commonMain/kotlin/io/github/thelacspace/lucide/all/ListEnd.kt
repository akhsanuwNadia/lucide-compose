package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,5.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,19.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(13.0,19.0)
                lineTo(16.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,5.0)
                lineTo(21.0,17.0)
                curveTo(21.0,18.104570388793945,20.104570388793945,19.0,19.0,19.0)
                lineTo(13.0,19.0)
            }
}

public val LucideIcons.All.ListEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListEnd: ImageVector
    @Composable get() = ListEndDefinition.asImageVector()
