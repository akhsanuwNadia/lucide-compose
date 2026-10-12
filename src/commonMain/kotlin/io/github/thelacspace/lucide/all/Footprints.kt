package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Footprints") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,16.0)
                lineTo(4.0,13.619999885559082)
                curveTo(4.0,11.5,2.9700000286102295,10.5,3.0,8.0)
                curveTo(3.0299999713897705,5.279999732971191,4.489999771118164,2.0,7.5,2.0)
                curveTo(9.369999885559082,2.0,10.0,3.799999952316284,10.0,5.5)
                curveTo(10.0,8.609999656677246,8.0,11.15999984741211,8.0,14.180000305175781)
                lineTo(8.0,16.0)
                curveTo(8.003205299377441,16.71666145324707,7.62270975112915,17.380260467529297,7.002590656280518,17.739519119262695)
                curveTo(6.382472038269043,18.098779678344727,5.617527961730957,18.098779678344727,4.997409343719482,17.739519119262695)
                curveTo(4.37729024887085,17.380260467529297,3.9967949390411377,16.71666145324707,4.0,16.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,20.0)
                lineTo(20.0,17.619998931884766)
                curveTo(20.0,15.499999046325684,21.030000686645508,14.499999046325684,21.0,11.999999046325684)
                curveTo(20.969999313354492,9.279998779296875,19.510000228881836,5.999999046325684,16.5,5.999999046325684)
                curveTo(14.630000114440918,6.0,14.0,7.800000190734863,14.0,9.5)
                curveTo(14.0,12.609999656677246,16.0,15.15999984741211,16.0,18.18000030517578)
                lineTo(16.0,20.0)
                curveTo(15.996794700622559,20.71666145324707,16.377290725708008,21.380260467529297,16.99740982055664,21.739519119262695)
                curveTo(17.61752700805664,22.098779678344727,18.38247299194336,22.098779678344727,19.00259017944336,21.739519119262695)
                curveTo(19.622709274291992,21.380260467529297,20.003204345703125,20.71666145324707,20.0,20.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,17.0)
                lineTo(20.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,13.0)
                lineTo(8.0,13.0)
            }
}

public val LucideIcons.All.FootprintsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Footprints: ImageVector
    @Composable get() = FootprintsDefinition.asImageVector()
