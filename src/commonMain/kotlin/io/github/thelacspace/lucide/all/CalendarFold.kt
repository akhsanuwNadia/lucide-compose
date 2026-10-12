package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarFold") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,15.0)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(15.0,21.0)
                lineTo(15.0,16.0)
                curveTo(15.0,15.447714805603027,15.447714805603027,15.0,16.0,15.0)
                close()
                lineTo(21.0,15.0)
                curveTo(21.001569747924805,15.640057563781738,20.747406005859375,16.254226684570312,20.29400062561035,16.70599937438965)
                lineTo(16.70600128173828,20.29399871826172)
                curveTo(16.254226684570312,20.747406005859375,15.640058517456055,21.001569747924805,15.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(8.0,5.0)
            }
}

public val LucideIcons.All.CalendarFoldDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarFold: ImageVector
    @Composable get() = CalendarFoldDefinition.asImageVector()
