package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListChecks") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,5.0)
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
                moveTo(3.0,17.0)
                lineTo(5.0,19.0)
                lineTo(9.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(5.0,9.0)
                lineTo(9.0,5.0)
            }
}

public val LucideIcons.All.ListChecksDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListChecks: ImageVector
    @Composable get() = ListChecksDefinition.asImageVector()
