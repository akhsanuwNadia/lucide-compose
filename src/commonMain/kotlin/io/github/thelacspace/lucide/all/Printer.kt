package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Printer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(4.0,18.0)
                curveTo(2.895430564880371,18.0,2.0,17.104570388793945,2.0,16.0)
                lineTo(2.0,11.0)
                curveTo(2.0,9.895430564880371,2.895430564880371,9.0,4.0,9.0)
                lineTo(20.0,9.0)
                curveTo(21.104570388793945,9.0,22.0,9.895430564880371,22.0,11.0)
                lineTo(22.0,16.0)
                curveTo(22.0,17.104570388793945,21.104570388793945,18.0,20.0,18.0)
                lineTo(18.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,9.0)
                lineTo(6.0,3.0)
                curveTo(6.0,2.4477152824401855,6.4477152824401855,2.0,7.0,2.0)
                lineTo(17.0,2.0)
                curveTo(17.552284240722656,2.0,18.0,2.4477152824401855,18.0,3.0)
                lineTo(18.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,14.0)
                lineTo(17.0,14.0)
                lineTo(18.0,14.0)
                lineTo(18.0,22.0)
                lineTo(17.0,22.0)
                lineTo(7.0,22.0)
                lineTo(6.0,22.0)
                lineTo(6.0,14.0)
                lineTo(7.0,14.0)
                close()
            }
}

public val LucideIcons.All.PrinterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Printer: ImageVector
    @Composable get() = PrinterDefinition.asImageVector()
