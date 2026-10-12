package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudMoonRain") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,20.0)
                lineTo(11.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.375999450683594,14.51200008392334)
                curveTo(20.117002487182617,13.760536193847656,21.400304794311523,12.2302885055542,21.836999893188477,10.385000228881836)
                curveTo(21.985000610351562,9.760000228881836,21.17799949645996,9.414999961853027,20.589000701904297,9.671000480651855)
                curveTo(19.083171844482422,10.322366714477539,17.332275390625,9.988144874572754,16.172256469726562,8.82790470123291)
                curveTo(15.012237548828125,7.667665481567383,14.678348541259766,5.91670560836792,15.330000877380371,4.4110002517700195)
                curveTo(15.585000991821289,3.82200026512146,15.24000072479248,3.016000270843506,14.614001274108887,3.1630001068115234)
                curveTo(12.082418441772461,3.764496326446533,10.227078437805176,5.929194450378418,10.020001411437988,8.523000717163086)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,20.0)
                curveTo(1.7696703672409058,18.357961654663086,1.6674097776412964,16.130937576293945,2.7420811653137207,14.383057594299316)
                curveTo(3.8167524337768555,12.635177612304688,5.850191116333008,11.721272468566895,7.870766639709473,12.078030586242676)
                curveTo(9.891342163085938,12.43478775024414,11.488865852355957,13.98978328704834,11.899999618530273,16.0)
                lineTo(13.0,16.0)
                curveTo(14.245733261108398,15.998169898986816,15.3629789352417,16.766389846801758,15.8071928024292,17.93023109436035)
                curveTo(16.251407623291016,19.094072341918945,15.93014907836914,20.411340713500977,15.0,21.239999771118164)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,19.0)
                lineTo(7.0,21.0)
            }
}

public val LucideIcons.All.CloudMoonRainDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudMoonRain: ImageVector
    @Composable get() = CloudMoonRainDefinition.asImageVector()
