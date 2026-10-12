package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.992f,16.342f)
                curveTo(3.1390393f,16.712914f,3.1717756f,17.119331f,3.0860002f,17.508999f)
                lineTo(2.0210001f,20.799f)
                curveTo(1.9512304f,21.138227f,2.06195f,21.489405f,2.3136673f,21.727274f)
                curveTo(2.5653846f,21.965141f,2.9222586f,22.055834f,3.257f,21.967f)
                lineTo(6.67f,20.969f)
                curveTo(7.037716f,20.896063f,7.4185286f,20.92794f,7.769f,21.060999f)
                curveTo(12.177509f,23.119762f,17.427994f,21.706697f,20.207699f,17.713366f)
                curveTo(22.987404f,13.720034f,22.489471f,8.305572f,19.028067f,4.8861938f)
                curveTo(15.566662f,1.4668162f,10.146522f,1.0350591f,6.1874423f,3.8633363f)
                curveTo(2.2283628f,6.6916137f,0.8795385f,11.958967f,2.992f,16.342f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.828f,13.07f)
                curveTo(6.7139626f,11.904677f,6.7201104f,10.067244f,7.841921f,8.909402f)
                curveTo(8.963731f,7.7515607f,10.800053f,7.687347f,12.0f,8.764f)
                curveTo(12.879962f,7.974089f,14.14185f,7.774782f,15.222427f,8.255038f)
                curveTo(16.303003f,8.735295f,17.00066f,9.8055105f,17.004f,10.988f)
                curveTo(17.00643f,11.763792f,16.708231f,12.510362f,16.171999f,13.071f)
                lineTo(12.724998f,16.691f)
                curveTo(12.536068f,16.8896f,12.273895f,17.00194f,11.999784f,17.00175f)
                curveTo(11.725673f,17.001562f,11.463655f,16.88886f,11.274999f,16.69f)
                close()
            }
}

public val LucideIcons.All.MessageCircleHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleHeart: ImageVector
    @Composable get() = MessageCircleHeartDefinition.asImageVector()
