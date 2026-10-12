package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tractor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,11.0)
                lineTo(21.0,11.899999618530273)
                curveTo(21.513362884521484,12.000933647155762,21.862146377563477,12.480513572692871,21.799999237060547,13.0)
                lineTo(21.134998321533203,17.158000946044922)
                curveTo(21.057340621948242,17.64333152770996,20.63850212097168,18.000276565551758,20.146997451782227,18.0)
                lineTo(20.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,18.0)
                lineTo(11.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,5.0)
                curveTo(17.447715759277344,5.0,17.0,5.4477152824401855,17.0,6.0)
                lineTo(17.0,11.572999954223633)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,4.0)
                lineTo(11.128999710083008,4.0)
                curveTo(11.628129005432129,4.0002851486206055,12.050619125366211,4.368576526641846,12.118999481201172,4.86299991607666)
                lineTo(13.0,11.246000289916992)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,11.0)
                lineTo(4.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,15.0)
                lineTo(7.010000228881836,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.100000381469727)
                lineTo(8.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,18.0)
                curveTo(15.996794700622559,18.71666145324707,16.377290725708008,19.380260467529297,16.99740982055664,19.739519119262695)
                curveTo(17.61752700805664,20.098779678344727,18.38247299194336,20.098779678344727,19.00259017944336,19.739519119262695)
                curveTo(19.622709274291992,19.380260467529297,20.003204345703125,18.71666145324707,20.0,18.0)
                curveTo(20.003204345703125,17.28333854675293,19.622709274291992,16.619739532470703,19.00259017944336,16.260480880737305)
                curveTo(18.38247299194336,15.90122127532959,17.61752700805664,15.90122127532959,16.99740982055664,16.260480880737305)
                curveTo(16.377290725708008,16.619739532470703,15.996794700622559,17.28333854675293,16.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,15.0)
                curveTo(1.9919874668121338,16.791654586791992,2.943225860595703,18.450651168823242,4.493522644042969,19.348798751831055)
                curveTo(6.043819904327393,20.2469482421875,7.956180095672607,20.2469482421875,9.506477355957031,19.348798751831055)
                curveTo(11.056774139404297,18.450651168823242,12.008012771606445,16.791654586791992,12.0,15.0)
                curveTo(12.008012771606445,13.208345413208008,11.056774139404297,11.549348831176758,9.506477355957031,10.651200294494629)
                curveTo(7.956180095672607,9.7530517578125,6.043819904327393,9.7530517578125,4.493522644042969,10.651200294494629)
                curveTo(2.943225860595703,11.549348831176758,1.9919874668121338,13.208345413208008,2.0,15.0)
            }
}

public val LucideIcons.All.TractorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tractor: ImageVector
    @Composable get() = TractorDefinition.asImageVector()
