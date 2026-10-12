package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowsUpFromLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(7.0,3.0)
                lineTo(10.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,17.0)
                lineTo(7.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,6.0)
                lineTo(17.0,3.0)
                lineTo(20.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,17.0)
                lineTo(17.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,21.0)
                lineTo(20.0,21.0)
            }
}

public val LucideIcons.All.ArrowsUpFromLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowsUpFromLine: ImageVector
    @Composable get() = ArrowsUpFromLineDefinition.asImageVector()
