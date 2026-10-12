package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Disc2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9839749f,15.583309f,3.8864517f,18.901302f,6.987046f,20.6976f)
                curveTo(10.08764f,22.493896f,13.91236f,22.493896f,17.012955f,20.6976f)
                curveTo(20.113548f,18.901302f,22.016026f,15.583309f,22.0f,12.0f)
                curveTo(22.016026f,8.416691f,20.113548f,5.0986977f,17.012955f,3.302401f)
                curveTo(13.91236f,1.5061044f,10.08764f,1.5061044f,6.987046f,3.302401f)
                curveTo(3.8864517f,5.0986977f,1.9839749f,8.416691f,2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                curveTo(7.99359f,13.433324f,8.7545805f,14.760521f,9.994819f,15.479039f)
                curveTo(11.235056f,16.197557f,12.764944f,16.197557f,14.005181f,15.479039f)
                curveTo(15.2454195f,14.760521f,16.00641f,13.433324f,16.0f,12.0f)
                curveTo(16.00641f,10.566676f,15.2454195f,9.239479f,14.005181f,8.520961f)
                curveTo(12.764944f,7.8024416f,11.235056f,7.8024416f,9.994819f,8.520961f)
                curveTo(8.7545805f,9.239479f,7.99359f,10.566676f,8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.01f,12.0f)
            }
}

public val LucideIcons.All.Disc2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Disc2: ImageVector
    @Composable get() = Disc2Definition.asImageVector()
