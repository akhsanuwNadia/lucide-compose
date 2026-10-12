package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rabbit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,16.0)
                curveTo(14.18376636505127,15.99844741821289,15.25776481628418,16.69314956665039,15.741744041442871,17.77345848083496)
                curveTo(16.225723266601562,18.853769302368164,16.029178619384766,20.117671966552734,15.239999771118164,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(18.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,21.0)
                lineTo(10.0,21.0)
                curveTo(7.790861129760742,21.0,6.0,19.209138870239258,6.0,17.0)
                curveTo(6.0,13.13400650024414,9.13400650024414,10.0,13.0,10.0)
                lineTo(13.199999809265137,10.0)
                lineTo(9.600000381469727,6.400000095367432)
                curveTo(9.09609317779541,5.900580406188965,8.897921562194824,5.169714450836182,9.080522537231445,4.484149932861328)
                curveTo(9.263124465942383,3.7985851764678955,9.798585891723633,3.2631242275238037,10.484149932861328,3.0805225372314453)
                curveTo(11.16971492767334,2.897921085357666,11.900580406188965,3.09609317779541,12.40000057220459,3.6000001430511475)
                lineTo(15.800000190734863,7.0)
                lineTo(16.0,7.0)
                curveTo(19.299999237060547,7.0,22.0,9.699999809265137,22.0,13.0)
                lineTo(22.0,14.0)
                curveTo(22.0,15.104569435119629,21.104570388793945,16.0,20.0,16.0)
                lineTo(19.0,16.0)
                curveTo(17.3431453704834,16.0,16.0,17.3431453704834,16.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,8.539999961853027)
                lineTo(20.0,4.0)
                curveTo(20.003204345703125,3.2833380699157715,19.622709274291992,2.619739532470703,19.00259017944336,2.2604801654815674)
                curveTo(18.38247299194336,1.9012209177017212,17.61752700805664,1.9012209177017212,16.99740982055664,2.2604801654815674)
                curveTo(16.377290725708008,2.619739532470703,15.996794700622559,3.2833380699157715,16.0,4.0)
                lineTo(16.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.611999988555908,12.52400016784668)
                curveTo(6.829455375671387,11.139047622680664,5.101946830749512,10.605680465698242,3.6748342514038086,11.308403968811035)
                curveTo(2.2477214336395264,12.011126518249512,1.6172206401824951,13.705598831176758,2.2378592491149902,15.170275688171387)
                curveTo(2.8584976196289062,16.634952545166016,4.5144758224487305,17.360557556152344,6.01200008392334,16.82400131225586)
            }
}

public val LucideIcons.All.RabbitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rabbit: ImageVector
    @Composable get() = RabbitDefinition.asImageVector()
