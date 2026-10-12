package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,17.0)
                lineTo(4.0,17.0)
                curveTo(2.895430564880371,17.0,2.0,16.104570388793945,2.0,15.0)
                lineTo(2.0,5.0)
                curveTo(1.9999858140945435,4.211087226867676,2.4637370109558105,3.4958763122558594,3.184000015258789,3.1740000247955322)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.656000137329102,3.0)
                lineTo(20.0,3.0)
                curveTo(21.104570388793945,3.0,22.0,3.895430564880371,22.0,5.0)
                lineTo(22.0,15.0)
                curveTo(21.99996566772461,15.36766242980957,21.89858627319336,15.72819995880127,21.707000732421875,16.04199981689453)
            }
}

public val LucideIcons.All.MonitorOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorOff: ImageVector
    @Composable get() = MonitorOffDefinition.asImageVector()
