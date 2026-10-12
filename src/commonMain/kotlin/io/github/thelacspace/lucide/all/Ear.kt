package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ear") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,8.5)
                curveTo(5.989583492279053,6.170848846435547,7.226193428039551,4.014153480529785,9.24158000946045,2.8465607166290283)
                curveTo(11.256965637207031,1.678967833518982,13.743034362792969,1.678967833518982,15.75841999053955,2.8465607166290283)
                curveTo(17.773805618286133,4.014153480529785,19.01041603088379,6.170848846435547,19.0,8.5)
                curveTo(19.0,14.5,13.0,14.5,13.0,18.5)
                curveTo(13.005608558654785,19.75415802001953,12.339741706848145,20.915454864501953,11.254533767700195,21.544158935546875)
                curveTo(10.169325828552246,22.172863006591797,8.830674171447754,22.172863006591797,7.7454657554626465,21.544158935546875)
                curveTo(6.6602582931518555,20.915454864501953,5.994391441345215,19.75415802001953,6.0,18.5)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,8.5)
                curveTo(14.993844985961914,7.123652458190918,13.876361846923828,6.011155605316162,12.5,6.011155605316162)
                curveTo(11.123638153076172,6.011155605316162,10.006155014038086,7.123652458190918,10.0,8.5)
                lineTo(10.0,9.5)
                curveTo(10.71666145324707,9.496794700622559,11.380260467529297,9.877290725708008,11.739520072937012,10.497408866882324)
                curveTo(12.09877872467041,11.117527961730957,12.09877872467041,11.882472038269043,11.739520072937012,12.502591133117676)
                curveTo(11.380260467529297,13.122709274291992,10.71666145324707,13.503205299377441,10.0,13.5)
            }
}

public val LucideIcons.All.EarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ear: ImageVector
    @Composable get() = EarDefinition.asImageVector()
