package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LifeBuoy") { strokeWidth ->
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
                moveTo(4.929999828338623,4.929999828338623)
                lineTo(9.170000076293945,9.170000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(14.829999923706055,9.170000076293945)
                lineTo(19.06999969482422,4.930000305175781)
            }
            lucidePath(strokeWidth) {
                moveTo(14.829999923706055,14.829999923706055)
                lineTo(19.06999969482422,19.06999969482422)
            }
            lucidePath(strokeWidth) {
                moveTo(9.170000076293945,14.829999923706055)
                lineTo(4.930000305175781,19.06999969482422)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                curveTo(7.993589878082275,13.433323860168457,8.7545804977417,14.760520935058594,9.994818687438965,15.479039192199707)
                curveTo(11.235055923461914,16.19755744934082,12.764944076538086,16.19755744934082,14.005181312561035,15.479039192199707)
                curveTo(15.2454195022583,14.760520935058594,16.006410598754883,13.433323860168457,16.0,12.0)
                curveTo(16.006410598754883,10.566676139831543,15.2454195022583,9.239479064941406,14.005181312561035,8.520960807800293)
                curveTo(12.764944076538086,7.802441596984863,11.235055923461914,7.802441596984863,9.994818687438965,8.520960807800293)
                curveTo(8.7545804977417,9.239479064941406,7.993589878082275,10.566676139831543,8.0,12.0)
            }
}

public val LucideIcons.All.LifeBuoyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LifeBuoy: ImageVector
    @Composable get() = LifeBuoyDefinition.asImageVector()
