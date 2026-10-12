package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PanelLeftOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,3.0f)
                lineTo(9.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,9.0f)
                lineTo(17.0f,12.0f)
                lineTo(14.0f,15.0f)
            }
}

public val LucideIcons.All.PanelLeftOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PanelLeftOpen: ImageVector
    @Composable get() = PanelLeftOpenDefinition.asImageVector()
