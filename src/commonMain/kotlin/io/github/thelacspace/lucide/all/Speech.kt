package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Speech") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.800000190734863,20.0)
                lineTo(8.800000190734863,15.899999618530273)
                lineTo(10.699999809265137,16.100000381469727)
                curveTo(11.84359359741211,16.036460876464844,12.766167640686035,15.141172409057617,12.86400032043457,14.0)
                lineTo(12.86400032043457,8.300000190734863)
                curveTo(12.864389419555664,5.309410095214844,10.447446823120117,2.8810019493103027,7.456888675689697,2.8672382831573486)
                curveTo(4.466330528259277,2.8534746170043945,2.027137517929077,5.259532928466797,2.0,8.25)
                curveTo(2.0,11.050000190734863,2.6560001373291016,11.303999900817871,3.0,12.800000190734863)
                curveTo(3.2324836254119873,13.703471183776855,3.242434501647949,14.64984130859375,3.0290000438690186,15.558000564575195)
                lineTo(2.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.799999237060547,17.799999237060547)
                curveTo(22.727359771728516,14.872307777404785,22.728702545166016,10.126347541809082,19.80299949645996,7.196999549865723)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,15.0)
                curveTo(17.660842895507812,14.3392915725708,18.030031204223633,13.441751480102539,18.02533721923828,12.507284164428711)
                curveTo(18.020641326904297,11.5728178024292,17.6424503326416,10.679033279418945,16.975000381469727,10.024999618530273)
            }
}

public val LucideIcons.All.SpeechDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Speech: ImageVector
    @Composable get() = SpeechDefinition.asImageVector()
