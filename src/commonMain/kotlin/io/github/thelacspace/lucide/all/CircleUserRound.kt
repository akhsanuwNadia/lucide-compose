package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleUserRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.925f,20.056f)
                curveTo(17.461346f,17.142832f,14.948907f,14.998827f,11.999073f,14.999076f)
                curveTo(9.049239f,14.999325f,6.537161f,17.143753f,6.0739994f,20.057f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,11.0f)
                curveTo(7.99359f,12.433324f,8.7545805f,13.760521f,9.994819f,14.479039f)
                curveTo(11.235056f,15.197558f,12.764944f,15.197558f,14.005181f,14.479039f)
                curveTo(15.2454195f,13.760521f,16.00641f,12.433324f,16.0f,11.0f)
                curveTo(16.00641f,9.566676f,15.2454195f,8.239479f,14.005181f,7.5209603f)
                curveTo(12.764944f,6.8024416f,11.235056f,6.8024416f,9.994819f,7.5209603f)
                curveTo(8.7545805f,8.239479f,7.99359f,9.566676f,8.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9839749f,15.583309f,3.8864517f,18.901302f,6.987046f,20.6976f)
                curveTo(10.08764f,22.493896f,13.91236f,22.493896f,17.012955f,20.6976f)
                curveTo(20.113548f,18.901302f,22.016026f,15.583309f,22.0f,12.0f)
                curveTo(22.016026f,8.416691f,20.113548f,5.0986977f,17.012955f,3.302401f)
                curveTo(13.91236f,1.5061044f,10.08764f,1.5061044f,6.987046f,3.302401f)
                curveTo(3.8864517f,5.0986977f,1.9839749f,8.416691f,2.0f,12.0f)
            }
}

public val LucideIcons.All.CircleUserRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleUserRound: ImageVector
    @Composable get() = CircleUserRoundDefinition.asImageVector()
