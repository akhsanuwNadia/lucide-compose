package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,16.0)
                lineTo(19.0,14.0)
                curveTo(18.995075225830078,12.898921966552734,18.101089477539062,12.00892448425293,17.0,12.00892448425293)
                curveTo(15.898910522460938,12.00892448425293,15.004923820495605,12.898921966552734,15.0,14.0)
                lineTo(15.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,15.0)
                lineTo(7.0,15.0)
                curveTo(4.790861129760742,15.0,3.0,16.790861129760742,3.0,19.0)
                lineTo(3.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,7.0)
                curveTo(5.993589878082275,8.433323860168457,6.754580497741699,9.760520935058594,7.994818210601807,10.479039192199707)
                curveTo(9.235055923461914,11.197558403015137,10.764944076538086,11.197558403015137,12.005181312561035,10.479039192199707)
                curveTo(13.2454195022583,9.760520935058594,14.006409645080566,8.433323860168457,14.0,7.0)
                curveTo(14.006409645080566,5.566676139831543,13.2454195022583,4.239479064941406,12.005181312561035,3.5209603309631348)
                curveTo(10.764944076538086,2.8024418354034424,9.235055923461914,2.8024418354034424,7.994818210601807,3.5209603309631348)
                curveTo(6.754580497741699,4.239479064941406,5.993589878082275,5.566676139831543,6.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.89900016784668,16.0)
                lineTo(20.10099983215332,16.0)
                lineTo(21.0,16.0)
                lineTo(21.0,21.0)
                lineTo(20.10099983215332,21.0)
                lineTo(13.89900016784668,21.0)
                lineTo(13.0,21.0)
                lineTo(13.0,16.0)
                lineTo(13.89900016784668,16.0)
                close()
            }
}

public val LucideIcons.All.UserLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserLock: ImageVector
    @Composable get() = UserLockDefinition.asImageVector()
