package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookOpenText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 13f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 9f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.001f, 19f)
                arcTo(2f, 2f, 0f, false, false, Vf, 5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Lf)
                arcToRelative(16f, 3.002f, Af, false, false, 0f, 0012f)
                arcToRelative(5f, af, 5f, false, false, 00f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 13f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 9f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.BookOpenTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookOpenText: ImageVector
    @Composable get() = BookOpenTextDefinition.asImageVector()
