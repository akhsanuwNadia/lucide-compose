package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Globe") { strokeWidth ->
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
                moveTo(12.0,2.0)
                curveTo(6.666666507720947,7.599999904632568,6.666666507720947,16.399999618530273,12.0,22.0)
                curveTo(17.33333396911621,16.399999618530273,17.33333396911621,7.599999904632568,12.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(22.0,12.0)
            }
}

public val LucideIcons.All.GlobeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Globe: ImageVector
    @Composable get() = GlobeDefinition.asImageVector()
