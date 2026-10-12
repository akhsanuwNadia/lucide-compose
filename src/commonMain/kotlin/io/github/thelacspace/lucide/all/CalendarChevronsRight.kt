package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarChevronsRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(13f, 21f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 21f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 11.5f)
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

public val LucideIcons.All.CalendarChevronsRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarChevronsRight: ImageVector
    @Composable get() = CalendarChevronsRightDefinition.asImageVector()
