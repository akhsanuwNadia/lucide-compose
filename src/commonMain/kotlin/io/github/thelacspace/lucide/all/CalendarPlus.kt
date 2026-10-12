package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,18.0)
                lineTo(22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,15.0)
                lineTo(19.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,11.5)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(13.300000190734863,21.0)
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

public val LucideIcons.All.CalendarPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarPlus: ImageVector
    @Composable get() = CalendarPlusDefinition.asImageVector()
