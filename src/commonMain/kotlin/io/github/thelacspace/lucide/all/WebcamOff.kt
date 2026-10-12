package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WebcamOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.754f, 7.096f)
                arcToRelative(3f, 3f, 0f, false, true, 2.15f, 2.15f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.863f, 12.873f)
                arcToRelative(3f, 3f, 0f, false, true, -3.736f, -3.735f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.566f, 16.57f)
                arcTo(8f, 8f, 0f, false, true, 5.43f, 5.433f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.478f, 2.817f)
                arcToRelative(8f, 8f, 0f, false, true, 10.705f, 10.705f)
            }
}

public val LucideIcons.All.WebcamOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WebcamOff: ImageVector
    @Composable get() = WebcamOffDefinition.asImageVector()
