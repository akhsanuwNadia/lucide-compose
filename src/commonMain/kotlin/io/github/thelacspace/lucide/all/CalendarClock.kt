package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                verticalLineToRelative(2.2f)
                lineToRelative(1.6f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 7.338f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Hf)
                arcToRelative(5f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineToRelative(5.859f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.CalendarClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarClock: ImageVector
    @Composable get() = CalendarClockDefinition.asImageVector()
