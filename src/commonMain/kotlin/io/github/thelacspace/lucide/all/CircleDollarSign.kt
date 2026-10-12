package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleDollarSign") { strokeWidth ->
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
                moveTo(16.0,8.0)
                lineTo(10.0,8.0)
                curveTo(9.28333854675293,7.996795177459717,8.619739532470703,8.377290725708008,8.260479927062988,8.997408866882324)
                curveTo(7.901220798492432,9.617527961730957,7.901220798492432,10.382472038269043,8.260479927062988,11.002591133117676)
                curveTo(8.619739532470703,11.622709274291992,9.28333854675293,12.003205299377441,10.0,12.0)
                lineTo(14.0,12.0)
                curveTo(14.71666145324707,11.996794700622559,15.380260467529297,12.377290725708008,15.739520072937012,12.997408866882324)
                curveTo(16.098779678344727,13.617527961730957,16.098779678344727,14.382472038269043,15.739520072937012,15.002591133117676)
                curveTo(15.380260467529297,15.622709274291992,14.71666145324707,16.003204345703125,14.0,16.0)
                lineTo(8.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,6.0)
            }
}

public val LucideIcons.All.CircleDollarSignDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleDollarSign: ImageVector
    @Composable get() = CircleDollarSignDefinition.asImageVector()
