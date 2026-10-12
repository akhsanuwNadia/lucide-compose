package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cast") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                lineTo(2.0,6.0)
                curveTo(2.0,4.895430564880371,2.895430564880371,4.0,4.0,4.0)
                lineTo(20.0,4.0)
                curveTo(21.104570388793945,4.0,22.0,4.895430564880371,22.0,6.0)
                lineTo(22.0,18.0)
                curveTo(22.0,19.104570388793945,21.104570388793945,20.0,20.0,20.0)
                lineTo(14.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                curveTo(6.218951225280762,12.447714805603027,9.552285194396973,15.781048774719238,10.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,16.0)
                curveTo(4.031919956207275,16.37843132019043,5.621567726135254,17.968080520629883,6.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,20.0)
                lineTo(2.009999990463257,20.0)
            }
}

public val LucideIcons.All.CastDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cast: ImageVector
    @Composable get() = CastDefinition.asImageVector()
