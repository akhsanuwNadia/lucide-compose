package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Aperture") { strokeWidth ->
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
                moveTo(14.3100004196167,8.0)
                lineTo(20.049999237060547,17.939998626708984)
            }
            lucidePath(strokeWidth) {
                moveTo(9.6899995803833,8.0)
                lineTo(21.169998168945312,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.380000114440918,12.0)
                lineTo(13.119999885559082,2.060000419616699)
            }
            lucidePath(strokeWidth) {
                moveTo(9.6899995803833,16.0)
                lineTo(3.950000047683716,6.059999942779541)
            }
            lucidePath(strokeWidth) {
                moveTo(14.3100004196167,16.0)
                lineTo(2.8299999237060547,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.6200008392334,12.0)
                lineTo(10.880001068115234,21.939998626708984)
            }
}

public val LucideIcons.All.ApertureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Aperture: ImageVector
    @Composable get() = ApertureDefinition.asImageVector()
