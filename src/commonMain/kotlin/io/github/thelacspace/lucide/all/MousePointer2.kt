package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointer2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0370001792907715,4.688000202178955)
                curveTo(3.9562387466430664,4.501616477966309,3.9975428581237793,4.284810543060303,4.141176700592041,4.141176700592041)
                curveTo(4.284810543060303,3.9975428581237793,4.501616477966309,3.9562387466430664,4.688000202178955,4.0370001792907715)
                lineTo(20.687999725341797,10.53700065612793)
                curveTo(20.887531280517578,10.618291854858398,21.012548446655273,10.818256378173828,20.998247146606445,11.033235549926758)
                curveTo(20.983945846557617,11.248215675354004,20.833539962768555,11.42985725402832,20.625,11.484001159667969)
                lineTo(14.500999450683594,13.064001083374023)
                curveTo(13.7963285446167,13.245159149169922,13.245628356933594,13.794710159301758,13.062999725341797,14.499000549316406)
                lineTo(11.483999252319336,20.625)
                curveTo(11.429855346679688,20.833539962768555,11.248213768005371,20.983945846557617,11.033233642578125,20.998247146606445)
                curveTo(10.818254470825195,21.012548446655273,10.618289947509766,20.887531280517578,10.536998748779297,20.687999725341797)
                close()
            }
}

public val LucideIcons.All.MousePointer2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointer2: ImageVector
    @Composable get() = MousePointer2Definition.asImageVector()
