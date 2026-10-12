package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Feather") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.086000442504883,18.41200065612793)
                curveTo(13.71085262298584,18.78832244873047,13.201370239257812,18.999887466430664,12.670000076293945,19.0)
                lineTo(5.0,19.0)
                lineTo(5.0,11.32800006866455)
                curveTo(5.000113010406494,10.79761028289795,5.210901260375977,10.288985252380371,5.585999965667725,9.913999557495117)
                lineTo(11.75,3.75)
                curveTo(13.264311790466309,2.2220823764801025,15.480401039123535,1.6211960315704346,17.559131622314453,2.174870252609253)
                curveTo(19.637861251831055,2.728544235229492,21.261455535888672,4.352138519287109,21.81513023376465,6.430868148803711)
                curveTo(22.368803024291992,8.509598731994629,21.76791763305664,10.725687980651855,20.239999771118164,12.239999771118164)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,8.0)
                lineTo(2.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.488000869750977,15.0)
                lineTo(9.0,15.0)
            }
}

public val LucideIcons.All.FeatherDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Feather: ImageVector
    @Composable get() = FeatherDefinition.asImageVector()
