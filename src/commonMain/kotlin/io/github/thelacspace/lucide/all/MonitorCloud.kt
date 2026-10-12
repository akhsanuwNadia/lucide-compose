package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorCloud") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,13.0)
                curveTo(9.474556922912598,12.999199867248535,8.192584037780762,11.853796005249023,8.020682334899902,10.338068962097168)
                curveTo(7.848780632019043,8.822342872619629,8.84168815612793,7.418939590454102,10.328208923339844,7.076546669006348)
                curveTo(11.814730644226074,6.734154224395752,13.321518898010254,7.561798095703125,13.829999923706055,9.0)
                lineTo(14.0,9.0)
                curveTo(15.101078033447266,9.004923820495605,15.99107551574707,9.898910522460938,15.99107551574707,11.0)
                curveTo(15.99107551574707,12.101089477539062,15.101078033447266,12.995076179504395,14.0,13.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(20.0,3.0)
                lineTo(22.0,3.0)
                lineTo(22.0,17.0)
                lineTo(20.0,17.0)
                lineTo(4.0,17.0)
                lineTo(2.0,17.0)
                lineTo(2.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
}

public val LucideIcons.All.MonitorCloudDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorCloud: ImageVector
    @Composable get() = MonitorCloudDefinition.asImageVector()
