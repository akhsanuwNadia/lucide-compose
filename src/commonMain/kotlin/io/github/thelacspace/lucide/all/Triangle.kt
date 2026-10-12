package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Triangle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.729999542236328,4.0)
                curveTo(13.372201919555664,3.383195638656616,12.713068008422852,3.0035436153411865,12.0,3.0035436153411865)
                curveTo(11.286931037902832,3.0035436153411865,10.62779712677002,3.383195638656616,10.269999504089355,4.0)
                lineTo(2.2699995040893555,18.0)
                curveTo(1.9129165410995483,18.618484497070312,1.9127209186553955,19.38044548034668,2.269486427307129,19.999113082885742)
                curveTo(2.6262519359588623,20.617780685424805,3.285835027694702,20.999267578125,4.0,21.0)
                lineTo(20.0,21.0)
                curveTo(20.71416473388672,20.999267578125,21.373746871948242,20.617780685424805,21.730512619018555,19.999113082885742)
                curveTo(22.087278366088867,19.380443572998047,22.087081909179688,18.618484497070312,21.729999542236328,18.0)
                close()
            }
}

public val LucideIcons.All.TriangleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Triangle: ImageVector
    @Composable get() = TriangleDefinition.asImageVector()
