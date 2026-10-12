package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Calendars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.72599983215332,21.010000228881836)
                curveTo(15.367290496826172,21.62308692932129,14.710314750671387,21.999916076660156,14.0,22.0)
                lineTo(4.0,22.0)
                curveTo(2.895430564880371,22.0,2.0,21.104570388793945,2.0,20.0)
                lineTo(2.0,10.0)
                curveTo(2.0,8.895430564880371,2.895430564880371,8.0,4.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,2.0)
                lineTo(18.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,13.0)
                lineTo(4.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(22.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(20.0,3.0)
                lineTo(22.0,3.0)
                lineTo(22.0,17.0)
                lineTo(20.0,17.0)
                lineTo(10.0,17.0)
                lineTo(8.0,17.0)
                lineTo(8.0,3.0)
                lineTo(10.0,3.0)
                close()
            }
}

public val LucideIcons.All.CalendarsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Calendars: ImageVector
    @Composable get() = CalendarsDefinition.asImageVector()
