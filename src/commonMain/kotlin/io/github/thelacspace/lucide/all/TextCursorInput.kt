package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextCursorInput") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(11.0,20.0)
                curveTo(9.895430564880371,20.0,9.0,19.104570388793945,9.0,18.0)
                curveTo(9.0,19.104570388793945,8.104569435119629,20.0,7.0,20.0)
                lineTo(6.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,8.0)
                lineTo(20.0,8.0)
                curveTo(21.104570388793945,8.0,22.0,8.895430564880371,22.0,10.0)
                lineTo(22.0,14.0)
                curveTo(22.0,15.104569435119629,21.104570388793945,16.0,20.0,16.0)
                lineTo(13.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,16.0)
                lineTo(4.0,16.0)
                curveTo(2.895430564880371,16.0,2.0,15.104569435119629,2.0,14.0)
                lineTo(2.0,10.0)
                curveTo(2.0,8.895430564880371,2.895430564880371,8.0,4.0,8.0)
                lineTo(5.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,4.0)
                lineTo(7.0,4.0)
                curveTo(8.104569435119629,4.0,9.0,4.895430564880371,9.0,6.0)
                curveTo(9.0,4.895430564880371,9.895430564880371,4.0,11.0,4.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,6.0)
                lineTo(9.0,18.0)
            }
}

public val LucideIcons.All.TextCursorInputDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextCursorInput: ImageVector
    @Composable get() = TextCursorInputDefinition.asImageVector()
