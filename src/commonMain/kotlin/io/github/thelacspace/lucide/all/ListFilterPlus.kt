package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListFilterPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,5.0f)
                lineTo(2.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(18.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,19.0f)
                lineTo(15.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,5.0f)
                lineTo(22.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,8.0f)
                lineTo(19.0f,2.0f)
            }
}

public val LucideIcons.All.ListFilterPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListFilterPlus: ImageVector
    @Composable get() = ListFilterPlusDefinition.asImageVector()
