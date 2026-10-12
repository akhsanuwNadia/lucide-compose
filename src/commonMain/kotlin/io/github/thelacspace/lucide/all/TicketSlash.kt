package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TicketSlash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                curveTo(3.6516172885894775,9.007386207580566,4.986613750457764,10.348365783691406,4.986613750457764,12.0)
                curveTo(4.986613750457764,13.651634216308594,3.6516172885894775,14.992613792419434,2.0,15.0)
                lineTo(2.0,17.0)
                curveTo(2.0,18.104570388793945,2.895430564880371,19.0,4.0,19.0)
                lineTo(20.0,19.0)
                curveTo(21.104570388793945,19.0,22.0,18.104570388793945,22.0,17.0)
                lineTo(22.0,15.0)
                curveTo(20.3483829498291,14.992613792419434,19.013385772705078,13.651634216308594,19.013385772705078,12.0)
                curveTo(19.013385772705078,10.348365783691406,20.3483829498291,9.007386207580566,22.0,9.0)
                lineTo(22.0,7.0)
                curveTo(22.0,5.895430564880371,21.104570388793945,5.0,20.0,5.0)
                lineTo(4.0,5.0)
                curveTo(2.895430564880371,5.0,2.0,5.895430564880371,2.0,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,14.5)
                lineTo(14.5,9.5)
            }
}

public val LucideIcons.All.TicketSlashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TicketSlash: ImageVector
    @Composable get() = TicketSlashDefinition.asImageVector()
