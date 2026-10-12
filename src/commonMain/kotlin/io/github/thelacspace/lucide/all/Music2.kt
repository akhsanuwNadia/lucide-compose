package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Music2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                curveTo(3.9935898780822754,19.43332290649414,4.754580497741699,20.760520935058594,5.994818210601807,21.479040145874023)
                curveTo(7.235055923461914,22.19755744934082,8.764944076538086,22.19755744934082,10.005181312561035,21.479040145874023)
                curveTo(11.2454195022583,20.760520935058594,12.006409645080566,19.43332290649414,12.0,18.0)
                curveTo(12.006409645080566,16.56667709350586,11.2454195022583,15.239479064941406,10.005181312561035,14.520960807800293)
                curveTo(8.764944076538086,13.802441596984863,7.235055923461914,13.802441596984863,5.994818210601807,14.520960807800293)
                curveTo(4.754580497741699,15.239479064941406,3.9935898780822754,16.56667709350586,4.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,2.0)
                lineTo(19.0,6.0)
            }
}

public val LucideIcons.All.Music2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Music2: ImageVector
    @Composable get() = Music2Definition.asImageVector()
