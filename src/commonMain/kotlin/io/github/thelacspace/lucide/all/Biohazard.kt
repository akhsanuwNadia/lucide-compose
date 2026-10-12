package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Biohazard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,11.899999618530273)
                curveTo(9.996794700622559,12.616661071777344,10.377290725708008,13.28026008605957,10.997408866882324,13.639519691467285)
                curveTo(11.617527961730957,13.998778343200684,12.382472038269043,13.998778343200684,13.002591133117676,13.639519691467285)
                curveTo(13.622709274291992,13.28026008605957,14.003205299377441,12.616661071777344,14.0,11.899999618530273)
                curveTo(14.003205299377441,11.183338165283203,13.622709274291992,10.519739151000977,13.002591133117676,10.160479545593262)
                curveTo(12.382472038269043,9.801220893859863,11.617527961730957,9.801220893859863,10.997408866882324,10.160479545593262)
                curveTo(10.377290725708008,10.519739151000977,9.996794700622559,11.183338165283203,10.0,11.899999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(6.699999809265137,3.4000000953674316)
                curveTo(5.799999713897705,5.900000095367432,6.699999809265137,8.600000381469727,8.899999618530273,10.100000381469727)
                curveTo(6.5,9.0,3.700000047683716,9.600000381469727,2.0,11.600000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(8.899999618530273,10.100000381469727)
                lineTo(10.299999237060547,10.90000057220459)
            }
            lucidePath(strokeWidth) {
                moveTo(17.299999237060547,3.4000000953674316)
                curveTo(18.19999885559082,5.900000095367432,17.299999237060547,8.600000381469727,15.09999942779541,10.100000381469727)
                curveTo(17.5,8.90000057220459,20.299999237060547,9.5,22.0,11.600000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(15.100000381469727,10.100000381469727)
                lineTo(13.700000762939453,10.90000057220459)
            }
            lucidePath(strokeWidth) {
                moveTo(16.700000762939453,20.799999237060547)
                curveTo(14.100000381469727,20.399999618530273,12.100000381469727,18.19999885559082,12.000000953674316,15.499999046325684)
                curveTo(11.80000114440918,18.099998474121094,9.900001525878906,20.299999237060547,7.30000114440918,20.69999885559082)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,13.899999618530273)
                lineTo(12.0,15.5)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5,5.400000095367432)
                curveTo(12.5,5.200000286102295,11.5,5.200000286102295,10.5,5.400000095367432)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,16.399999618530273)
                curveTo(17.700000762939453,15.699999809265137,18.200000762939453,14.799999237060547,18.5,13.899999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(5.5,13.899999618530273)
                curveTo(5.800000190734863,14.799999237060547,6.300000190734863,15.699999809265137,7.0,16.399999618530273)
            }
}

public val LucideIcons.All.BiohazardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Biohazard: ImageVector
    @Composable get() = BiohazardDefinition.asImageVector()
