package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tickets") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.1730000972747803,8.180000305175781)
                lineTo(14.17300033569336,3.1800003051757812)
                curveTo(15.178176879882812,2.723809242248535,16.362886428833008,3.168243169784546,16.81999969482422,4.173000335693359)
                lineTo(18.559999465942383,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,10.0)
                lineTo(6.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                lineTo(6.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,19.0)
                lineTo(6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                lineTo(20.0,8.0)
                lineTo(22.0,8.0)
                lineTo(22.0,21.0)
                lineTo(20.0,21.0)
                lineTo(4.0,21.0)
                lineTo(2.0,21.0)
                lineTo(2.0,8.0)
                lineTo(4.0,8.0)
                close()
            }
}

public val LucideIcons.All.TicketsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tickets: ImageVector
    @Composable get() = TicketsDefinition.asImageVector()
