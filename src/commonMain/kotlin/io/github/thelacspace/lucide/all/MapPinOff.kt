package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.75,7.090000152587891)
                curveTo(13.810103416442871,7.36208963394165,14.637910842895508,8.189896583557129,14.90999984741211,9.25)
            }
            lucidePath(strokeWidth) {
                moveTo(17.07200050354004,17.07200050354004)
                curveTo(15.438000679016113,19.242000579833984,13.545000076293945,20.98400115966797,12.60099983215332,21.798999786376953)
                curveTo(12.245038032531738,22.066667556762695,11.754961967468262,22.066667556762695,11.39900016784668,21.798999786376953)
                curveTo(9.538999557495117,20.19300079345703,4.0,14.993000030517578,4.0,10.0)
                curveTo(3.999882698059082,8.366861343383789,4.4995951652526855,6.7728071212768555,5.432000160217285,5.432000160217285)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.475000381469727,2.818000078201294)
                curveTo(10.954639434814453,1.6008878946304321,13.886734008789062,1.74906325340271,16.23103904724121,3.209956645965576)
                curveTo(18.57534408569336,4.670849800109863,20.00016212463379,7.237759590148926,20.0,10.0)
                curveTo(20.0,11.182999610900879,19.690000534057617,12.376999855041504,19.190000534057617,13.532999992370605)
            }
            lucidePath(strokeWidth) {
                moveTo(9.130000114440918,9.130000114440918)
                curveTo(8.80981731414795,10.188690185546875,9.098134994506836,11.337677001953125,9.880228996276855,12.119771003723145)
                curveTo(10.662322998046875,12.901865005493164,11.811309814453125,13.19018268585205,12.869999885559082,12.869999885559082)
            }
}

public val LucideIcons.All.MapPinOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinOff: ImageVector
    @Composable get() = MapPinOffDefinition.asImageVector()
