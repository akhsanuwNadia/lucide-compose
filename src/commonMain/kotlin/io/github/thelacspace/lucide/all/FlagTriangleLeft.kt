package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlagTriangleLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(18.0f,2.8f)
                curveTo(18.000246f,2.5201676f,17.85426f,2.260546f,17.61503f,2.1153724f)
                curveTo(17.375801f,1.970199f,17.078104f,1.9605772f,16.83f,2.09f)
                lineTo(5.45f,7.78f)
                curveTo(5.1740074f,7.9136696f,4.9987116f,8.193342f,4.9987116f,8.5f)
                curveTo(4.9987116f,8.806659f,5.1740074f,9.086331f,5.45f,9.22f)
                lineTo(18.0f,15.5f)
            }
}

public val LucideIcons.All.FlagTriangleLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlagTriangleLeft: ImageVector
    @Composable get() = FlagTriangleLeftDefinition.asImageVector()
