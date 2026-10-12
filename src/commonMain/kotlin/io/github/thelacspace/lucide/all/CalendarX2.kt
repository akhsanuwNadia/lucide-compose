package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarX2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,16.0f)
                lineTo(22.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                lineTo(22.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(13.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(21.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(8.0f,5.0f)
            }
}

public val LucideIcons.All.CalendarX2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarX2: ImageVector
    @Composable get() = CalendarX2Definition.asImageVector()
