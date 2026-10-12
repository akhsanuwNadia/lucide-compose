package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,5.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,12.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5,9.5)
                lineTo(20.5,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(20.5,9.5)
                lineTo(15.5,14.5)
            }
}

public val LucideIcons.All.ListXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListX: ImageVector
    @Composable get() = ListXDefinition.asImageVector()
