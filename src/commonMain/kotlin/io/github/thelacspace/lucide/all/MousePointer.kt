package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.586000442504883,12.586000442504883)
                lineTo(19.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.687999963760376,3.0369999408721924)
                curveTo(3.5017359256744385,2.9585044384002686,3.2864866256713867,3.000633955001831,3.1435604095458984,3.1435604095458984)
                curveTo(3.000633955001831,3.2864866256713867,2.9585044384002686,3.5017359256744385,3.0369999408721924,3.687999963760376)
                lineTo(9.536999702453613,19.687000274658203)
                curveTo(9.619040489196777,19.885459899902344,9.818439483642578,20.00956153869629,10.03272819519043,19.99553108215332)
                curveTo(10.247017860412598,19.981502532958984,10.428534507751465,19.832462310791016,10.483999252319336,19.625)
                lineTo(12.052999496459961,13.541999816894531)
                curveTo(12.223196029663086,12.818155288696289,12.780921936035156,12.248489379882812,13.500999450683594,12.062999725341797)
                lineTo(19.625,10.483999252319336)
                curveTo(19.833539962768555,10.429855346679688,19.983945846557617,10.248213768005371,19.998247146606445,10.033233642578125)
                curveTo(20.012548446655273,9.818254470825195,19.887531280517578,9.618289947509766,19.687999725341797,9.536998748779297)
                close()
            }
}

public val LucideIcons.All.MousePointerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointer: ImageVector
    @Composable get() = MousePointerDefinition.asImageVector()
