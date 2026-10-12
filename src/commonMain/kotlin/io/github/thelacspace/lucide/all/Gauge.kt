package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gauge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(16.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.34f,19.0f)
                curveTo(0.9132542f,14.797246f,1.854384f,9.458777f,5.571994f,6.3392243f)
                curveTo(9.289604f,3.2196717f,14.710396f,3.2196717f,18.428005f,6.3392243f)
                curveTo(22.145617f,9.458777f,23.086746f,14.797246f,20.66f,19.0f)
            }
}

public val LucideIcons.All.GaugeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gauge: ImageVector
    @Composable get() = GaugeDefinition.asImageVector()
