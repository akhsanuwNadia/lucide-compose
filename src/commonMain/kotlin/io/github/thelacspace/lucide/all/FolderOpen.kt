package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                lineTo(7.5,11.100000381469727)
                curveTo(7.832287788391113,10.440078735351562,8.50133991241455,10.017114639282227,9.239999771118164,10.0)
                lineTo(20.0,10.0)
                curveTo(20.619192123413086,9.998913764953613,21.203968048095703,10.284684181213379,21.583574295043945,10.773866653442383)
                curveTo(21.963178634643555,11.26304817199707,22.094799041748047,11.900469779968262,21.940000534057617,12.5)
                lineTo(20.400001525878906,18.5)
                curveTo(20.170761108398438,19.387928009033203,19.367021560668945,20.006189346313477,18.450000762939453,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(7.900000095367432,3.0)
                curveTo(8.579667091369629,2.9933364391326904,9.216197967529297,3.3323171138763428,9.59000015258789,3.9000000953674316)
                lineTo(10.40000057220459,5.100000381469727)
                curveTo(10.769923210144043,5.6617207527160645,11.397414207458496,5.999889850616455,12.070000648498535,6.000000476837158)
                lineTo(18.0,6.000000476837158)
                curveTo(19.104568481445312,6.000000476837158,20.0,6.895430564880371,20.0,8.0)
                lineTo(20.0,10.0)
            }
}

public val LucideIcons.All.FolderOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderOpen: ImageVector
    @Composable get() = FolderOpenDefinition.asImageVector()
