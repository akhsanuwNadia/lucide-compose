package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading4") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,10.0)
                lineTo(17.0,13.0)
                curveTo(17.0,13.552285194396973,17.447715759277344,14.0,18.0,14.0)
                lineTo(21.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,10.0)
                lineTo(21.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                lineTo(4.0,6.0)
            }
}

public val LucideIcons.All.Heading4Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading4: ImageVector
    @Composable get() = Heading4Definition.asImageVector()
