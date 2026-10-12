package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartPie") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                curveTo(21.552000045776367,12.0,22.0049991607666,11.550999641418457,21.950000762939453,11.001999855041504)
                curveTo(21.474668502807617,6.268584251403809,17.73052215576172,2.5252740383148193,12.997000694274902,2.050999641418457)
                curveTo(12.447000503540039,1.9959996938705444,11.999000549316406,2.4489996433258057,11.999000549316406,3.000999689102173)
                lineTo(11.999000549316406,11.000999450683594)
                curveTo(11.999000549316406,11.553284645080566,12.446715354919434,12.000999450683594,12.999000549316406,12.000999450683594)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.209999084472656,15.890000343322754)
                curveTo(19.459848403930664,20.02888298034668,15.163822174072266,22.49204444885254,10.707771301269531,21.911535263061523)
                curveTo(6.251720428466797,21.33102798461914,2.7301414012908936,17.849435806274414,2.0987861156463623,13.400304794311523)
                curveTo(1.4674307107925415,8.951173782348633,3.8813724517822266,4.627300262451172,8.0,2.8299999237060547)
            }
}

public val LucideIcons.All.ChartPieDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartPie: ImageVector
    @Composable get() = ChartPieDefinition.asImageVector()
