package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PanelTopClose") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,16.0)
                lineTo(12.0,13.0)
                lineTo(15.0,16.0)
            }
}

public val LucideIcons.All.PanelTopCloseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PanelTopClose: ImageVector
    @Composable get() = PanelTopCloseDefinition.asImageVector()
