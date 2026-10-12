package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Glasses") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,15.0f)
                curveTo(1.99359f,16.433323f,2.7545807f,17.76052f,3.9948182f,18.47904f)
                curveTo(5.235056f,19.197557f,6.764944f,19.197557f,8.005181f,18.47904f)
                curveTo(9.2454195f,17.76052f,10.00641f,16.433323f,10.0f,15.0f)
                curveTo(10.00641f,13.566676f,9.2454195f,12.239479f,8.005181f,11.520961f)
                curveTo(6.764944f,10.802442f,5.235056f,10.802442f,3.9948182f,11.520961f)
                curveTo(2.7545807f,12.239479f,1.99359f,13.566676f,2.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.0f)
                curveTo(13.99359f,16.433323f,14.7545805f,17.76052f,15.994819f,18.47904f)
                curveTo(17.235056f,19.197557f,18.764944f,19.197557f,20.005182f,18.47904f)
                curveTo(21.245419f,17.76052f,22.00641f,16.433323f,22.0f,15.0f)
                curveTo(22.00641f,13.566676f,21.245419f,12.239479f,20.005182f,11.520961f)
                curveTo(18.764944f,10.802442f,17.235056f,10.802442f,15.994819f,11.520961f)
                curveTo(14.7545805f,12.239479f,13.99359f,13.566676f,14.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.0f)
                curveTo(14.0f,13.895431f,13.104569f,13.0f,12.0f,13.0f)
                curveTo(10.895431f,13.0f,10.0f,13.895431f,10.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.5f,13.0f)
                lineTo(5.0f,7.0f)
                curveTo(5.7f,5.7f,6.4f,5.0f,8.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f,13.0f)
                lineTo(19.0f,7.0f)
                curveTo(18.3f,5.7f,17.5f,5.0f,16.0f,5.0f)
            }
}

public val LucideIcons.All.GlassesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Glasses: ImageVector
    @Composable get() = GlassesDefinition.asImageVector()
