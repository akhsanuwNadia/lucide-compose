package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignHorizontalSpaceBetween") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,5.0)
                lineTo(7.0,5.0)
                lineTo(9.0,5.0)
                lineTo(9.0,19.0)
                lineTo(7.0,19.0)
                lineTo(5.0,19.0)
                lineTo(3.0,19.0)
                lineTo(3.0,5.0)
                lineTo(5.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,7.0)
                lineTo(19.0,7.0)
                lineTo(21.0,7.0)
                lineTo(21.0,17.0)
                lineTo(19.0,17.0)
                lineTo(17.0,17.0)
                lineTo(15.0,17.0)
                lineTo(15.0,7.0)
                lineTo(17.0,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,2.0)
                lineTo(3.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,2.0)
                lineTo(21.0,22.0)
            }
}

public val LucideIcons.All.AlignHorizontalSpaceBetweenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignHorizontalSpaceBetween: ImageVector
    @Composable get() = AlignHorizontalSpaceBetweenDefinition.asImageVector()
