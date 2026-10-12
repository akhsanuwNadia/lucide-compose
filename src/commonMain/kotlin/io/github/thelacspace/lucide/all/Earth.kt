package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Earth") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.540000915527344,15.0)
                lineTo(17.0,15.0)
                curveTo(15.895430564880371,15.0,15.0,15.895430564880371,15.0,17.0)
                lineTo(15.0,21.540000915527344)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,3.3399999141693115)
                lineTo(7.0,5.0)
                curveTo(7.0,6.656854152679443,8.343145370483398,8.0,10.0,8.0)
                curveTo(11.104569435119629,8.0,12.0,8.895430564880371,12.0,10.0)
                curveTo(12.0,11.100000381469727,12.899999618530273,12.0,14.0,12.0)
                curveTo(15.104569435119629,12.0,16.0,11.104569435119629,16.0,10.0)
                curveTo(16.0,8.899999618530273,16.899999618530273,8.0,18.0,8.0)
                lineTo(21.170000076293945,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,21.950000762939453)
                lineTo(11.0,18.0)
                curveTo(11.0,16.895429611206055,10.104569435119629,16.0,9.0,16.0)
                curveTo(7.895430564880371,16.0,7.0,15.104569435119629,7.0,14.0)
                lineTo(7.0,13.0)
                curveTo(7.0,11.895430564880371,6.104569435119629,11.0,5.0,11.0)
                lineTo(2.049999952316284,11.0)
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

public val LucideIcons.All.EarthDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Earth: ImageVector
    @Composable get() = EarthDefinition.asImageVector()
