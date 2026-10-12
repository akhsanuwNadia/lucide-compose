package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleParking") { strokeWidth ->
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
                moveTo(9.0,17.0)
                lineTo(9.0,7.0)
                lineTo(13.0,7.0)
                curveTo(14.651617050170898,7.007386207580566,15.986613273620605,8.348365783691406,15.986613273620605,10.0)
                curveTo(15.986613273620605,11.651634216308594,14.651617050170898,12.992613792419434,13.0,13.0)
                lineTo(9.0,13.0)
            }
}

public val LucideIcons.All.CircleParkingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleParking: ImageVector
    @Composable get() = CircleParkingDefinition.asImageVector()
