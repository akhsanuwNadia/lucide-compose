package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareM") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,16.0f)
                lineTo(8.0f,8.5f)
                curveTo(8.0f,8.284785f,8.137715f,8.093716f,8.341886f,8.025659f)
                curveTo(8.546057f,7.9576015f,8.77087f,8.027828f,8.9f,8.2f)
                lineTo(11.599999f,11.799f)
                curveTo(11.694427f,11.924903f,11.842621f,11.999f,12.0f,11.999f)
                curveTo(12.157378f,11.999f,12.3055725f,11.924903f,12.4f,11.799f)
                lineTo(15.099999f,8.198999f)
                curveTo(15.229129f,8.026828f,15.453942f,7.956601f,15.6581135f,8.024658f)
                curveTo(15.862284f,8.092715f,15.999999f,8.283785f,15.999999f,8.499f)
                lineTo(15.999999f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.SquareMDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareM: ImageVector
    @Composable get() = SquareMDefinition.asImageVector()
