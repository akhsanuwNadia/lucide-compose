package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DollarSign") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,5.0f)
                lineTo(9.5f,5.0f)
                curveTo(7.573113f,5.0086174f,6.0156174f,6.573094f,6.0156174f,8.5f)
                curveTo(6.0156174f,10.426906f,7.573113f,11.991383f,9.5f,12.0f)
                lineTo(14.5f,12.0f)
                curveTo(16.426888f,12.008617f,17.984383f,13.573094f,17.984383f,15.5f)
                curveTo(17.984383f,17.426907f,16.426888f,18.991383f,14.5f,19.0f)
                lineTo(6.0f,19.0f)
            }
}

public val LucideIcons.All.DollarSignDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DollarSign: ImageVector
    @Composable get() = DollarSignDefinition.asImageVector()
