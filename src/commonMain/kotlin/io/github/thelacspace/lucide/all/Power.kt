package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Power") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.399999618530273,6.599999904632568)
                curveTo(21.908578872680664,10.109870910644531,21.913818359375,15.797508239746094,18.411714553833008,19.313838958740234)
                curveTo(14.909608840942383,22.830169677734375,9.221997261047363,22.847984313964844,5.697932243347168,19.353662490844727)
                curveTo(2.1738674640655518,15.859339714050293,2.143476963043213,10.171781539916992,5.629999160766602,6.639999866485596)
            }
}

public val LucideIcons.All.PowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Power: ImageVector
    @Composable get() = PowerDefinition.asImageVector()
