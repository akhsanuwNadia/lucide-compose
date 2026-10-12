package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Power") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.4f,6.6f)
                curveTo(21.908579f,10.109871f,21.913818f,15.797508f,18.411715f,19.313839f)
                curveTo(14.909609f,22.83017f,9.221997f,22.847984f,5.6979322f,19.353662f)
                curveTo(2.1738675f,15.85934f,2.143477f,10.171782f,5.629999f,6.64f)
            }
}

public val LucideIcons.All.PowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Power: ImageVector
    @Composable get() = PowerDefinition.asImageVector()
