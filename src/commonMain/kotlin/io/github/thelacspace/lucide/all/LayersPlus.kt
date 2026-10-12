package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayersPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.829999923706055,2.180000066757202)
                curveTo(12.302794456481934,1.9395239353179932,11.697205543518066,1.9395239353179932,11.170000076293945,2.180000066757202)
                lineTo(2.5999999046325684,6.079999923706055)
                curveTo(2.2374279499053955,6.239870071411133,2.0034537315368652,6.598746299743652,2.0034537315368652,6.994999885559082)
                curveTo(2.0034537315368652,7.391253471374512,2.2374279499053955,7.750129699707031,2.5999999046325684,7.909999847412109)
                lineTo(11.180000305175781,11.819999694824219)
                curveTo(11.440589904785156,11.938728332519531,11.723637580871582,12.00011157989502,12.010000228881836,12.0)
                curveTo(12.29636287689209,12.00011157989502,12.579410552978516,11.938728332519531,12.84000015258789,11.819999694824219)
                lineTo(21.420000076293945,7.919999599456787)
                curveTo(21.78318214416504,7.7603983879089355,22.017681121826172,7.401203632354736,22.017681121826172,7.004499435424805)
                curveTo(22.017681121826172,6.607795715332031,21.78318214416504,6.248600959777832,21.420000076293945,6.0889997482299805)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,17.0)
                lineTo(22.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,14.0)
                lineTo(19.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                curveTo(1.9990335702896118,12.390570640563965,2.225545883178711,12.74596118927002,2.5799999237060547,12.90999984741211)
                lineTo(11.180000305175781,16.81999969482422)
                curveTo(11.439208030700684,16.937341690063477,11.72046947479248,16.99802589416504,12.005000114440918,16.99799919128418)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,17.0)
                curveTo(1.9990335702896118,17.39057159423828,2.225545883178711,17.745960235595703,2.5799999237060547,17.90999984741211)
                lineTo(11.180000305175781,21.81999969482422)
                curveTo(11.70437240600586,22.057445526123047,12.305627822875977,22.057445526123047,12.829999923706055,21.81999969482422)
                lineTo(14.946000099182129,20.857999801635742)
            }
}

public val LucideIcons.All.LayersPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayersPlus: ImageVector
    @Composable get() = LayersPlusDefinition.asImageVector()
