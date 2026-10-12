package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsLeftRightEllipsis") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(16.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,7.0)
                lineTo(22.0,12.0)
                lineTo(17.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,7.0)
                lineTo(2.0,12.0)
                lineTo(7.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(8.010000228881836,12.0)
            }
}

public val LucideIcons.All.ChevronsLeftRightEllipsisDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsLeftRightEllipsis: ImageVector
    @Composable get() = ChevronsLeftRightEllipsisDefinition.asImageVector()
