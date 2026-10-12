package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashedXCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 16f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 16f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 9f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 14f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3f)
                horizontalLineToRelative(1f)
            }
}

public val LucideIcons.All.SquareDashedXCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashedXCorner: ImageVector
    @Composable get() = SquareDashedXCornerDefinition.asImageVector()
