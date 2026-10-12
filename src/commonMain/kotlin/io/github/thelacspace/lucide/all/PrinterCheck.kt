package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PrinterCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5,22.0)
                lineTo(7.0,22.0)
                curveTo(6.4477152824401855,22.0,6.0,21.552284240722656,6.0,21.0)
                lineTo(6.0,15.0)
                curveTo(6.0,14.447714805603027,6.4477152824401855,14.0,7.0,14.0)
                lineTo(17.0,14.0)
                curveTo(17.552284240722656,14.0,18.0,14.447714805603027,18.0,15.0)
                lineTo(18.0,15.5)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(18.0,21.0)
                lineTo(22.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(4.0,18.0)
                curveTo(2.895430564880371,18.0,2.0,17.104570388793945,2.0,16.0)
                lineTo(2.0,11.0)
                curveTo(2.0,9.895430564880371,2.895430564880371,9.0,4.0,9.0)
                lineTo(20.0,9.0)
                curveTo(21.104570388793945,9.0,22.0,9.895430564880371,22.0,11.0)
                lineTo(22.0,13.0)
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

public val LucideIcons.All.PrinterCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PrinterCheck: ImageVector
    @Composable get() = PrinterCheckDefinition.asImageVector()
