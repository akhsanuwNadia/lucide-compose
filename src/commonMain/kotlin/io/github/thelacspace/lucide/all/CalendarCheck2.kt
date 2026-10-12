package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarCheck2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 3f)
                lineTo(5f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 13f)
                lineTo(21f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                arcTo(2f, 2f, 0f, false, false, 19f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                arcTo(2f, 2f, 0f, false, false, 5f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                lineTo(3f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                arcTo(2f, 2f, 0f, false, false, 3f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 19f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                lineTo(12.5f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                verticalLineToRelative(3f)
            }
}

public val LucideIcons.All.CalendarCheck2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarCheck2: ImageVector
    @Composable get() = CalendarCheck2Definition.asImageVector()
