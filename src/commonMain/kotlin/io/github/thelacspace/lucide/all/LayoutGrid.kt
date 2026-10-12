package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayoutGrid") { strokeWidth ->
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
                moveTo(15.0,3.0)
                lineTo(20.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,10.0)
                lineTo(20.0,10.0)
                lineTo(15.0,10.0)
                lineTo(14.0,10.0)
                lineTo(14.0,3.0)
                lineTo(15.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,14.0)
                lineTo(20.0,14.0)
                lineTo(21.0,14.0)
                lineTo(21.0,21.0)
                lineTo(20.0,21.0)
                lineTo(15.0,21.0)
                lineTo(14.0,21.0)
                lineTo(14.0,14.0)
                lineTo(15.0,14.0)
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
}

public val LucideIcons.All.LayoutGridDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayoutGrid: ImageVector
    @Composable get() = LayoutGridDefinition.asImageVector()
