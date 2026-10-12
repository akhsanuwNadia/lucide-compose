package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,5.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,19.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                lineTo(17.0,20.0)
                lineTo(21.0,16.0)
            }
}

public val LucideIcons.All.ListCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListCheck: ImageVector
    @Composable get() = ListCheckDefinition.asImageVector()
