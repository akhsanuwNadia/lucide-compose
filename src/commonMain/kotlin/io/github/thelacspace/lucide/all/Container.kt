package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Container") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,7.699999809265137)
                curveTo(22.0,7.099999904632568,21.600000381469727,6.5,21.200000762939453,6.199999809265137)
                lineTo(14.90000057220459,2.299999713897705)
                curveTo(14.372936248779297,2.00039005279541,13.727065086364746,2.00039005279541,13.200000762939453,2.299999713897705)
                lineTo(2.90000057220459,8.299999237060547)
                curveTo(2.40000057220459,8.499999046325684,2.000000476837158,9.09999942779541,2.000000476837158,9.69999885559082)
                lineTo(2.000000476837158,16.299999237060547)
                curveTo(2.000000476837158,16.799999237060547,2.40000057220459,17.5,2.8000004291534424,17.799999237060547)
                lineTo(9.100000381469727,21.69999885559082)
                curveTo(9.62706470489502,21.999608993530273,10.27293586730957,21.999608993530273,10.800000190734863,21.69999885559082)
                lineTo(21.100000381469727,15.69999885559082)
                curveTo(21.600000381469727,15.399998664855957,22.0,14.69999885559082,22.0,14.19999885559082)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,21.899999618530273)
                lineTo(10.0,14.0)
                lineTo(2.0999999046325684,9.100000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,14.0)
                lineTo(21.899999618530273,7.099999904632568)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,19.799999237060547)
                lineTo(14.0,11.69999885559082)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,17.5)
                lineTo(18.0,9.399999618530273)
            }
}

public val LucideIcons.All.ContainerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Container: ImageVector
    @Composable get() = ContainerDefinition.asImageVector()
