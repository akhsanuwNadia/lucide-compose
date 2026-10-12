package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldHouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,22.0)
                curveTo(14.447714805603027,22.0,14.0,21.552284240722656,14.0,21.0)
                lineTo(14.0,17.0)
                curveTo(13.99994945526123,16.665721893310547,14.166930198669434,16.35352325439453,14.444999694824219,16.167999267578125)
                lineTo(17.44499969482422,14.167999267578125)
                curveTo(17.781036376953125,13.943799018859863,18.218963623046875,13.943799018859863,18.55500030517578,14.167999267578125)
                lineTo(21.55500030517578,16.167999267578125)
                curveTo(21.833070755004883,16.35352325439453,22.000049591064453,16.665721893310547,22.0,17.0)
                lineTo(22.0,21.0)
                curveTo(22.0,21.552284240722656,21.552284240722656,22.0,21.0,22.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(18.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,10.418000221252441)
                lineTo(20.0,6.0)
                curveTo(20.0,5.4477152824401855,19.552284240722656,5.0,19.0,5.0)
                curveTo(17.0,5.0,14.510000228881836,3.809999942779541,12.760000228881836,2.2799999713897705)
                curveTo(12.32232666015625,1.9060670137405396,11.67767333984375,1.9060670137405396,11.239999771118164,2.2799999713897705)
                curveTo(9.5,3.799999952316284,7.0,5.0,5.0,5.0)
                curveTo(4.4477152824401855,5.0,4.0,5.4477152824401855,4.0,6.0)
                lineTo(4.0,13.0)
                curveTo(4.0,17.602001190185547,6.670000076293945,20.100000381469727,10.03700065612793,21.60300064086914)
            }
}

public val LucideIcons.All.ShieldHouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldHouse: ImageVector
    @Composable get() = ShieldHouseDefinition.asImageVector()
