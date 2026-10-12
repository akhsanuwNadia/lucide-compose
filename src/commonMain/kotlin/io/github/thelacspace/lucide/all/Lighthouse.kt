package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lighthouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.066f, 16.865f)
                lineTo(7f, 22f)
                lineToRelative(2f, -11f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, false, vf, 5f)
                lineToRelative(2f, 11f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.792f, 4.5f)
                lineToRelative(.866f, -.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.797f, 13.5f)
                lineToRelative(.866f, .5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 9f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.203f, 13.5f)
                lineToRelative(-.866f, .5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.208f, 4.5f)
                lineTo(3.342f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.5f, 22f)
                horizontalLineToRelative(13f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.932f, 16.875f)
                lineToRelative(7.377f, -4.178f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 11f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 7f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.LighthouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lighthouse: ImageVector
    @Composable get() = LighthouseDefinition.asImageVector()
