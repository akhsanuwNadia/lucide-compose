package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EthernetPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(10.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                lineTo(14.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                lineTo(18.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,17.0)
                curveTo(18.261232376098633,16.99992561340332,17.582590103149414,17.40711212158203,17.235000610351562,18.05900001525879)
                lineTo(16.76500129699707,18.94099998474121)
                curveTo(16.41741180419922,19.59288787841797,15.738767623901367,20.00007438659668,15.0,20.0)
                lineTo(9.0,20.0)
                curveTo(8.261232376098633,20.00007438659668,7.582590103149414,19.59288787841797,7.235000133514404,18.94099998474121)
                lineTo(6.765000343322754,18.05900001525879)
                curveTo(6.417410373687744,17.40711212158203,5.738767623901367,16.99992561340332,5.0,17.0)
                lineTo(4.0,17.0)
                curveTo(2.895430564880371,17.0,2.0,16.104570388793945,2.0,15.0)
                lineTo(2.0,6.0)
                curveTo(2.0,4.895430564880371,2.895430564880371,4.0,4.0,4.0)
                lineTo(20.0,4.0)
                curveTo(21.104570388793945,4.0,22.0,4.895430564880371,22.0,6.0)
                lineTo(22.0,15.0)
                curveTo(22.0,16.104570388793945,21.104570388793945,17.0,20.0,17.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(6.0,9.0)
            }
}

public val LucideIcons.All.EthernetPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EthernetPort: ImageVector
    @Composable get() = EthernetPortDefinition.asImageVector()
