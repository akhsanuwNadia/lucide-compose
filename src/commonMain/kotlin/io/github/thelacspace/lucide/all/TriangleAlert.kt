package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TriangleAlert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.729999542236328,18.0)
                lineTo(13.729999542236328,4.0)
                curveTo(13.374876976013184,3.3733792304992676,12.710253715515137,2.9861037731170654,11.989999771118164,2.9861037731170654)
                curveTo(11.269745826721191,2.9861037731170654,10.605122566223145,3.3733792304992676,10.25,4.0)
                lineTo(2.25,18.0)
                curveTo(1.8910892009735107,18.621583938598633,1.8927860260009766,19.387834548950195,2.254446268081665,20.007823944091797)
                curveTo(2.6161065101623535,20.627811431884766,3.2822654247283936,21.006458282470703,4.0,21.0)
                lineTo(20.0,21.0)
                curveTo(20.71416473388672,20.999267578125,21.373746871948242,20.617780685424805,21.730512619018555,19.999113082885742)
                curveTo(22.087278366088867,19.380443572998047,22.087081909179688,18.618484497070312,21.729999542236328,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,9.0)
                lineTo(12.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.010000228881836,17.0)
            }
}

public val LucideIcons.All.TriangleAlertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TriangleAlert: ImageVector
    @Composable get() = TriangleAlertDefinition.asImageVector()
