package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,9.0)
                lineTo(15.5,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(9.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.5859999656677246,3.5859999656677246)
                curveTo(3.2109012603759766,3.9609854221343994,3.0001132488250732,4.469610214233398,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(19.0,21.0)
                curveTo(19.5303897857666,20.99988555908203,20.03901481628418,20.789098739624023,20.413999557495117,20.413999557495117)
            }
            lucidePath(strokeWidth) {
                moveTo(8.656000137329102,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,15.343999862670898)
            }
}

public val LucideIcons.All.CalendarOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarOff: ImageVector
    @Composable get() = CalendarOffDefinition.asImageVector()
