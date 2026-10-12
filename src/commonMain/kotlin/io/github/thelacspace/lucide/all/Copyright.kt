package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Copyright") { strokeWidth ->
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
                moveTo(14.829999923706055,14.829999923706055)
                curveTo(13.267443656921387,16.390819549560547,10.73559284210205,16.38987922668457,9.174195289611816,14.827902793884277)
                curveTo(7.612796783447266,13.265925407409668,7.612796783447266,10.734074592590332,9.174195289611816,9.172097206115723)
                curveTo(10.73559284210205,7.6101202964782715,13.267443656921387,7.6091814041137695,14.829999923706055,9.170000076293945)
            }
}

public val LucideIcons.All.CopyrightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Copyright: ImageVector
    @Composable get() = CopyrightDefinition.asImageVector()
