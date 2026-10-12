package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shrink") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,15.0f)
                lineTo(21.0f,21.0f)
                moveTo(15.0f,15.0f)
                lineTo(15.0f,19.8f)
                moveTo(15.0f,14.999999f)
                lineTo(19.8f,14.999999f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,19.8f)
                lineTo(9.0f,15.0f)
                moveTo(9.0f,15.0f)
                lineTo(4.2f,15.0f)
                moveTo(9.0f,15.0f)
                lineTo(3.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,4.2f)
                lineTo(15.0f,9.0f)
                moveTo(15.0f,9.0f)
                lineTo(19.8f,9.0f)
                moveTo(15.0f,9.0f)
                lineTo(21.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,4.2f)
                lineTo(9.0f,9.0f)
                moveTo(9.0f,9.0f)
                lineTo(4.2f,9.0f)
                moveTo(9.0f,9.0f)
                lineTo(3.0f,3.0f)
            }
}

public val LucideIcons.All.ShrinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shrink: ImageVector
    @Composable get() = ShrinkDefinition.asImageVector()
