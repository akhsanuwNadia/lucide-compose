package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouseOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,6.3429999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(18.218000411987305,18.218000411987305)
                curveTo(16.734817504882812,21.086528778076172,13.481812477111816,22.56818199157715,10.344172477722168,21.804304122924805)
                curveTo(7.206533432006836,21.040428161621094,4.998632907867432,18.229286193847656,5.0,15.0)
                lineTo(5.0,9.0)
                curveTo(4.999526500701904,7.880226135253906,5.267697334289551,6.776679039001465,5.7820000648498535,5.7820000648498535)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,13.343000411987305)
                lineTo(19.0,9.0)
                curveTo(19.000560760498047,6.511197090148926,17.679611206054688,4.209254264831543,15.530552864074707,2.9539899826049805)
                curveTo(13.381494522094727,1.6987255811691284,10.727543830871582,1.6789309978485107,8.5600004196167,2.9019999504089355)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(2.0,2.0)
            }
}

public val LucideIcons.All.MouseOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouseOff: ImageVector
    @Composable get() = MouseOffDefinition.asImageVector()
