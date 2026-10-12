package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrainFrontTunnel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,22.0)
                lineTo(2.0,12.0)
                curveTo(1.9839749336242676,8.416690826416016,3.8864517211914062,5.098697662353516,6.987045764923096,3.302401065826416)
                curveTo(10.087639808654785,1.5061043500900269,13.912360191345215,1.5061043500900269,17.012954711914062,3.302401065826416)
                curveTo(20.113548278808594,5.098697662353516,22.01602554321289,8.416690826416016,22.0,12.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,6.800000190734863)
                lineTo(15.0,8.199999809265137)
                curveTo(15.004807472229004,9.203326225280762,14.434064865112305,10.132364273071289,13.503886222839355,10.635327339172363)
                curveTo(12.573708534240723,11.138290405273438,11.426291465759277,11.138290405273438,10.496113777160645,10.635327339172363)
                curveTo(9.565935134887695,10.132364273071289,8.995192527770996,9.203326225280762,9.0,8.199999809265137)
                lineTo(9.0,6.800000190734863)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,15.0)
                lineTo(10.010000228881836,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,15.0)
                lineTo(14.010000228881836,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,19.0)
                curveTo(7.790861129760742,19.0,6.0,17.209138870239258,6.0,15.0)
                lineTo(6.0,12.0)
                curveTo(5.990385055541992,9.850014686584473,7.131871223449707,7.859218597412109,8.992227554321289,6.781440734863281)
                curveTo(10.852583885192871,5.703662395477295,13.147416114807129,5.703662395477295,15.007772445678711,6.781440734863281)
                curveTo(16.86812973022461,7.859218597412109,18.009614944458008,9.850014686584473,18.0,12.0)
                lineTo(18.0,15.0)
                curveTo(18.0,17.209138870239258,16.209138870239258,19.0,14.0,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,19.0)
                lineTo(7.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,19.0)
                lineTo(17.0,22.0)
            }
}

public val LucideIcons.All.TrainFrontTunnelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrainFrontTunnel: ImageVector
    @Composable get() = TrainFrontTunnelDefinition.asImageVector()
