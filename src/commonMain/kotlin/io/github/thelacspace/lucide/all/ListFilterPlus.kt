package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListFilterPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                lineTo(2.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(18.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,19.0)
                lineTo(15.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,5.0)
                lineTo(22.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,8.0)
                lineTo(19.0,2.0)
            }
}

public val LucideIcons.All.ListFilterPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListFilterPlus: ImageVector
    @Composable get() = ListFilterPlusDefinition.asImageVector()
