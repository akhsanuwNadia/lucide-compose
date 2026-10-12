package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Infinity") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,16.0)
                curveTo(11.0,16.0,13.0,8.0,18.0,8.0)
                curveTo(20.20215606689453,8.009848594665527,21.98215103149414,9.797821998596191,21.98215103149414,12.0)
                curveTo(21.98215103149414,14.202178001403809,20.20215606689453,15.990151405334473,18.0,16.0)
                curveTo(13.0,16.0,11.0,8.0,6.0,8.0)
                curveTo(4.566676139831543,7.993589878082275,3.2394790649414062,8.7545804977417,2.5209603309631348,9.994818687438965)
                curveTo(1.8024417161941528,11.235055923461914,1.8024417161941528,12.764944076538086,2.5209603309631348,14.005181312561035)
                curveTo(3.2394790649414062,15.2454195022583,4.566676139831543,16.006410598754883,6.0,16.0)
            }
}

public val LucideIcons.All.InfinityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Infinity: ImageVector
    @Composable get() = InfinityDefinition.asImageVector()
