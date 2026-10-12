package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hourglass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,22.0)
                lineTo(19.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,2.0)
                lineTo(19.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,22.0)
                lineTo(17.0,17.827999114990234)
                curveTo(16.99988555908203,17.297609329223633,16.789098739624023,16.788984298706055,16.413999557495117,16.413999557495117)
                lineTo(12.0,12.0)
                lineTo(7.585999965667725,16.413999557495117)
                curveTo(7.210901260375977,16.788984298706055,7.000113487243652,17.297609329223633,7.0,17.827999114990234)
                lineTo(7.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(7.0,6.171999931335449)
                curveTo(7.000113487243652,6.702389717102051,7.210901260375977,7.211014270782471,7.585999965667725,7.585999965667725)
                lineTo(12.0,12.0)
                lineTo(16.413999557495117,7.585999965667725)
                curveTo(16.789098739624023,7.211014747619629,16.999887466430664,6.702389717102051,17.0,6.171999931335449)
                lineTo(17.0,2.0)
            }
}

public val LucideIcons.All.HourglassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hourglass: ImageVector
    @Composable get() = HourglassDefinition.asImageVector()
