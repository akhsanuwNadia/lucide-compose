package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LandPlot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(18.0,5.0)
                lineTo(12.0,2.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,11.989999771118164)
                lineTo(2.5,15.130000114440918)
                curveTo(2.1866891384124756,15.307560920715332,1.9930510520935059,15.639873504638672,1.9930510520935059,16.0)
                curveTo(1.9930510520935059,16.36012840270996,2.1866891384124756,16.692440032958984,2.5,16.8700008392334)
                lineTo(11.0,21.73000144958496)
                curveTo(11.618802070617676,22.08726692199707,12.381197929382324,22.08726692199707,13.0,21.73000144958496)
                lineTo(21.5,16.8700008392334)
                curveTo(21.813310623168945,16.692440032958984,22.006948471069336,16.36012840270996,22.006948471069336,16.0)
                curveTo(22.006948471069336,15.639874458312988,21.813310623168945,15.307561874389648,21.5,15.130001068115234)
                lineTo(16.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.489999771118164,12.850000381469727)
                lineTo(17.510000228881836,19.150001525878906)
            }
            lucidePath(strokeWidth) {
                moveTo(17.510000228881836,12.850000381469727)
                lineTo(6.5,19.149999618530273)
            }
}

public val LucideIcons.All.LandPlotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LandPlot: ImageVector
    @Composable get() = LandPlotDefinition.asImageVector()
