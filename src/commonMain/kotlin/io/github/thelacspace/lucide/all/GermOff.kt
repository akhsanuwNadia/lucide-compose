package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GermOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,2.0)
                lineTo(11.925000190734863,3.8480000495910645)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,15.0)
                lineTo(13.010000228881836,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.423999786376953,7.76800012588501)
                curveTo(13.900537490844727,7.160464286804199,14.684229850769043,6.881505489349365,15.437461853027344,7.051299095153809)
                curveTo(16.190692901611328,7.221092700958252,16.778907775878906,7.8093061447143555,16.948701858520508,8.562538146972656)
                curveTo(17.118494033813477,9.315770149230957,16.839536666870117,10.099462509155273,16.23200035095215,10.576000213623047)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,21.0)
                lineTo(15.0,18.527999877929688)
            }
            lucidePath(strokeWidth) {
                moveTo(16.988000869750977,16.988000869750977)
                curveTo(14.784555435180664,18.937210083007812,11.941854476928711,20.00909423828125,9.0,20.0)
                curveTo(6.792758464813232,20.00074577331543,4.846161365509033,18.554092407226562,4.210287094116211,16.440427780151367)
                curveTo(3.5744128227233887,14.326762199401855,4.39971923828125,12.046210289001465,6.241000175476074,10.829000473022461)
                curveTo(7.144629955291748,10.218511581420898,7.926915645599365,9.445381164550781,8.54800033569336,8.54900074005127)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,2.0)
                lineTo(18.0,3.803999900817871)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,19.0)
                lineTo(4.746000289916992,17.62700080871582)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,16.0)
                lineTo(19.5260009765625,13.869999885559082)
                curveTo(20.194725036621094,12.694550514221191,20.659944534301758,11.414519309997559,20.902000427246094,10.083999633789062)
                curveTo(21.38498306274414,7.456151485443115,20.072132110595703,4.825570106506348,17.681835174560547,3.6316959857940674)
                curveTo(15.291537284851074,2.437821865081787,12.399813652038574,2.9683587551116943,10.589000701904297,4.932999610900879)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,5.0)
                lineTo(20.195999145507812,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,10.0)
                lineTo(5.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,16.0)
                lineTo(9.010000228881836,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,20.0)
                lineTo(9.0,22.0)
            }
}

public val LucideIcons.All.GermOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GermOff: ImageVector
    @Composable get() = GermOffDefinition.asImageVector()
