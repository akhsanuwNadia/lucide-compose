package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishSymbol") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,16.0)
                curveTo(2.0,16.0,11.0,1.0,22.0,12.0)
                curveTo(11.0,23.0,2.0,8.0,2.0,8.0)
            }
}

public val LucideIcons.All.FishSymbolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishSymbol: ImageVector
    @Composable get() = FishSymbolDefinition.asImageVector()
