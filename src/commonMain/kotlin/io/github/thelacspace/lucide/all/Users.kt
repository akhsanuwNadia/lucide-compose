package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Users") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,21.0)
                lineTo(16.0,19.0)
                curveTo(16.0,16.790861129760742,14.209138870239258,15.0,12.0,15.0)
                lineTo(6.0,15.0)
                curveTo(3.790860891342163,15.0,2.0,16.790861129760742,2.0,19.0)
                lineTo(2.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,3.128000020980835)
                curveTo(17.764209747314453,3.585364818572998,18.996198654174805,5.177468299865723,18.996198654174805,7.0)
                curveTo(18.996198654174805,8.822531700134277,17.764209747314453,10.414634704589844,16.0,10.871999740600586)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,21.0)
                lineTo(22.0,19.0)
                curveTo(21.998640060424805,17.1771183013916,20.764999389648438,15.58572006225586,19.0,15.130000114440918)
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

public val LucideIcons.All.UsersDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Users: ImageVector
    @Composable get() = UsersDefinition.asImageVector()
