package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SavePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.5f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(10.2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.4f, .6f)
                lineToRelative(3.8f, 3.8f)
                arcToRelative(2f, 2f, 0f, false, true, .6f, 1.4f)
                verticalLineTo(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 13f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 22f)
                verticalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 19f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(7f)
            }
}

public val LucideIcons.All.SavePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SavePlus: ImageVector
    @Composable get() = SavePlusDefinition.asImageVector()
