package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CirclePower") { strokeWidth ->
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
                moveTo(12.0,7.0)
                lineTo(12.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.998000144958496,9.003000259399414)
                curveTo(6.452209949493408,11.066740989685059,6.7292704582214355,13.967531204223633,8.637773513793945,15.701345443725586)
                curveTo(10.546276092529297,17.43515968322754,13.460267066955566,17.433338165283203,15.36660099029541,15.697139739990234)
                curveTo(17.272933959960938,13.960941314697266,17.546369552612305,11.059806823730469,15.998000144958496,8.998000144958496)
            }
}

public val LucideIcons.All.CirclePowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CirclePower: ImageVector
    @Composable get() = CirclePowerDefinition.asImageVector()
