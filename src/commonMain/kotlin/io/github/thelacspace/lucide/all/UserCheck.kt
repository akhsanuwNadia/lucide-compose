package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,11.0)
                lineTo(18.0,13.0)
                lineTo(22.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,21.0)
                lineTo(16.0,19.0)
                curveTo(16.0,16.790861129760742,14.209138870239258,15.0,12.0,15.0)
                lineTo(6.0,15.0)
                curveTo(3.790860891342163,15.0,2.0,16.790861129760742,2.0,19.0)
                lineTo(2.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,7.0)
                curveTo(4.993589878082275,8.433323860168457,5.754580497741699,9.760520935058594,6.994818210601807,10.479039192199707)
                curveTo(8.235055923461914,11.197558403015137,9.764944076538086,11.197558403015137,11.005181312561035,10.479039192199707)
                curveTo(12.2454195022583,9.760520935058594,13.006409645080566,8.433323860168457,13.0,7.0)
                curveTo(13.006409645080566,5.566676139831543,12.2454195022583,4.239479064941406,11.005181312561035,3.5209603309631348)
                curveTo(9.764944076538086,2.8024418354034424,8.235055923461914,2.8024418354034424,6.994818210601807,3.5209603309631348)
                curveTo(5.754580497741699,4.239479064941406,4.993589878082275,5.566676139831543,5.0,7.0)
            }
}

public val LucideIcons.All.UserCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserCheck: ImageVector
    @Composable get() = UserCheckDefinition.asImageVector()
