package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SendToBack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(20.0,14.0)
                lineTo(22.0,14.0)
                lineTo(22.0,22.0)
                lineTo(20.0,22.0)
                lineTo(16.0,22.0)
                lineTo(14.0,22.0)
                lineTo(14.0,14.0)
                lineTo(16.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,2.0)
                lineTo(8.0,2.0)
                lineTo(10.0,2.0)
                lineTo(10.0,10.0)
                lineTo(8.0,10.0)
                lineTo(4.0,10.0)
                lineTo(2.0,10.0)
                lineTo(2.0,2.0)
                lineTo(4.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,14.0)
                lineTo(7.0,15.0)
                curveTo(7.0,16.104570388793945,7.895430564880371,17.0,9.0,17.0)
                lineTo(10.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,7.0)
                lineTo(15.0,7.0)
                curveTo(16.104570388793945,7.0,17.0,7.895430564880371,17.0,9.0)
                lineTo(17.0,10.0)
            }
}

public val LucideIcons.All.SendToBackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SendToBack: ImageVector
    @Composable get() = SendToBackDefinition.asImageVector()
