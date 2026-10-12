package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarDays") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(8.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(21.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,13.0f)
                lineTo(8.01f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,13.0f)
                lineTo(12.01f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,13.0f)
                lineTo(16.01f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,17.0f)
                lineTo(8.01f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.01f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                lineTo(16.01f,17.0f)
            }
}

public val LucideIcons.All.CalendarDaysDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarDays: ImageVector
    @Composable get() = CalendarDaysDefinition.asImageVector()
