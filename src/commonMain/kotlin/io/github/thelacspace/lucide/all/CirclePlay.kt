package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CirclePlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,9.003f)
                curveTo(8.99891f,8.641666f,9.192832f,8.307848f,9.507257f,8.129805f)
                curveTo(9.821684f,7.951761f,10.207704f,7.9571877f,10.517f,8.144f)
                lineTo(15.514f,11.141f)
                curveTo(15.816634f,11.321374f,16.002026f,11.64769f,16.002026f,12.0f)
                curveTo(16.002026f,12.35231f,15.816634f,12.678626f,15.514f,12.859f)
                lineTo(10.517f,15.856f)
                curveTo(10.20755f,16.042906f,9.821315f,16.04824f,9.506821f,15.869951f)
                curveTo(9.192327f,15.691663f,8.998547f,15.357512f,9.0f,14.996f)
                close()
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

public val LucideIcons.All.CirclePlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CirclePlay: ImageVector
    @Composable get() = CirclePlayDefinition.asImageVector()
