package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading5") { strokeWidth ->
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
                moveTo(17.0,13.0)
                lineTo(17.0,10.0)
                lineTo(21.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,17.700000762939453)
                curveTo(17.399999618530273,17.900001525878906,17.799999237060547,18.0,18.299999237060547,18.0)
                curveTo(19.799999237060547,18.0,21.0,16.899999618530273,21.0,15.5)
                curveTo(21.0,14.100000381469727,19.799999237060547,13.0,18.299999237060547,13.0)
                lineTo(17.0,13.0)
            }
}

public val LucideIcons.All.Heading5Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading5: ImageVector
    @Composable get() = Heading5Definition.asImageVector()
