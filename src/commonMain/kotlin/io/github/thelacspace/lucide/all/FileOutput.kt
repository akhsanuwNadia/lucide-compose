package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileOutput") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.226f,20.925f)
                curveTo(4.5707774f,21.585943f,5.2545342f,22.000284f,6.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.00157f,7.3599424f,19.747406f,6.745774f,19.294f,6.294f)
                lineTo(15.706f,2.706f)
                curveTo(15.254227f,2.2525938f,14.640058f,1.9984303f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,7.127f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,11.0f)
                lineTo(2.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,17.0f)
                lineTo(2.0f,14.0f)
                lineTo(12.0f,14.0f)
            }
}

public val LucideIcons.All.FileOutputDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileOutput: ImageVector
    @Composable get() = FileOutputDefinition.asImageVector()
