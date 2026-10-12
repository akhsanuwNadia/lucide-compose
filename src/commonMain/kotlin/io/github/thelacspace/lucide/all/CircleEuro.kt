package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleEuro") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,9.399999618530273)
                curveTo(13.911465644836426,8.127362251281738,12.145380973815918,7.667535781860352,10.574432373046875,8.247736930847168)
                curveTo(9.003484725952148,8.827938079833984,7.960263252258301,10.325331687927246,7.960263252258301,12.0)
                curveTo(7.960263252258301,13.674667358398438,9.003484725952148,15.1720609664917,10.574432373046875,15.752262115478516)
                curveTo(12.145380973815918,16.33246421813965,13.911465644836426,15.872636795043945,15.0,14.59999942779541)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                curveTo(1.9839749336242676,15.583309173583984,3.8864517211914062,18.901302337646484,6.987045764923096,20.697599411010742)
                curveTo(10.087639808654785,22.493896484375,13.912360191345215,22.493896484375,17.012954711914062,20.697599411010742)
                curveTo(20.113548278808594,18.901302337646484,22.01602554321289,15.583309173583984,22.0,12.0)
                curveTo(22.01602554321289,8.416690826416016,20.113548278808594,5.098697662353516,17.012954711914062,3.302401065826416)
                curveTo(13.912360191345215,1.5061043500900269,10.087639808654785,1.5061043500900269,6.987045764923096,3.302401065826416)
                curveTo(3.8864517211914062,5.098697662353516,1.9839749336242676,8.416690826416016,2.0,12.0)
            }
}

public val LucideIcons.All.CircleEuroDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleEuro: ImageVector
    @Composable get() = CircleEuroDefinition.asImageVector()
