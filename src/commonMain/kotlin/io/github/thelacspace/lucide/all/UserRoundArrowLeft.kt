package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundArrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(19f, 16f)
                lineToRelative(-3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                arcToRelative(8f, 8f, 0f, false, true, 12.664f, -6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 19f)
                horizontalLineToRelative(-6f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
}

public val LucideIcons.All.UserRoundArrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundArrowLeft: ImageVector
    @Composable get() = UserRoundArrowLeftDefinition.asImageVector()
