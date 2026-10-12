package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowsUpFromLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,6.0f)
                lineTo(7.0f,3.0f)
                lineTo(10.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,17.0f)
                lineTo(7.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,6.0f)
                lineTo(17.0f,3.0f)
                lineTo(20.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,17.0f)
                lineTo(17.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,21.0f)
                lineTo(20.0f,21.0f)
            }
}

public val LucideIcons.All.ArrowsUpFromLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowsUpFromLine: ImageVector
    @Composable get() = ArrowsUpFromLineDefinition.asImageVector()
