package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,5.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,19.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5f,9.5f)
                lineTo(20.5f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.5f,9.5f)
                lineTo(15.5f,14.5f)
            }
}

public val LucideIcons.All.ListXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListX: ImageVector
    @Composable get() = ListXDefinition.asImageVector()
