package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pentagon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.829999923706055,2.380000114440918)
                curveTo(11.528613090515137,1.8760888576507568,12.471386909484863,1.8760888576507568,13.170000076293945,2.380000114440918)
                lineTo(21.170000076293945,8.119999885559082)
                curveTo(21.878311157226562,8.630300521850586,22.17380142211914,9.541058540344238,21.899999618530273,10.369999885559082)
                lineTo(18.860000610351562,19.630001068115234)
                curveTo(18.588319778442383,20.448575973510742,17.82248306274414,21.00078582763672,16.96000099182129,21.000001907348633)
                lineTo(7.039999961853027,21.000001907348633)
                curveTo(6.177517414093018,21.00078582763672,5.411681175231934,20.448575973510742,5.139999866485596,19.630001068115234)
                lineTo(2.0999999046325684,10.369999885559082)
                curveTo(1.8261977434158325,9.541058540344238,2.1216881275177,8.630300521850586,2.8299999237060547,8.119999885559082)
                close()
            }
}

public val LucideIcons.All.PentagonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pentagon: ImageVector
    @Composable get() = PentagonDefinition.asImageVector()
