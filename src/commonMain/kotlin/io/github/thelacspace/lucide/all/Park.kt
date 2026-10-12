package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Park") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.248000144958496,9.998000144958496)
                curveTo(12.862814903259277,9.423006057739258,12.350193977355957,8.944605827331543,11.75,8.600000381469727)
                lineTo(11.75,8.0)
                curveTo(11.740767478942871,5.935478210449219,10.064541816711426,4.266733169555664,8.0,4.266733169555664)
                curveTo(5.935457706451416,4.266733169555664,4.259232997894287,5.935478210449219,4.25,8.0)
                curveTo(2.487673759460449,9.137458801269531,1.6447809934616089,11.270476341247559,2.153505325317383,13.305374145507812)
                curveTo(2.662229537963867,15.34027099609375,4.409731388092041,16.8256893157959,6.5,17.0)
                lineTo(8.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,14.0)
                lineTo(13.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,14.0)
                lineTo(21.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,14.0)
                lineTo(13.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,20.0)
                lineTo(8.0,14.07800006866455)
                curveTo(7.999886989593506,13.54761028289795,7.789098739624023,13.038985252380371,7.414000034332275,12.663999557495117)
                lineTo(6.5,11.75)
            }
            lucidePath(strokeWidth) {
                moveTo(9.204999923706055,12.795000076293945)
                lineTo(8.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,6.0)
                curveTo(16.996795654296875,6.7166619300842285,17.377290725708008,7.380260467529297,17.99740982055664,7.7395195960998535)
                curveTo(18.61752700805664,8.09877872467041,19.38247299194336,8.09877872467041,20.00259017944336,7.7395195960998535)
                curveTo(20.622709274291992,7.380260467529297,21.003204345703125,6.7166619300842285,21.0,6.0)
                curveTo(21.003204345703125,5.2833380699157715,20.622709274291992,4.619739532470703,20.00259017944336,4.2604804039001465)
                curveTo(19.38247299194336,3.9012207984924316,18.61752700805664,3.9012207984924316,17.99740982055664,4.2604804039001465)
                curveTo(17.377290725708008,4.619739532470703,16.996795654296875,5.2833380699157715,17.0,6.0)
            }
}

public val LucideIcons.All.ParkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Park: ImageVector
    @Composable get() = ParkDefinition.asImageVector()
