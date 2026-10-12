package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListCollapse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,5.0f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,19.0f)
                lineTo(21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,10.0f)
                lineTo(6.0f,7.0f)
                lineTo(3.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,20.0f)
                lineTo(6.0f,17.0f)
                lineTo(3.0f,14.0f)
            }
}

public val LucideIcons.All.ListCollapseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListCollapse: ImageVector
    @Composable get() = ListCollapseDefinition.asImageVector()
