package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Germ") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11f, 2f)
                lineToRelative(.925f, 1.848f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 21f)
                lineToRelative(-1f, -2.472f)
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
                moveToRelative(22f, 16f)
                lineToRelative(-2.474f, -2.13f)
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
            lucidePath(strokeWidth) {
                moveTo(9.33f, 7.035f)
                curveToRelative(-.51f, 1.478f, -1.786f, 2.93f, -3.09f, 3.794f)
                arcTo(5f, 5f, 0f, false, false, af, 12.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.GermDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Germ: ImageVector
    @Composable get() = GermDefinition.asImageVector()
