package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListPlus") { strokeWidth ->
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
                moveTo(18.0,9.0)
                lineTo(18.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                lineTo(15.0,12.0)
            }
}

public val LucideIcons.All.ListPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListPlus: ImageVector
    @Composable get() = ListPlusDefinition.asImageVector()
