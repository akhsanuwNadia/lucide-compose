package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignVerticalSpaceBetween") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,15.0)
                lineTo(17.0,15.0)
                lineTo(19.0,15.0)
                lineTo(19.0,21.0)
                lineTo(17.0,21.0)
                lineTo(7.0,21.0)
                lineTo(5.0,21.0)
                lineTo(5.0,15.0)
                lineTo(7.0,15.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,3.0)
                lineTo(15.0,3.0)
                lineTo(17.0,3.0)
                lineTo(17.0,9.0)
                lineTo(15.0,9.0)
                lineTo(9.0,9.0)
                lineTo(7.0,9.0)
                lineTo(7.0,3.0)
                lineTo(9.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                lineTo(22.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,3.0)
                lineTo(22.0,3.0)
            }
}

public val LucideIcons.All.AlignVerticalSpaceBetweenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignVerticalSpaceBetween: ImageVector
    @Composable get() = AlignVerticalSpaceBetweenDefinition.asImageVector()
