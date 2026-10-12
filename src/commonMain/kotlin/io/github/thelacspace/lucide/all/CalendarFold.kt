package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarFold") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,15.0f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(15.0f,21.0f)
                lineTo(15.0f,16.0f)
                curveTo(15.0f,15.447715f,15.447715f,15.0f,16.0f,15.0f)
                close()
                lineTo(21.0f,15.0f)
                curveTo(21.00157f,15.640058f,20.747406f,16.254227f,20.294f,16.706f)
                lineTo(16.706001f,20.293999f)
                curveTo(16.254227f,20.747406f,15.6400585f,21.00157f,15.0f,21.0f)
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

public val LucideIcons.All.CalendarFoldDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarFold: ImageVector
    @Composable get() = CalendarFoldDefinition.asImageVector()
