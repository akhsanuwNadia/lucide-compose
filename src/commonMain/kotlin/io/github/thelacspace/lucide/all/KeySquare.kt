package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KeySquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.399999618530273,2.700000047683716)
                curveTo(13.358882904052734,1.8107073307037354,14.841115951538086,1.8107073307037354,15.799999237060547,2.700000047683716)
                lineTo(21.299999237060547,8.199999809265137)
                curveTo(22.189292907714844,9.158883094787598,22.189292907714844,10.641117095947266,21.299999237060547,11.600000381469727)
                lineTo(17.599998474121094,15.300000190734863)
                curveTo(16.641115188598633,16.189292907714844,15.158882141113281,16.189292907714844,14.19999885559082,15.300000190734863)
                lineTo(8.699999809265137,9.800000190734863)
                curveTo(7.810706615447998,8.841116905212402,7.810706615447998,7.358882904052734,8.699999809265137,6.400000095367432)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,7.0)
                lineTo(17.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.399999618530273,10.600000381469727)
                lineTo(2.5859994888305664,17.41400146484375)
                curveTo(2.2109014987945557,17.788986206054688,2.0001137256622314,18.297611236572266,2.0,18.827999114990234)
                lineTo(2.0,21.0)
                curveTo(2.0,21.552284240722656,2.4477152824401855,22.0,3.0,22.0)
                lineTo(6.0,22.0)
                curveTo(6.5522847175598145,22.0,7.0,21.552284240722656,7.0,21.0)
                lineTo(7.0,20.0)
                curveTo(7.0,19.447715759277344,7.4477152824401855,19.0,8.0,19.0)
                lineTo(9.0,19.0)
                curveTo(9.552285194396973,19.0,10.0,18.552284240722656,10.0,18.0)
                lineTo(10.0,17.0)
                curveTo(10.0,16.447715759277344,10.447714805603027,16.0,11.0,16.0)
                lineTo(11.17199993133545,16.0)
                curveTo(11.70238971710205,15.999886512756348,12.211014747619629,15.789098739624023,12.586000442504883,15.413999557495117)
                lineTo(13.40000057220459,14.59999942779541)
            }
}

public val LucideIcons.All.KeySquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KeySquare: ImageVector
    @Composable get() = KeySquareDefinition.asImageVector()
