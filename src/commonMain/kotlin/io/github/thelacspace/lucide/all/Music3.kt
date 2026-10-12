package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Music3") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                curveTo(7.993589878082275,19.43332290649414,8.7545804977417,20.760520935058594,9.994818687438965,21.479040145874023)
                curveTo(11.235055923461914,22.19755744934082,12.764944076538086,22.19755744934082,14.005181312561035,21.479040145874023)
                curveTo(15.2454195022583,20.760520935058594,16.006410598754883,19.43332290649414,16.0,18.0)
                curveTo(16.006410598754883,16.56667709350586,15.2454195022583,15.239479064941406,14.005181312561035,14.520960807800293)
                curveTo(12.764944076538086,13.802441596984863,11.235055923461914,13.802441596984863,9.994818687438965,14.520960807800293)
                curveTo(8.7545804977417,15.239479064941406,7.993589878082275,16.56667709350586,8.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,18.0)
                lineTo(16.0,2.0)
            }
}

public val LucideIcons.All.Music3Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Music3: ImageVector
    @Composable get() = Music3Definition.asImageVector()
