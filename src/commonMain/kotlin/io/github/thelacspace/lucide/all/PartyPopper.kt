package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PartyPopper") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.800000190734863,11.300000190734863)
                lineTo(2.0,22.0)
                lineTo(12.699999809265137,18.209999084472656)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(4.010000228881836,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,8.0)
                lineTo(22.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,2.0)
                lineTo(15.010000228881836,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,20.0)
                lineTo(22.010000228881836,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,2.0)
                lineTo(19.760000228881836,2.75)
                curveTo(18.44504165649414,3.1880085468292236,17.623825073242188,4.495253562927246,17.799999237060547,5.869999885559082)
                curveTo(17.899999618530273,6.730000019073486,17.229999542236328,7.5,16.349998474121094,7.5)
                lineTo(15.969998359680176,7.5)
                curveTo(15.10999870300293,7.5,14.36999797821045,8.100000381469727,14.20999813079834,8.940000534057617)
                lineTo(14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,13.0)
                lineTo(21.18000030517578,12.670000076293945)
                curveTo(20.31999969482422,12.329999923706055,19.360000610351562,12.869999885559082,19.200000762939453,13.779999732971191)
                curveTo(19.09000015258789,14.479999542236328,18.48000144958496,15.0,17.770000457763672,15.0)
                lineTo(17.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,2.0)
                lineTo(11.329999923706055,2.819999933242798)
                curveTo(11.670000076293945,3.679999828338623,11.130000114440918,4.639999866485596,10.220000267028809,4.800000190734863)
                curveTo(9.520000457763672,4.900000095367432,9.0,5.519999980926514,9.0,6.230000019073486)
                lineTo(9.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,13.0)
                curveTo(12.930000305175781,14.930000305175781,13.829999923706055,17.170000076293945,13.0,18.0)
                curveTo(12.170000076293945,18.829999923706055,9.930000305175781,17.93000030517578,8.0,16.0)
                curveTo(6.070000171661377,14.069999694824219,5.170000076293945,11.829999923706055,6.0,11.0)
                curveTo(6.829999923706055,10.170000076293945,9.069999694824219,11.069999694824219,11.0,13.0)
                close()
            }
}

public val LucideIcons.All.PartyPopperDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PartyPopper: ImageVector
    @Composable get() = PartyPopperDefinition.asImageVector()
