package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Option") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,3.0)
                lineTo(21.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(8.280000686645508,3.0)
                curveTo(8.710240364074707,3.000326633453369,9.092044830322266,3.275806427001953,9.22800064086914,3.684000015258789)
                lineTo(14.772001266479492,20.31599998474121)
                curveTo(14.908073425292969,20.72454261779785,15.290393829345703,21.000102996826172,15.721001625061035,21.0)
                lineTo(21.0,21.0)
            }
}

public val LucideIcons.All.OptionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Option: ImageVector
    @Composable get() = OptionDefinition.asImageVector()
