package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 13f)
                verticalLineToRelative(2.2f)
                lineToRelative(1.6f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(3.458f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                horizontalLineToRelative(3.832f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.ListClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListClock: ImageVector
    @Composable get() = ListClockDefinition.asImageVector()
