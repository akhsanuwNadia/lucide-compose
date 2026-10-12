package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.399999618530273,20.399999618530273)
                curveTo(20.030738830566406,20.77682876586914,19.527538299560547,20.99248504638672,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.002232789993286,4.470423221588135,3.214412212371826,3.963350534439087,3.5899999141693115,3.5900001525878906)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,15.300000190734863)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(8.699999809265137,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(2.0,2.0)
            }
}

public val LucideIcons.All.SquareOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareOff: ImageVector
    @Composable get() = SquareOffDefinition.asImageVector()
