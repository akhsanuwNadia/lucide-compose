package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SaveCheck") { strokeWidth ->
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
                verticalLineToRelative(4.35f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 15.13f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(7f)
            }
}

public val LucideIcons.All.SaveCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SaveCheck: ImageVector
    @Composable get() = SaveCheckDefinition.asImageVector()
