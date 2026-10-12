package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Compass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                curveTo(1.9839749336242676,15.583309173583984,3.8864517211914062,18.901302337646484,6.987045764923096,20.697599411010742)
                curveTo(10.087639808654785,22.493896484375,13.912360191345215,22.493896484375,17.012954711914062,20.697599411010742)
                curveTo(20.113548278808594,18.901302337646484,22.01602554321289,15.583309173583984,22.0,12.0)
                curveTo(22.01602554321289,8.416690826416016,20.113548278808594,5.098697662353516,17.012954711914062,3.302401065826416)
                curveTo(13.912360191345215,1.5061043500900269,10.087639808654785,1.5061043500900269,6.987045764923096,3.302401065826416)
                curveTo(3.8864517211914062,5.098697662353516,1.9839749336242676,8.416690826416016,2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.239999771118164,7.760000228881836)
                lineTo(14.435999870300293,13.170999526977539)
                curveTo(14.23693561553955,13.768263816833496,13.768263816833496,14.23693561553955,13.170999526977539,14.435999870300293)
                lineTo(7.760000228881836,16.239999771118164)
                lineTo(9.564000129699707,10.829000473022461)
                curveTo(9.76306438446045,10.231736183166504,10.231736183166504,9.76306438446045,10.829000473022461,9.564000129699707)
                close()
            }
}

public val LucideIcons.All.CompassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Compass: ImageVector
    @Composable get() = CompassDefinition.asImageVector()
