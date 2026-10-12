package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Volleyball") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,7.0)
                curveTo(15.08245849609375,6.999959945678711,19.010520935058594,8.560452461242676,21.979999542236328,11.36199951171875)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                curveTo(9.895444869995117,14.754642486572266,6.777856349945068,16.554636001586914,3.3400001525878906,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.829999923706055,13.633999824523926)
                curveTo(14.788956642150879,17.1694278717041,11.473732948303223,19.790985107421875,7.562999725341797,20.961999893188477)
            }
            lucidePath(strokeWidth) {
                moveTo(20.65999984741211,17.0)
                curveTo(18.555444717407227,14.245357513427734,15.437856674194336,12.445363998413086,12.0,12.0)
                curveTo(10.666666984558105,8.800000190734863,10.666666984558105,5.199999809265137,12.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.170000076293945,15.366000175476074)
                curveTo(6.128520488739014,11.83057689666748,5.515698432922363,7.648507118225098,6.456999778747559,3.6760005950927734)
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

public val LucideIcons.All.VolleyballDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Volleyball: ImageVector
    @Composable get() = VolleyballDefinition.asImageVector()
