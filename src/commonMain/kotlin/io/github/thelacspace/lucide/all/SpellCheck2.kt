package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SpellCheck2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,16.0)
                lineTo(12.0,4.0)
                lineTo(18.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(16.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,21.0)
                curveTo(5.099999904632568,21.0,5.099999904632568,20.0,6.300000190734863,20.0)
                curveTo(7.500000476837158,20.0,7.400000095367432,21.0,8.600000381469727,21.0)
                curveTo(9.700000762939453,21.0,9.700000762939453,20.0,10.90000057220459,20.0)
                curveTo(12.000000953674316,20.0,12.000000953674316,21.0,13.200000762939453,21.0)
                curveTo(14.30000114440918,21.0,14.30000114440918,20.0,15.500000953674316,20.0)
                curveTo(16.600000381469727,20.0,16.600000381469727,21.0,17.80000114440918,21.0)
                curveTo(18.900001525878906,21.0,18.900001525878906,20.0,20.100000381469727,20.0)
            }
}

public val LucideIcons.All.SpellCheck2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SpellCheck2: ImageVector
    @Composable get() = SpellCheck2Definition.asImageVector()
