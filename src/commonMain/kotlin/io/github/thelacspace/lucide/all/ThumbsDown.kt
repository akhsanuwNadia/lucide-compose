package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThumbsDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,18.1200008392334)
                lineTo(10.0,14.0)
                lineTo(4.170000076293945,14.0)
                curveTo(3.5404856204986572,14.0,2.947709083557129,13.703611373901367,2.570000410079956,13.199999809265137)
                curveTo(2.192291498184204,12.696388244628906,2.0737361907958984,12.044334411621094,2.25,11.440000534057617)
                lineTo(4.579999923706055,3.440000534057617)
                curveTo(4.828888416290283,2.586667060852051,5.611111164093018,2.0,6.5,2.0)
                lineTo(20.0,2.0)
                curveTo(21.104570388793945,2.0,22.0,2.895430564880371,22.0,4.0)
                lineTo(22.0,12.0)
                curveTo(22.0,13.104569435119629,21.104570388793945,14.0,20.0,14.0)
                lineTo(17.239999771118164,14.0)
                curveTo(16.481056213378906,14.000402450561523,15.78773021697998,14.430341720581055,15.449999809265137,15.109999656677246)
                lineTo(12.0,22.0)
                curveTo(11.044645309448242,21.988170623779297,10.147010803222656,21.54064178466797,9.56259536743164,20.7847957611084)
                curveTo(8.978179931640625,20.02895164489746,8.770990371704102,19.047574996948242,9.0,18.119998931884766)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,14.0)
                lineTo(17.0,2.0)
            }
}

public val LucideIcons.All.ThumbsDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThumbsDown: ImageVector
    @Composable get() = ThumbsDownDefinition.asImageVector()
