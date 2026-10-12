package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FaceAngry") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                lineTo(15.0,10.416000366210938)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,10.0)
                curveTo(15.9181489944458,10.0,14.865480422973633,10.350889205932617,14.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                curveTo(8.0818510055542,10.0,9.134519577026367,10.350889205932617,10.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(9.0,10.416000366210938)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                curveTo(10.777981758117676,15.666167259216309,13.223017692565918,15.666167259216309,15.000999450683594,17.0)
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

public val LucideIcons.All.FaceAngryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FaceAngry: ImageVector
    @Composable get() = FaceAngryDefinition.asImageVector()
