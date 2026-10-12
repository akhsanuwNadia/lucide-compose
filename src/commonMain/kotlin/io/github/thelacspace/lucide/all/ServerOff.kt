package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ServerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(20.0,2.0)
                curveTo(21.104570388793945,2.0,22.0,2.895430564880371,22.0,4.0)
                lineTo(22.0,8.0)
                curveTo(22.0,9.104569435119629,21.104570388793945,10.0,20.0,10.0)
                lineTo(15.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(2.5,2.5)
                curveTo(2.0,2.0,2.0,2.5,2.0,5.0)
                lineTo(2.0,8.0)
                curveTo(2.0,9.104569435119629,2.895430564880371,10.0,4.0,10.0)
                lineTo(10.0,10.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                lineTo(22.0,16.0)
                curveTo(22.0,14.895430564880371,21.104570388793945,14.0,20.0,14.0)
                lineTo(19.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                curveTo(2.895430564880371,14.0,2.0,14.895430564880371,2.0,16.0)
                lineTo(2.0,20.0)
                curveTo(2.0,21.104570388793945,2.895430564880371,22.0,4.0,22.0)
                lineTo(20.5,22.0)
                lineTo(21.5,21.5)
                lineTo(22.0,22.0)
                lineTo(14.0,14.0)
                lineTo(4.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(6.010000228881836,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.ServerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ServerOff: ImageVector
    @Composable get() = ServerOffDefinition.asImageVector()
