package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("User") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,21.0)
                lineTo(19.0,19.0)
                curveTo(19.0,16.790861129760742,17.209138870239258,15.0,15.0,15.0)
                lineTo(9.0,15.0)
                curveTo(6.790861129760742,15.0,5.0,16.790861129760742,5.0,19.0)
                lineTo(5.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,7.0)
                curveTo(7.993589878082275,8.433323860168457,8.7545804977417,9.760520935058594,9.994818687438965,10.479039192199707)
                curveTo(11.235055923461914,11.197558403015137,12.764944076538086,11.197558403015137,14.005181312561035,10.479039192199707)
                curveTo(15.2454195022583,9.760520935058594,16.006410598754883,8.433323860168457,16.0,7.0)
                curveTo(16.006410598754883,5.566676139831543,15.2454195022583,4.239479064941406,14.005181312561035,3.5209603309631348)
                curveTo(12.764944076538086,2.8024418354034424,11.235055923461914,2.8024418354034424,9.994818687438965,3.5209603309631348)
                curveTo(8.7545804977417,4.239479064941406,7.993589878082275,5.566676139831543,8.0,7.0)
            }
}

public val LucideIcons.All.UserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.User: ImageVector
    @Composable get() = UserDefinition.asImageVector()
