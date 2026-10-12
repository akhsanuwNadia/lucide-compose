package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Laptop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,5.0)
                curveTo(19.104570388793945,5.0,20.0,5.895430564880371,20.0,7.0)
                lineTo(20.0,15.526000022888184)
                curveTo(19.99986457824707,15.837428092956543,20.072460174560547,16.14458465576172,20.211999893188477,16.42300033569336)
                lineTo(21.280000686645508,18.55000114440918)
                curveTo(21.43678092956543,18.86111068725586,21.420347213745117,19.23138999938965,21.23662567138672,19.527389526367188)
                curveTo(21.052902221679688,19.823387145996094,20.72837257385254,20.0024356842041,20.380001068115234,20.000001907348633)
                lineTo(3.619999885559082,20.000001907348633)
                curveTo(3.27162766456604,20.0024356842041,2.9470982551574707,19.823387145996094,2.7633755207061768,19.527389526367188)
                curveTo(2.5796525478363037,19.23138999938965,2.5632197856903076,18.86111068725586,2.7199997901916504,18.55000114440918)
                lineTo(3.7879996299743652,16.42300033569336)
                curveTo(3.9275403022766113,16.14458465576172,4.0001349449157715,15.837428092956543,4.0,15.526000022888184)
                lineTo(4.0,7.0)
                curveTo(4.0,5.895430564880371,4.895430564880371,5.0,6.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.054000854492188,15.987000465393066)
                lineTo(3.946000099182129,15.987000465393066)
            }
}

public val LucideIcons.All.LaptopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Laptop: ImageVector
    @Composable get() = LaptopDefinition.asImageVector()
