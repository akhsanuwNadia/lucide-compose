package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,5.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,19.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                lineTo(17.0f,20.0f)
                lineTo(21.0f,16.0f)
            }
}

public val LucideIcons.All.ListCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListCheck: ImageVector
    @Composable get() = ListCheckDefinition.asImageVector()
