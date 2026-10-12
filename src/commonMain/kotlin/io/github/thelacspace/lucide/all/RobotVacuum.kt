package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RobotVacuum") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,17.0)
                lineTo(13.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,12.0)
                curveTo(16.987689971923828,9.247304916381836,14.75272274017334,7.022310733795166,12.0,7.022310733795166)
                curveTo(9.24727725982666,7.022310733795166,7.01231050491333,9.247304916381836,7.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,2.0)
                lineTo(19.0,4.800000190734863)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,5.0)
                lineTo(4.800000190734863,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,5.0)
                lineTo(19.200000762939453,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,2.0)
                lineTo(5.0,4.800000190734863)
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

public val LucideIcons.All.RobotVacuumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RobotVacuum: ImageVector
    @Composable get() = RobotVacuumDefinition.asImageVector()
