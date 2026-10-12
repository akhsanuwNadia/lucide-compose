package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayoutArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(9.0,3.0)
                lineTo(10.0,3.0)
                lineTo(10.0,10.0)
                lineTo(9.0,10.0)
                lineTo(4.0,10.0)
                lineTo(3.0,10.0)
                lineTo(3.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(9.0,14.0)
                lineTo(10.0,14.0)
                lineTo(10.0,21.0)
                lineTo(9.0,21.0)
                lineTo(4.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,14.0)
                lineTo(4.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,3.0)
                lineTo(18.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,18.0)
                lineTo(18.0,21.0)
                lineTo(15.0,18.0)
            }
}

public val LucideIcons.All.LayoutArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayoutArrowDown: ImageVector
    @Composable get() = LayoutArrowDownDefinition.asImageVector()
