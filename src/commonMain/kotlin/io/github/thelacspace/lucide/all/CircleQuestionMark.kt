package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleQuestionMark") { strokeWidth ->
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
                moveTo(9.09000015258789,9.0)
                curveTo(9.575437545776367,7.620044708251953,10.985383987426758,6.791406631469727,12.427176475524902,7.038712501525879)
                curveTo(13.868968963623047,7.286017894744873,14.922179222106934,8.537153244018555,14.920000076293945,10.0)
                curveTo(14.920000076293945,12.0,11.920000076293945,13.0,11.920000076293945,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.010000228881836,17.0)
            }
}

public val LucideIcons.All.CircleQuestionMarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleQuestionMark: ImageVector
    @Composable get() = CircleQuestionMarkDefinition.asImageVector()
