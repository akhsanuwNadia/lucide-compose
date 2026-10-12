package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileSignal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(14.0,2.0)
                curveTo(14.639365196228027,1.9989635944366455,15.252715110778809,2.2530863285064697,15.704000473022461,2.7059998512268066)
                lineTo(19.29199981689453,6.293999671936035)
                curveTo(19.746139526367188,6.745443820953369,20.001039505004883,7.359653472900391,20.0,8.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,15.0)
                lineTo(8.010000228881836,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.5,13.5)
                curveTo(12.166666984558105,14.38888931274414,12.166666984558105,15.61111068725586,11.5,16.5)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                curveTo(16.33333396911621,13.777777671813965,16.33333396911621,16.22222137451172,15.0,18.0)
            }
}

public val LucideIcons.All.FileSignalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileSignal: ImageVector
    @Composable get() = FileSignalDefinition.asImageVector()
