package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RectangleEllipsis") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(20.0,6.0)
                lineTo(22.0,6.0)
                lineTo(22.0,18.0)
                lineTo(20.0,18.0)
                lineTo(4.0,18.0)
                lineTo(2.0,18.0)
                lineTo(2.0,6.0)
                lineTo(4.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,12.0)
                lineTo(17.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                lineTo(7.010000228881836,12.0)
            }
}

public val LucideIcons.All.RectangleEllipsisDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RectangleEllipsis: ImageVector
    @Composable get() = RectangleEllipsisDefinition.asImageVector()
