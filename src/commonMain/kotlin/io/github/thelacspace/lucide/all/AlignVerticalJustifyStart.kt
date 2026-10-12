package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignVerticalJustifyStart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,16.0)
                lineTo(17.0,16.0)
                lineTo(19.0,16.0)
                lineTo(19.0,22.0)
                lineTo(17.0,22.0)
                lineTo(7.0,22.0)
                lineTo(5.0,22.0)
                lineTo(5.0,16.0)
                lineTo(7.0,16.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,6.0)
                lineTo(15.0,6.0)
                lineTo(17.0,6.0)
                lineTo(17.0,12.0)
                lineTo(15.0,12.0)
                lineTo(9.0,12.0)
                lineTo(7.0,12.0)
                lineTo(7.0,6.0)
                lineTo(9.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,2.0)
            }
}

public val LucideIcons.All.AlignVerticalJustifyStartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignVerticalJustifyStart: ImageVector
    @Composable get() = AlignVerticalJustifyStartDefinition.asImageVector()
