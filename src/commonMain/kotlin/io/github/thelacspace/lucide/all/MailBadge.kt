package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailBadge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 7.7f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8.25f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12.996f)
                arcToRelative(1.94f, 1.94f, 0f, false, true, -1.03f, -.296f)
                lineTo(2f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.69f, 16.479f)
                lineToRelative(1.29f, 4.88f)
                arcToRelative(.5f, .5f, 0f, false, true, -.698f, .591f)
                lineToRelative(-1.843f, -.849f)
                arcToRelative(1f, 1f, 0f, false, false, -.879f, .001f)
                lineToRelative(-1.846f, .85f)
                arcToRelative(.5f, .5f, 0f, false, true, -.692f, -.593f)
                lineToRelative(1.29f, -4.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.MailBadgeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailBadge: ImageVector
    @Composable get() = MailBadgeDefinition.asImageVector()
