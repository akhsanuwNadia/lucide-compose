package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pyramid") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.5,16.8799991607666)
                curveTo(2.2599027156829834,16.73984146118164,2.0889899730682373,16.506057739257812,2.0282790660858154,16.23475456237793)
                curveTo(1.9675679206848145,15.963452339172363,2.0225391387939453,15.679121017456055,2.180000066757202,15.44999885559082)
                lineTo(11.180000305175781,2.4299983978271484)
                curveTo(11.36704158782959,2.1620326042175293,11.673213005065918,2.00236177444458,12.0,2.00236177444458)
                curveTo(12.326787948608398,2.00236177444458,12.632959365844727,2.1620326042175293,12.820000648498535,2.4299983978271484)
                lineTo(21.81999969482422,15.439998626708984)
                curveTo(21.980880737304688,15.669797897338867,22.037841796875,15.956603050231934,21.97698974609375,16.230440139770508)
                curveTo(21.9161376953125,16.5042781829834,21.743064880371094,16.739965438842773,21.5,16.8799991607666)
                lineTo(12.989999771118164,21.739999771118164)
                curveTo(12.376300811767578,22.089618682861328,11.623699188232422,22.089618682861328,11.010000228881836,21.739999771118164)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,22.0)
            }
}

public val LucideIcons.All.PyramidDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pyramid: ImageVector
    @Composable get() = PyramidDefinition.asImageVector()
