package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlarmClockCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,13.0)
                curveTo(3.98717999458313,15.866647720336914,5.509161472320557,18.521041870117188,7.989636421203613,19.958078384399414)
                curveTo(10.470111846923828,21.395116806030273,13.529888153076172,21.395116806030273,16.01036262512207,19.958078384399414)
                curveTo(18.4908390045166,18.521041870117188,20.012819290161133,15.866647720336914,20.0,13.0)
                curveTo(20.012819290161133,10.133352279663086,18.4908390045166,7.4789581298828125,16.01036262512207,6.0419206619262695)
                curveTo(13.529888153076172,4.604883670806885,10.470111846923828,4.604883670806885,7.989636421203613,6.0419206619262695)
                curveTo(5.509161472320557,7.4789581298828125,3.98717999458313,10.133352279663086,4.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(2.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,6.0)
                lineTo(19.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.380000114440918,18.700000762939453)
                lineTo(4.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.639999389648438,18.670000076293945)
                lineTo(20.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,13.0)
                lineTo(11.0,15.0)
                lineTo(15.0,11.0)
            }
}

public val LucideIcons.All.AlarmClockCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlarmClockCheck: ImageVector
    @Composable get() = AlarmClockCheckDefinition.asImageVector()
