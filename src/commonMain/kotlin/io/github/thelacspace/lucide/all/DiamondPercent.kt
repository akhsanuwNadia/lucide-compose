package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DiamondPercent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.700000047683716,10.300000190734863)
                curveTo(2.2475032806396484,10.752033233642578,1.9932544231414795,11.365400314331055,1.9932544231414795,12.005000114440918)
                curveTo(1.9932544231414795,12.644599914550781,2.2475032806396484,13.257966995239258,2.700000047683716,13.710000038146973)
                lineTo(10.289999961853027,21.299999237060547)
                curveTo(10.742033004760742,21.75249671936035,11.355400085449219,22.006744384765625,11.994999885559082,22.006744384765625)
                curveTo(12.634599685668945,22.006744384765625,13.247966766357422,21.75249671936035,13.699999809265137,21.299999237060547)
                lineTo(21.290000915527344,13.709999084472656)
                curveTo(21.74249839782715,13.257966041564941,21.996746063232422,12.644598960876465,21.996746063232422,12.004999160766602)
                curveTo(21.996746063232422,11.365399360656738,21.74249839782715,10.752032279968262,21.290000915527344,10.299999237060547)
                lineTo(13.699999809265137,2.7100000381469727)
                curveTo(13.247966766357422,2.2575032711029053,12.634599685668945,2.0032544136047363,11.994999885559082,2.0032544136047363)
                curveTo(11.355400085449219,2.0032544136047363,10.742033004760742,2.2575032711029053,10.289999961853027,2.7100000381469727)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.199999809265137,9.199999809265137)
                lineTo(9.210000038146973,9.199999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5,9.5)
                lineTo(9.5,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(14.699999809265137,14.800000190734863)
                lineTo(14.710000038146973,14.800000190734863)
            }
}

public val LucideIcons.All.DiamondPercentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DiamondPercent: ImageVector
    @Composable get() = DiamondPercentDefinition.asImageVector()
