package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Toilet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                lineTo(20.0,12.0)
                curveTo(20.552284240722656,12.0,21.0,12.447714805603027,21.0,13.0)
                curveTo(21.0,15.76142406463623,18.761423110961914,18.0,16.0,18.0)
                lineTo(15.402000427246094,18.0)
                curveTo(15.220237731933594,18.0,15.052791595458984,18.0986385345459,14.964678764343262,18.25761604309082)
                curveTo(14.876565933227539,18.416593551635742,14.88166618347168,18.610864639282227,14.97800064086914,18.764999389648438)
                lineTo(16.522001266479492,21.23499870300293)
                curveTo(16.618335723876953,21.38913345336914,16.623435974121094,21.583404541015625,16.535322189331055,21.742382049560547)
                curveTo(16.44721031188965,21.90135955810547,16.27976417541504,21.999998092651367,16.09800148010254,21.999998092651367)
                lineTo(5.4019999504089355,21.999998092651367)
                curveTo(5.2202372550964355,21.999998092651367,5.052791118621826,21.90135955810547,4.9646782875061035,21.742382049560547)
                curveTo(4.876565456390381,21.583404541015625,4.88166618347168,21.38913345336914,4.978000164031982,21.23499870300293)
                lineTo(7.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                curveTo(5.238576412200928,18.0,3.0,15.76142406463623,3.0,13.0)
                lineTo(3.0,4.0)
                curveTo(3.0,2.895430564880371,3.895430564880371,2.0,5.0,2.0)
                lineTo(13.0,2.0)
                curveTo(14.104569435119629,2.0,15.0,2.895430564880371,15.0,4.0)
                lineTo(15.0,12.0)
            }
}

public val LucideIcons.All.ToiletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Toilet: ImageVector
    @Composable get() = ToiletDefinition.asImageVector()
