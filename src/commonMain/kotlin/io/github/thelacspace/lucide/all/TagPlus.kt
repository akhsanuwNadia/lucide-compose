package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TagPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 13f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.5f, 6.5f)
                lineToRelative(-3.914f, -3.914f)
                arcTo(2f, 2f, 0f, false, false, 11.172f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(7.172f)
                arcToRelative(2f, 2f, 0f, false, false, .586f, 1.414f)
                lineToRelative(8.704f, 8.704f)
                arcToRelative(2.426f, 2.426f, 0f, false, false, 3.42f, 0f)
                lineToRelative(1.79f, -1.79f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 10f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1.0f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -1.0f, 0f)
            }
}

public val LucideIcons.All.TagPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TagPlus: ImageVector
    @Composable get() = TagPlusDefinition.asImageVector()
