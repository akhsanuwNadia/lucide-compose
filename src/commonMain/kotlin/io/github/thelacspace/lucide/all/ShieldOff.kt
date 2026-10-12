package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,5.0)
                curveTo(4.4477152824401855,5.0,4.0,5.4477152824401855,4.0,6.0)
                lineTo(4.0,13.0)
                curveTo(4.0,18.0,7.5,20.5,11.670000076293945,21.939998626708984)
                curveTo(11.885537147521973,22.02028465270996,12.122162818908691,22.02381706237793,12.34000015258789,21.94999885559082)
                curveTo(14.690000534057617,21.1299991607666,16.81999969482422,19.979999542236328,18.239999771118164,18.23999786376953)
            }
            lucidePath(strokeWidth) {
                moveTo(9.309000015258789,3.6519999504089355)
                curveTo(9.99547004699707,3.2581088542938232,10.642157554626465,2.798628807067871,11.239999771118164,2.2799999713897705)
                curveTo(11.67767333984375,1.9060670137405396,12.32232666015625,1.9060670137405396,12.760000228881836,2.2799999713897705)
                curveTo(14.510000228881836,3.809999942779541,17.0,5.0,19.0,5.0)
                curveTo(19.552284240722656,5.0,20.0,5.4477152824401855,20.0,6.0)
                lineTo(20.0,13.0)
                curveTo(20.000659942626953,13.422618865966797,19.97393798828125,13.844836235046387,19.920000076293945,14.263999938964844)
            }
}

public val LucideIcons.All.ShieldOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldOff: ImageVector
    @Composable get() = ShieldOffDefinition.asImageVector()
