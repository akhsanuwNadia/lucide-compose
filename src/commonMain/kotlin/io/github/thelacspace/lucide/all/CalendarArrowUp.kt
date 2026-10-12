package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14f, 17f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 21f)
                verticalLineToRelative(-8f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 10.343f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Hf)
                arcToRelative(5f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                verticalLineToRelative(3f)
            }
}

public val LucideIcons.All.CalendarArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarArrowUp: ImageVector
    @Composable get() = CalendarArrowUpDefinition.asImageVector()
