package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SwatchBook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,17.0f)
                curveTo(10.990151f,19.202156f,9.202178f,20.982151f,7.0f,20.982151f)
                curveTo(4.7978215f,20.982151f,3.0098484f,19.202156f,3.0f,17.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(9.0f,3.0f)
                curveTo(10.104569f,3.0f,11.0f,3.8954306f,11.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.7f,13.0f)
                lineTo(19.0f,13.0f)
                curveTo(20.10457f,13.0f,21.0f,13.895431f,21.0f,15.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(7.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,17.0f)
                lineTo(7.01f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,8.0f)
                lineTo(13.3f,5.7f)
                curveTo(13.751016f,5.2474093f,14.363886f,4.993346f,15.002832f,4.994097f)
                curveTo(15.641779f,4.9948483f,16.25405f,5.250351f,16.704f,5.704f)
                lineTo(18.6f,7.6f)
                curveTo(19.065851f,8.048098f,19.33126f,8.665162f,19.336155f,9.311525f)
                curveTo(19.341047f,9.957889f,19.085012f,10.5789f,18.626f,11.034f)
                lineTo(9.9f,19.8f)
            }
}

public val LucideIcons.All.SwatchBookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SwatchBook: ImageVector
    @Composable get() = SwatchBookDefinition.asImageVector()
