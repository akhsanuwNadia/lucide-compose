package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Calendars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.726f,21.01f)
                curveTo(15.3672905f,21.623087f,14.710315f,21.999916f,14.0f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(2.8954306f,22.0f,2.0f,21.10457f,2.0f,20.0f)
                lineTo(2.0f,10.0f)
                curveTo(2.0f,8.895431f,2.8954306f,8.0f,4.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,2.0f)
                lineTo(18.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                lineTo(4.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(22.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(22.0f,3.0f)
                lineTo(22.0f,17.0f)
                lineTo(20.0f,17.0f)
                lineTo(10.0f,17.0f)
                lineTo(8.0f,17.0f)
                lineTo(8.0f,3.0f)
                lineTo(10.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.CalendarsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Calendars: ImageVector
    @Composable get() = CalendarsDefinition.asImageVector()
