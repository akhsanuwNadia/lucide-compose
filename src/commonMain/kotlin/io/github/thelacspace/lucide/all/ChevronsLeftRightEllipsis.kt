package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsLeftRightEllipsis") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(16.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,7.0f)
                lineTo(22.0f,12.0f)
                lineTo(17.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,7.0f)
                lineTo(2.0f,12.0f)
                lineTo(7.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(8.01f,12.0f)
            }
}

public val LucideIcons.All.ChevronsLeftRightEllipsisDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsLeftRightEllipsis: ImageVector
    @Composable get() = ChevronsLeftRightEllipsisDefinition.asImageVector()
