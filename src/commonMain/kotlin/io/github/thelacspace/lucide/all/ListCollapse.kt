package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListCollapse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,5.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,19.0)
                lineTo(21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,10.0)
                lineTo(6.0,7.0)
                lineTo(3.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,20.0)
                lineTo(6.0,17.0)
                lineTo(3.0,14.0)
            }
}

public val LucideIcons.All.ListCollapseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListCollapse: ImageVector
    @Composable get() = ListCollapseDefinition.asImageVector()
