package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cloudy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.5,12.0)
                curveTo(19.112489700317383,11.992788314819336,20.6055850982666,12.84890365600586,21.41391944885254,14.244170188903809)
                curveTo(22.222253799438477,15.639437675476074,22.222253799438477,17.36056137084961,21.41391944885254,18.755828857421875)
                curveTo(20.6055850982666,20.15109634399414,19.112489700317383,21.007211685180664,17.5,21.0)
                lineTo(9.005999565124512,21.0)
                curveTo(5.4006805419921875,21.00319480895996,2.3826162815093994,18.267467498779297,2.0328214168548584,14.679156303405762)
                curveTo(1.6830263137817383,11.09084415435791,4.11592435836792,7.823747634887695,7.653985023498535,7.1305928230285645)
                curveTo(11.192045211791992,6.437438011169434,14.67790699005127,8.544968605041504,15.708000183105469,12.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.832000732421875,9.0)
                curveTo(21.40778160095215,7.80012321472168,20.272661209106445,6.998484134674072,19.0,7.0)
                lineTo(16.792999267578125,7.0)
                curveTo(16.09115219116211,4.520181655883789,13.761474609375,2.8602657318115234,11.188411712646484,3.006680727005005)
                curveTo(8.615349769592285,3.1530957221984863,6.489008903503418,5.066572666168213,6.072999000549316,7.610000133514404)
            }
}

public val LucideIcons.All.CloudyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cloudy: ImageVector
    @Composable get() = CloudyDefinition.asImageVector()
