package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Delete") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,5.0)
                curveTo(9.503081321716309,5.000028133392334,9.023968696594238,5.185042858123779,8.656000137329102,5.519000053405762)
                lineTo(2.328000068664551,11.258999824523926)
                curveTo(2.1191532611846924,11.448543548583984,2.000056505203247,11.717464447021484,2.000056505203247,11.999500274658203)
                curveTo(2.000056505203247,12.281535148620605,2.1191532611846924,12.550456047058105,2.328000068664551,12.739999771118164)
                lineTo(8.656000137329102,18.480998992919922)
                curveTo(9.023968696594238,18.814956665039062,9.503081321716309,18.999971389770508,10.0,19.0)
                lineTo(20.0,19.0)
                curveTo(21.104570388793945,19.0,22.0,18.104570388793945,22.0,17.0)
                lineTo(22.0,7.0)
                curveTo(22.0,5.895430564880371,21.104570388793945,5.0,20.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,9.0)
                lineTo(18.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,9.0)
                lineTo(12.0,15.0)
            }
}

public val LucideIcons.All.DeleteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Delete: ImageVector
    @Composable get() = DeleteDefinition.asImageVector()
