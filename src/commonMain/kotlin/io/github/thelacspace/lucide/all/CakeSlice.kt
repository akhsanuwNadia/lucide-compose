package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CakeSlice") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,13.0)
                lineTo(3.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,17.0)
                lineTo(3.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.199999809265137,7.900000095367432)
                lineTo(3.811999797821045,10.399999618530273)
                curveTo(3.301037311553955,10.777283668518066,2.999660015106201,11.374842643737793,3.0,12.010000228881836)
                lineTo(3.0,20.0)
                curveTo(3.0,20.552284240722656,3.4477152824401855,21.0,4.0,21.0)
                lineTo(20.0,21.0)
                curveTo(20.552284240722656,21.0,21.0,20.552284240722656,21.0,20.0)
                lineTo(21.0,11.345999717712402)
                curveTo(21.0,9.345999717712402,18.559999465942383,5.319999694824219,14.559999465942383,3.3199996948242188)
                curveTo(14.219395637512207,3.1250340938568115,13.796234130859375,3.1473262310028076,13.477999687194824,3.376999616622925)
                lineTo(10.399999618530273,5.599999904632568)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,7.0)
                curveTo(6.996795177459717,7.7166619300842285,7.37729024887085,8.380260467529297,7.997409343719482,8.739520072937012)
                curveTo(8.617527961730957,9.09877872467041,9.382472038269043,9.09877872467041,10.002591133117676,8.739520072937012)
                curveTo(10.622709274291992,8.380260467529297,11.003205299377441,7.7166619300842285,11.0,7.0)
                curveTo(11.003205299377441,6.2833380699157715,10.622709274291992,5.619739532470703,10.002591133117676,5.2604804039001465)
                curveTo(9.382472038269043,4.901220798492432,8.617527961730957,4.901220798492432,7.997409343719482,5.2604804039001465)
                curveTo(7.37729024887085,5.619739532470703,6.996795177459717,6.2833380699157715,7.0,7.0)
            }
}

public val LucideIcons.All.CakeSliceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CakeSlice: ImageVector
    @Composable get() = CakeSliceDefinition.asImageVector()
