package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImageOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.40999984741211,10.40999984741211)
                curveTo(9.905229568481445,10.919305801391602,9.166532516479492,11.119601249694824,8.47362232208252,10.935043334960938)
                curveTo(7.780712604522705,10.75048542022705,7.2395148277282715,10.2092866897583,7.054956436157227,9.516377449035645)
                curveTo(6.87039852142334,8.823467254638672,7.0706939697265625,8.084770202636719,7.579999923706055,7.579999923706055)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5,13.5)
                lineTo(6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(21.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.5899999141693115,3.5899999141693115)
                curveTo(3.2134809494018555,3.9627230167388916,3.0011322498321533,4.470200538635254,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(19.0,21.0)
                curveTo(19.549999237060547,21.0,20.052000045776367,20.780000686645508,20.40999984741211,20.40999984741211)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,15.0)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(9.0,3.0)
            }
}

public val LucideIcons.All.ImageOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImageOff: ImageVector
    @Composable get() = ImageOffDefinition.asImageVector()
