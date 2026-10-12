package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishSymbol") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                curveTo(2.0f,16.0f,11.0f,1.0f,22.0f,12.0f)
                curveTo(11.0f,23.0f,2.0f,8.0f,2.0f,8.0f)
            }
}

public val LucideIcons.All.FishSymbolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishSymbol: ImageVector
    @Composable get() = FishSymbolDefinition.asImageVector()
