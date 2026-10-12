package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PhoneOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.100000381469727,13.899999618530273)
                curveTo(11.188836097717285,14.988490104675293,12.449761390686035,15.889923095703125,13.832000732421875,16.5679988861084)
                curveTo(14.257413864135742,16.763370513916016,14.761431694030762,16.637470245361328,15.045001029968262,16.264999389648438)
                lineTo(15.40000057220459,15.799999237060547)
                curveTo(15.777709007263184,15.296387672424316,16.370485305786133,15.0,17.0,15.0)
                lineTo(20.0,15.0)
                curveTo(21.104570388793945,15.0,22.0,15.895430564880371,22.0,17.0)
                lineTo(22.0,20.0)
                curveTo(22.0,21.104570388793945,21.104570388793945,22.0,20.0,22.0)
                curveTo(15.22608757019043,22.000041961669922,10.647686958312988,20.10364532470703,7.272000312805176,16.72800064086914)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,2.0)
                lineTo(2.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.760000228881836,13.581999778747559)
                curveTo(2.9560041427612305,10.71164608001709,1.9992892742156982,7.390181541442871,2.0,4.0)
                curveTo(2.0,2.895430564880371,2.895430564880371,2.0,4.0,2.0)
                lineTo(7.0,2.0)
                curveTo(8.104569435119629,2.0,9.0,2.895430564880371,9.0,4.0)
                lineTo(9.0,7.0)
                curveTo(9.0,7.629514694213867,8.703611373901367,8.222291946411133,8.199999809265137,8.600000381469727)
                lineTo(7.73199987411499,8.951000213623047)
                curveTo(7.35347318649292,9.240028381347656,7.231302738189697,9.755904197692871,7.440000057220459,10.184000015258789)
                curveTo(7.518328666687012,10.343198776245117,7.599676609039307,10.500893592834473,7.684000015258789,10.656999588012695)
            }
}

public val LucideIcons.All.PhoneOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PhoneOff: ImageVector
    @Composable get() = PhoneOffDefinition.asImageVector()
