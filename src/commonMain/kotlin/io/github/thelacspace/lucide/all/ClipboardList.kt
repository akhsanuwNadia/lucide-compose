package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardList") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(15.0,2.0)
                curveTo(15.552285194396973,2.0,16.0,2.4477152824401855,16.0,3.0)
                lineTo(16.0,5.0)
                curveTo(16.0,5.5522847175598145,15.552285194396973,6.0,15.0,6.0)
                lineTo(9.0,6.0)
                curveTo(8.447714805603027,6.0,8.0,5.5522847175598145,8.0,5.0)
                lineTo(8.0,3.0)
                curveTo(8.0,2.4477152824401855,8.447714805603027,2.0,9.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,4.0)
                lineTo(18.0,4.0)
                curveTo(19.104570388793945,4.0,20.0,4.895430564880371,20.0,6.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,6.0)
                curveTo(4.0,4.895430564880371,4.895430564880371,4.0,6.0,4.0)
                lineTo(8.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,11.0)
                lineTo(16.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,11.0)
                lineTo(8.010000228881836,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                lineTo(8.010000228881836,16.0)
            }
}

public val LucideIcons.All.ClipboardListDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardList: ImageVector
    @Composable get() = ClipboardListDefinition.asImageVector()
