package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileChartPie") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.940999984741211,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,8.0)
                curveTo(20.001035690307617,7.360634803771973,19.74691390991211,6.747284889221191,19.29400062561035,6.296000003814697)
                lineTo(15.706000328063965,2.7079999446868896)
                curveTo(15.254555702209473,2.2538599967956543,14.64034652709961,1.9989595413208008,14.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,7.51200008392334)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.017000198364258,11.51200008392334)
                curveTo(2.3504416942596436,12.990976333618164,1.640720248222351,15.271688461303711,2.1738064289093018,17.43515968322754)
                curveTo(2.706892728805542,19.598630905151367,4.394981861114502,21.288515090942383,6.55788516998291,21.823898315429688)
                curveTo(8.720788955688477,22.359283447265625,11.002253532409668,21.65198516845703,12.482999801635742,19.98699951171875)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,16.0)
                curveTo(8.447714805603027,16.0,8.0,15.552285194396973,8.0,15.0)
                lineTo(8.0,11.0)
                curveTo(8.0,10.447999954223633,8.449999809265137,9.991999626159668,8.994999885559082,10.083000183105469)
                curveTo(11.516951560974121,10.50706672668457,13.49293327331543,12.483048439025879,13.916999816894531,15.005000114440918)
                curveTo(14.007999420166016,15.548999786376953,13.552000045776367,16.0,13.0,16.0)
                close()
            }
}

public val LucideIcons.All.FileChartPieDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileChartPie: ImageVector
    @Composable get() = FileChartPieDefinition.asImageVector()
