package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drama") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,11.0)
                lineTo(10.010000228881836,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,6.0)
                lineTo(14.010000228881836,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,6.0)
                lineTo(18.010000228881836,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5,13.100000381469727)
                lineTo(6.510000228881836,13.100000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,5.0)
                curveTo(22.0,14.0,18.0,17.0,16.0,17.0)
                curveTo(14.0,17.0,10.0,14.0,10.0,5.0)
                curveTo(10.0,3.0,12.0,2.0,16.0,2.0)
                curveTo(20.0,2.0,22.0,3.0,22.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.399999618530273,9.899999618530273)
                curveTo(16.600000381469727,10.699999809265137,15.399999618530273,10.699999809265137,14.59999942779541,9.899999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(10.100000381469727,7.099999904632568)
                curveTo(9.0,7.199999809265137,7.699999809265137,7.699999809265137,6.0,8.600000381469727)
                curveTo(2.5,10.600000381469727,1.3000001907348633,12.5,2.299999952316284,14.200000762939453)
                curveTo(6.800000190734863,22.0,11.800000190734863,22.600000381469727,13.5,21.600000381469727)
                curveTo(14.399999618530273,21.100000381469727,15.399999618530273,19.5,15.399999618530273,16.900001525878906)
            }
            lucidePath(strokeWidth) {
                moveTo(9.100000381469727,16.5)
                curveTo(9.40000057220459,15.399999618530273,10.5,14.800000190734863,11.5,15.100000381469727)
            }
}

public val LucideIcons.All.DramaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drama: ImageVector
    @Composable get() = DramaDefinition.asImageVector()
