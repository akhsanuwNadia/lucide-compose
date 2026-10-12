package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCwClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(5f)
                lineToRelative(4f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                horizontalLineToRelative(5f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 8f)
                lineToRelative(-2.3f, -2.3f)
                arcTo(9.7f, 9.7f, 0f, false, false, af, 9f)
            }
}

public val LucideIcons.All.RotateCwClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCwClock: ImageVector
    @Composable get() = RotateCwClockDefinition.asImageVector()
