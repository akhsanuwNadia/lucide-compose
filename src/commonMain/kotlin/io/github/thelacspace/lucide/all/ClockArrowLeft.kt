package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(6f)
                lineToRelative(1.5f, .8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.338f, 21.994f)
                arcToRelative(10f, 10f, 0f, true, true, 9.587f, -8.767f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 18f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 22f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.ClockArrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowLeft: ImageVector
    @Composable get() = ClockArrowLeftDefinition.asImageVector()
