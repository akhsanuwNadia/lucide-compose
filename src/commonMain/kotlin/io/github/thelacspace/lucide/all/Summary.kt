package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Summary") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 4f)
                horizontalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 16f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 4f)
                verticalLineToRelative(13f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 14f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 9f)
                horizontalLineToRelative(12f)
            }
}

public val LucideIcons.All.SummaryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Summary: ImageVector
    @Composable get() = SummaryDefinition.asImageVector()
