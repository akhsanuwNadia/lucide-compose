package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Turntable") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,12.01f)
                lineTo(10.01f,12.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                lineTo(18.0f,12.0f)
                curveTo(18.000546f,13.40413f,17.63152f,14.783672f,16.93f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                curveTo(5.99359f,13.433324f,6.7545805f,14.760521f,7.994818f,15.479039f)
                curveTo(9.235056f,16.197557f,10.764944f,16.197557f,12.005181f,15.479039f)
                curveTo(13.2454195f,14.760521f,14.00641f,13.433324f,14.0f,12.0f)
                curveTo(14.00641f,10.566676f,13.2454195f,9.239479f,12.005181f,8.520961f)
                curveTo(10.764944f,7.8024416f,9.235056f,7.8024416f,7.994818f,8.520961f)
                curveTo(6.7545805f,9.239479f,5.99359f,10.566676f,6.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(20.0f,4.0f)
                lineTo(22.0f,4.0f)
                lineTo(22.0f,20.0f)
                lineTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                lineTo(2.0f,20.0f)
                lineTo(2.0f,4.0f)
                lineTo(4.0f,4.0f)
                close()
            }
}

public val LucideIcons.All.TurntableDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Turntable: ImageVector
    @Composable get() = TurntableDefinition.asImageVector()
