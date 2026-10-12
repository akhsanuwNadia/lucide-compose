package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trophy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 14.66f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 14.66f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.916f, 10f)
                horizontalLineTo(19.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 22f, 7.5f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 22f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 9f)
                arcToRelative(6f, 6f, 0f, false, false, 12f, 0f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.084f, 10f)
                horizontalLineTo(4.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2f, 7.5f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(3f)
            }
}

public val LucideIcons.All.TrophyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trophy: ImageVector
    @Composable get() = TrophyDefinition.asImageVector()
