package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GermOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11f, 2f)
                lineToRelative(.925f, 1.848f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.424f, 7.768f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 21f)
                lineToRelative(-1f, -2.472f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.988f, 16.988f)
                arcTo(12f, 12f, 0f, false, false, af, 5f)
                arcTo(5f, 0f, 01f, false, false, 8.8f, 8.8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 2f)
                lineToRelative(-1f, 1.804f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 19f)
                lineToRelative(2.746f, -1.373f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 16f)
                lineToRelative(-2.474f, -2.13f)
                arcToRelative(12f, 12f, 0f, true, false, 6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 5f)
                lineToRelative(-1.804f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 10f)
                lineToRelative(2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 16f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 20f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.GermOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GermOff: ImageVector
    @Composable get() = GermOffDefinition.asImageVector()
