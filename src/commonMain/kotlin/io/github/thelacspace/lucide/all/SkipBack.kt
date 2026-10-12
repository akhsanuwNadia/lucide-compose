package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SkipBack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.97100067138672,4.284999847412109)
                curveTo(18.588865280151367,3.9142775535583496,19.358381271362305,3.9045684337615967,19.985401153564453,4.259583473205566)
                curveTo(20.612422943115234,4.614598751068115,21.00000762939453,5.2794508934021,21.0,6.0)
                lineTo(21.0,18.0)
                curveTo(21.00000762939453,18.720548629760742,20.612422943115234,19.385400772094727,19.985401153564453,19.740415573120117)
                curveTo(19.358381271362305,20.09543228149414,18.588865280151367,20.085721969604492,17.97100067138672,19.71500015258789)
                lineTo(7.974000930786133,13.717000007629395)
                curveTo(7.370314121246338,13.356314659118652,7.0004143714904785,12.705079078674316,6.999799728393555,12.001850128173828)
                curveTo(6.999185085296631,11.29862117767334,7.367946147918701,10.646739959716797,7.971001148223877,10.28499984741211)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,20.0)
                lineTo(3.0,4.0)
            }
}

public val LucideIcons.All.SkipBackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SkipBack: ImageVector
    @Composable get() = SkipBackDefinition.asImageVector()
