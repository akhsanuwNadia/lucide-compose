package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PrinterX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.531000137329102,22.0)
                lineTo(7.0,22.0)
                curveTo(6.4477152824401855,22.0,6.0,21.552284240722656,6.0,21.0)
                lineTo(6.0,15.0)
                curveTo(6.0,14.447714805603027,6.4477152824401855,14.0,7.0,14.0)
                lineTo(13.376999855041504,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,16.5)
                lineTo(21.5,21.5)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,21.5)
                lineTo(21.5,16.5)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(4.0,18.0)
                curveTo(2.895430564880371,18.0,2.0,17.104570388793945,2.0,16.0)
                lineTo(2.0,11.0)
                curveTo(2.0,9.895430564880371,2.895430564880371,9.0,4.0,9.0)
                lineTo(20.0,9.0)
                curveTo(21.104570388793945,9.0,22.0,9.895430564880371,22.0,11.0)
                lineTo(22.0,12.5)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,9.0)
                lineTo(6.0,3.0)
                curveTo(6.0,2.4477152824401855,6.4477152824401855,2.0,7.0,2.0)
                lineTo(17.0,2.0)
                curveTo(17.552284240722656,2.0,18.0,2.4477152824401855,18.0,3.0)
                lineTo(18.0,9.0)
            }
}

public val LucideIcons.All.PrinterXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PrinterX: ImageVector
    @Composable get() = PrinterXDefinition.asImageVector()
