package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.95f, 13f)
                arcToRelative(10f, 10f, 0f, true, false, -8.685f, 8.92f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(6f)
                lineToRelative(4f, 2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.ClockCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockCheck: ImageVector
    @Composable get() = ClockCheckDefinition.asImageVector()
