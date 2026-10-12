package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ServerCrash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,10.0)
                lineTo(4.0,10.0)
                curveTo(2.895430564880371,10.0,2.0,9.104569435119629,2.0,8.0)
                lineTo(2.0,4.0)
                curveTo(2.0,2.895430564880371,2.895430564880371,2.0,4.0,2.0)
                lineTo(20.0,2.0)
                curveTo(21.104570388793945,2.0,22.0,2.895430564880371,22.0,4.0)
                lineTo(22.0,8.0)
                curveTo(22.0,9.104569435119629,21.104570388793945,10.0,20.0,10.0)
                lineTo(18.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                lineTo(4.0,14.0)
                curveTo(2.895430564880371,14.0,2.0,14.895430564880371,2.0,16.0)
                lineTo(2.0,20.0)
                curveTo(2.0,21.104570388793945,2.895430564880371,22.0,4.0,22.0)
                lineTo(20.0,22.0)
                curveTo(21.104570388793945,22.0,22.0,21.104570388793945,22.0,20.0)
                lineTo(22.0,16.0)
                curveTo(22.0,14.895430564880371,21.104570388793945,14.0,20.0,14.0)
                lineTo(18.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(6.010000228881836,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(6.010000228881836,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,6.0)
                lineTo(9.0,12.0)
                lineTo(15.0,12.0)
                lineTo(11.0,18.0)
            }
}

public val LucideIcons.All.ServerCrashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ServerCrash: ImageVector
    @Composable get() = ServerCrashDefinition.asImageVector()
