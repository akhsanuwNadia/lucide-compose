package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Copyleft") { strokeWidth ->
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
                moveTo(9.170000076293945,14.829999923706055)
                curveTo(10.732556343078613,16.390819549560547,13.26440715789795,16.38987922668457,14.825804710388184,14.827902793884277)
                curveTo(16.387203216552734,13.265925407409668,16.387203216552734,10.734074592590332,14.825804710388184,9.172097206115723)
                curveTo(13.26440715789795,7.6101202964782715,10.732556343078613,7.6091814041137695,9.170000076293945,9.170000076293945)
            }
}

public val LucideIcons.All.CopyleftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Copyleft: ImageVector
    @Composable get() = CopyleftDefinition.asImageVector()
