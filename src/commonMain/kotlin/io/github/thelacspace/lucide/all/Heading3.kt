package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading3") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                lineTo(4.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5,10.5)
                curveTo(19.200000762939453,9.5,21.0,10.5,21.0,12.0)
                curveTo(21.0,13.104569435119629,20.104570388793945,14.0,19.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,17.5)
                curveTo(19.0,19.0,21.0,17.799999237060547,21.0,16.0)
                curveTo(21.0,14.895430564880371,20.104570388793945,14.0,19.0,14.0)
            }
}

public val LucideIcons.All.Heading3Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading3: ImageVector
    @Composable get() = Heading3Definition.asImageVector()
