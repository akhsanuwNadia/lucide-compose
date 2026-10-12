package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserGroup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 21f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Hf)
                arcToRelative(9f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 10f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 10f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, vf)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.UserGroupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserGroup: ImageVector
    @Composable get() = UserGroupDefinition.asImageVector()
