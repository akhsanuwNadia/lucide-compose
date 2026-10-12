package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Timer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(14.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(15.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                curveTo(3.98717999458313,16.866647720336914,5.509161472320557,19.521041870117188,7.989636421203613,20.958078384399414)
                curveTo(10.470111846923828,22.395116806030273,13.529888153076172,22.395116806030273,16.01036262512207,20.958078384399414)
                curveTo(18.4908390045166,19.521041870117188,20.012819290161133,16.866647720336914,20.0,14.0)
                curveTo(20.012819290161133,11.133352279663086,18.4908390045166,8.478958129882812,16.01036262512207,7.0419206619262695)
                curveTo(13.529888153076172,5.604883670806885,10.470111846923828,5.604883670806885,7.989636421203613,7.0419206619262695)
                curveTo(5.509161472320557,8.478958129882812,3.98717999458313,11.133352279663086,4.0,14.0)
            }
}

public val LucideIcons.All.TimerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Timer: ImageVector
    @Composable get() = TimerDefinition.asImageVector()
