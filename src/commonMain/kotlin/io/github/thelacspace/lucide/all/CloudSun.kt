package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudSun") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f,4.93f)
                lineTo(6.3399997f,6.3399997f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.07f,4.93f)
                lineTo(17.66f,6.3399997f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.947f,12.65f)
                curveTo(16.198185f,11.12846f,15.552331f,9.598037f,14.287012f,8.716478f)
                curveTo(13.021693f,7.834919f,11.362296f,7.759253f,10.021999f,8.521999f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,22.0f)
                lineTo(7.0f,22.0f)
                curveTo(4.3688736f,21.999464f,2.1883426f,19.959892f,2.0122328f,17.334665f)
                curveTo(1.8361231f,14.70944f,3.7246983f,12.396898f,6.332178f,12.044937f)
                curveTo(8.939658f,11.692975f,11.373775f,13.422033f,11.9f,16.0f)
                lineTo(13.0f,16.0f)
                curveTo(14.651617f,16.007387f,15.986613f,17.348366f,15.986613f,19.0f)
                curveTo(15.986613f,20.651634f,14.651617f,21.992613f,13.0f,22.0f)
                close()
            }
}

public val LucideIcons.All.CloudSunDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudSun: ImageVector
    @Composable get() = CloudSunDefinition.asImageVector()
